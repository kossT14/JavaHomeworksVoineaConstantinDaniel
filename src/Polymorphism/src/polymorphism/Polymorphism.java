/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

import Shapes.Line;
import Shapes.Rectangle;
import Shapes.Square;
import Shapes.Triangle;

/**
 *
 * @author kossT
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Shape s = new Shape();
        Line l = new Line();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Square s = new Square();
        
        System.out.println("Definitia liniei este: " + l.getDEFINITION());
        System.out.println("Definitia triunghiului este: " + t.getDEFINITION());
        System.out.println("Definitia dreptunghiului este: " + r.getDEFINITION());
        System.out.println("Definitia patratului este: " + s.getDEFINITION());
    }
    
}
