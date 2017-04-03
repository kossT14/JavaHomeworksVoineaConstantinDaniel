/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
* @author  Constantin-Daniel Voinea
* @version 1.0
* @since   2016-12-30
*/

public class CustomExceptions{
    

    static class BookingCapacityExceededException extends RuntimeException { 
        void tryBook(){
            try{
//                book();
            }catch(BookingCapacityExceededException e){
                //handle it
            }
        }
    }    

    private static class Booking {
        private final int maxCapacity = 200;
        private int capacityAvailable;
        
        public Booking() {
        }
        
        public Booking(int noBookings) {
            this.capacityAvailable = maxCapacity - noBookings;
        }

        public int getMaxCapacity() {
            return maxCapacity;
        }

        
        
       
//        static Booking book(){
//        
//            if(!isCapacityAvailable()) {
//                throw new BookingCapacityExceededException();
//            }
//            return Booking();
//        }
//    
//        static boolean isCapacityAvailable(){
//    
//        }

    }
    

}