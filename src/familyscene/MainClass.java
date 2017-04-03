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
public class MainClass {
    
    public static void main(String args[]) {
        Thread tv = new Tv(new Husband(new Wife(new Cigar()), new VacuumCleaner()));
        tv.start();
    }
}
