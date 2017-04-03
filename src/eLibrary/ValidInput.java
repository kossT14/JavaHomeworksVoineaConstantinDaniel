
package eLibrary;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kossT
 */
public class ValidInput {
    private final Scanner sc = new Scanner(System.in);
    Functionality func = new Functionality();
    
    public String validInput(String input){
        String output = "";
        switch (input.replaceAll("\\s+", "").toLowerCase()){
            case "title":{
                System.out.println("Please enter eBook title: ");
                output = sc.nextLine();
                break;
            }
            case "noofpages":{
                int noOfPages = 0;
                do{
                    System.out.println("Please enter number of pages: ");
                    try {
                        noOfPages = sc.nextInt();
                        sc.nextLine();
                    }
                    catch(NumberFormatException | InputMismatchException e) {
                        System.out.println("Invalid input, "
                            + "please enter positive integer number!");
                        sc.nextLine();
                    }
                } while ( (noOfPages <= 0) && func.checkRetry(func.getInputFromScanner()) );
                output = String.valueOf(noOfPages);
                break;
            }
            case "price":{
                double price = -1;
                do{
                    System.out.println("Please enter eBook price "
                            + "as positive number (max 6 digits and up to 2 decimals,"
                            + " separated by \",\" :");
                    try {
                        price = sc.nextDouble();
                        sc.nextLine();
                        String string =Double.toString(price);
                        if ((string.substring(0,string.lastIndexOf(".")).length()>7)){
                           System.out.println("Price too high, please "
                                + "enter price using specified format !"); 
                        }else{
                            if (string.substring(string.lastIndexOf("."), string.length()).length()>3){
                                System.out.println("Too many decimals, please "
                                + "enter price using specified format !"); 
                            }
                        }
                    }
                    catch(NumberFormatException | InputMismatchException e) {
                        System.out.println("Invalid input, please "
                                + "enter price using specified format !");
                        sc.nextLine();
                    }
                } while ((!(Double.toString(price).matches("^\\d{1,6}.?\\d{0,2}$"))) 
                        && func.checkRetry(func.getInputFromScanner()) );
                output = String.valueOf(price);
                break;
            }
            case "rating":{
                float rating = -1;
                boolean onCatch = false;
                boolean isValid = false;
                do{
                    System.out.println("Please enter eBook rating "
                            + "using \"X,0\" or \"X,5\" format, X = [0-5] ");
                    try {
                        rating = sc.nextFloat();
                        isValid = String.valueOf(rating).matches(""
                        + "^0.5|1|1.0|1.5|2|2.0|2.5|3|3.0|3.5|4|4.0|4.5|5|5.0$");
                        sc.nextLine();
                    }
                    catch(NumberFormatException | InputMismatchException e) {
                        System.out.println("Invalid input, please "
                                + "enter rating using specified format");
                        onCatch = true;
                        sc.nextLine();
                    }
                    if (!onCatch && !isValid){
                        System.out.println("Invalid input, please "
                                + "enter rating using specified format");
                    }
                } while (( !(isValid)) && func.checkRetry(func.getInputFromScanner()) );
                output = String.valueOf(rating);
                break;
            }
            case "isbn":{
                System.out.println("Please refer to an eBook by typing the ISBN:");
                output = sc.nextLine().replaceAll("\\s+", "");
                break;
            }
            case "mainmenu":{
                int option = -1;
                do{
                    new MainMenu().displayMenu();
                    try {
                        option = sc.nextInt();
                        sc.nextLine();
                    }
                    catch(NumberFormatException | InputMismatchException e) {
                        System.out.println("Invalid input, please "
                                + "enter available option!");
                        sc.nextLine();
                    }
                } while (( !(String.valueOf(option).matches("^0|1|2|3|4|5|6|7|8$"))) 
                        && func.checkRetry(func.getInputFromScanner()) );
                output = String.valueOf(option);
                break;
            }
            case "categorymenu":{
                int option = -1;
                do{
                    new EbookCategoryMenu().displayMenu();
                    try {
                        option = sc.nextInt();
                        sc.nextLine();
                    }
                    catch(NumberFormatException | InputMismatchException e) {
                        System.out.println("Invalid input, please "
                                + "enter available option!");
                        sc.nextLine();
                    }
                } while (( !(String.valueOf(option).matches("^1|2|3$"))) 
                        && func.checkRetry(func.getInputFromScanner()) );
                output = String.valueOf(option);
                break;
            }
            case "category":{
                String option;
                int b = 0;
                do{
                    new EbookCategoryMenu().displayMenu();
                    option = sc.nextLine().replaceAll("\\s+", "");
                    if (option.matches("technical|novel|artalbum")){
                        output = option;
                    }else{
                        output = "";
                    }
                }while ( (output.equals("")) && func.checkRetry(func.getInputFromScanner()) );
                break;
            }
            case "description":{
                System.out.println("Please enter new description: "
                            + "(max 255 characters)");
                output = Functionality.limitDescription(sc.nextLine(), 255);                   
                break;
            }
            case "name":{
                String name;
                boolean valid = false;
                do{
                    System.out.println("Please enter author name: (must start with a letter)");
                    name = sc. nextLine();
                    if (Character.isLetter(name.charAt(0))){
                        valid = true;
                        output = name;    
                    }else{
                        System.out.println("Invalid input!Begin name with a letter!");
                        func.checkRetry(func.getInputFromScanner());
                    }                    
                }while (!valid);
                break;
            }
            case "surname":{
                String name;
                boolean valid = false;
                do{
                    System.out.println("Please enter author surname: (must start with a letter)");
                    name = sc. nextLine();
                    if (Character.isLetter(name.charAt(0))){
                        valid = true;
                        output = name;    
                    }else{
                        System.out.println("Invalid input!Begin surname with a letter!");
                        func.checkRetry(func.getInputFromScanner());
                    }                    
                }while (!valid);
                break;
            }
            case "name_or_surname":{
                String choice;
                boolean valid = false;
                do{
                    System.out.println("Specify field to update: (\"Name\" or \"Surname\")");
                    choice = sc. nextLine().replaceAll("\\s+", "").toLowerCase();
                    if ((choice.matches("name")) || (choice.matches("surname")) ){
                        valid = true;
                        output = choice;    
                    }else{
                        System.out.println("Invalid input!");
                        func.checkRetry(func.getInputFromScanner());
                    }                    
                }while (!valid);
                break;
            }    
            case "ebook_details_to_update":{
                String choice;
                boolean valid = false;
                do{
                    System.out.println("Specify field to update: (\"Title\", \"Number of pages\", \"Rating\" or \"Price\")");
                    choice = sc. nextLine().replaceAll("\\s+", "").toLowerCase();
                    if ((choice.matches("title")) || (choice.matches("numberofpages"))
                            || (choice.matches("rating")) || (choice.matches("price"))){
                        valid = true;
                        output = choice;    
                    }else{
                        System.out.println("Invalid input!");
                        func.checkRetry(func.getInputFromScanner());
                    }                    
                }while (!valid);
                break;
            }     
            case "field_to_sort_by":{
                String choice;
                boolean valid = false;
                do{
                    System.out.println("Specify field to sort by: (\"Rating\", \"Price\" or \"Both\")");
                    choice = sc. nextLine().replaceAll("\\s+", "").toLowerCase();
                    if ((choice.matches("rating")) || (choice.matches("price"))
                            || (choice.matches("both")) ){
                        valid = true;
                        output = choice;    
                    }else{
                        System.out.println("Invalid input!");
                        func.checkRetry(func.getInputFromScanner());
                    }                    
                }while (!valid);
                break;
            }     
            case "select_rating_field":{
                String choice;
                boolean valid = false;
                do{
                    System.out.println("Specify rating field: (\"Rating\" or \"Description\")");
                    choice = sc. nextLine().replaceAll("\\s+", "").toLowerCase();
                    if ((choice.matches("rating")) || (choice.matches("description"))){
                        valid = true;
                        output = choice;    
                    }else{
                        System.out.println("Invalid input!");
                        func.checkRetry(func.getInputFromScanner());
                    }                    
                }while (!valid);
                break;
            }     
            case "username":{
                String name;
                boolean valid = false;
                do{
                    System.out.println("Please enter username: (must start with a letter)");
                    name = sc. nextLine();
                    if (Character.isLetter(name.charAt(0))){
                        valid = true;
                        output = name;    
                    }else{                        
                        System.out.println("Invalid input!Begin username with a letter!");
                        func.checkRetry(func.getInputFromScanner());
                    }                    
                }while (!valid);
                break;
            }
            default:{
                break;
            }
        }
        return output;
    }
    
}

