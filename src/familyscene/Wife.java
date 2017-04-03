/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * a-sti.ro
 */
package familyscene;

import java.util.Random;


/**
 *
 * @author kossT
 * Implementing a new thread extending class Thread
 */
public class Wife extends Thread {
    private final Thread womanCigar;
    private final TvShows herFavouriteShow;
    
    public Wife(Thread cigar){
        super("Wife");
        this.womanCigar = cigar;
        this.herFavouriteShow = TvShows.values()[(new Random()).nextInt(TvShows.values().length)];
    }
    @Override
    public void run() { 
        System.out.println("Wife enters the scene. ");
        womanCigar.start();
        while (true) {
            synchronized(this){
                try {
                    System.out.println("Wife is sleeping.");
                    wait();
                }
                catch (InterruptedException e) {
                    System.out.println("Wife is awake!");
                    System.out.println("The woman will put aside the cigar...");
                    womanCigar.interrupt();
                    System.out.println(" and will enjoy her favourite show: "
                            + herFavouriteShow);
                    break;
                }
            }    
        }
    }

    public TvShows getHerFavouriteShow() {
        return herFavouriteShow;
    }
    
    
}
