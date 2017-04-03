/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyscene;

import java.util.Random;

/**
 *
 * @author kossT
 */
public class Tv extends Thread{
    private final Thread husband;
    
    public Tv(Thread husband){
        this.husband = husband;
    }
    
    @Override
    public void run(){
        husband.start();
        System.out.println("Tv is running. Different tv shows are being displayed!");
        int i;
        try {
            synchronized(this){
                while(true) {
                    i = (new Random()).nextInt(TvShows.values().length);
                    System.out.println("Show currently running: " + TvShows.values()[i]);
                    if (TvShows.values()[i].equals(((Husband)husband).getWifeFavouriteShow())){
                        notifyAll();
                        throw new InterruptedException();
                    }    
                }
            }
        }
        catch (InterruptedException e) {
            husband.interrupt();
        }
    }
    
    
}
