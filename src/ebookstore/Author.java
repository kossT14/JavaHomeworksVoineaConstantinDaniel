/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebookstore;

/**
 *
 * @author kossT
 */
public class Author {
    private final int Id;
    private final String name;
    private final String surname;

    public Author(int Id, String name, String surname) {
        this.Id = Id;
        this.name = name;
        this.surname = surname;
    }
    
    public Author() {
        this.Id = Functionality.createID();
        this.name = new ValidInput().validInput("name");
        this.surname = new ValidInput().validInput("surname");
    }
    
     public static void addAuthors(Ebook eb){
        do{
            Author aut = new Author();
            Collections.getAllAuthors().add(aut); 
            eb.getListOfAuthors().add(aut);
            System.out.println("Add another author for this eBook? (y/n)");
        }while ((new Functionality().checkRetry(new Functionality().getInputFromScanner())));
    }
    
    public static void displayAuthorsDetails(){
        System.out.println("All available authors: "
                    + "\n\t   ID      Name        Surname"
                    + "\n\t  ==============================");
        for (Author aut : Collections.getAllAuthors()){
                System.out.println("\t  " + aut.getId() + "        " 
                        + aut.getName() + "         " + aut.getSurname());
            }
    }
    
    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    
    
}
