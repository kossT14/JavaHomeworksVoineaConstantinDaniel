/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyscene;

/**
 *
 * @author kossT
 */
public class VacuumCleaner extends Thread{
    
    @Override
    public void run(){
        System.out.println("The man has turned on the vacuum cleaner. "
                + "Vacuum cleaner is running. ");
    }
}
