/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary;

import java.util.Set;

/**
 *
 * @author kossT
 */
public class TechnicalEbook extends Ebook{
    private static final String CATEGORY = "Technical";
    private final TechnicalEbookEnum technicalSubcategory;

    public TechnicalEbook() {
        super();
        this.technicalSubcategory = TechnicalEbookEnum.randomSubcategory();
    }

    public TechnicalEbook(TechnicalEbookEnum technicalSubcategory, String ISBN, String title, int noOfPages, Set<Author> listOfAuthors, double price) {
        super(ISBN, title, noOfPages, listOfAuthors, price);
        this.technicalSubcategory = technicalSubcategory;
    }
    
    @Override
    public String getSubcategory() {
        return "Subcategory: " + technicalSubcategory;
    }

    public static String getCATEGORY() {
        return CATEGORY;
    }    
    
    
}
