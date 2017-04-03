/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * a-sti.ro
 */
package familyscene;
/**
 *
 * @author kossT
 * Implementing a new thread extending class Thread
 */
public class Husband extends Thread {
    private final Thread vacuumCleaner;
    private final Thread wife;
    
    public Husband(Thread wife, Thread vacuumCleaner){
        super("Husband");
        this.wife = wife;
        this.vacuumCleaner = vacuumCleaner;
    }
    @Override
    public void run() {
        System.out.println("Husband enters the scene. ");
        wife.start();
        vacuumCleaner.start();
        while (true) {
            synchronized(this){
                try {
                    System.out.println("Husband is vacuuming.");
                    sleep(1000);
                }    
                catch (InterruptedException e) {
                    System.out.println("The man has just turned off the vacuum cleaner.");
                    vacuumCleaner.interrupt();
                    System.out.println("He needs to wake up his wife.");
                    wife.interrupt();
                    break;
                }
            }    
        }
    }
    public TvShows getWifeFavouriteShow(){
        return ((Wife)wife).getHerFavouriteShow();
    }
    
}
