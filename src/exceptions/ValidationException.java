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

class ValidationException extends Exception {
    
    public ValidationException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            int age = parseAge(args[0]);
        } catch (ValidationException e) {
            System.out.println("Invalid age argument: " + e.getMessage());
        }
    }
    
    static int parseAge(String age) throws ValidationException {
        int value;
        try {
            value = Integer.parseInt(age);
        }catch (NumberFormatException e){
            throw new ValidationException("should be an int");
        }
        if(value < 0 || value > 150) {
            throw new ValidationException("should be between 0 and 150 inclusive");
        }
        return value;
    }

}

