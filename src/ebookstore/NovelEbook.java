/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebookstore;

import java.util.Set;

/**
 *
 * @author kossT
 */
public class NovelEbook extends Ebook{
    private static final String CATEGORY = "Novel";
    private final NovelEbookEnum novelSubcategory;

    public NovelEbook(){ 
        super();
        this.novelSubcategory = NovelEbookEnum.randomSubcategory();
    }

    public NovelEbook(NovelEbookEnum novelSubcategory, String ISBN, String title, int noOfPages, Set<Author> listOfAuthors, double price) {
        super(ISBN, title, noOfPages, listOfAuthors, price);
        this.novelSubcategory = novelSubcategory;
    }
    
    @Override
    public String getSubcategory() {
        return "Subcategory: " + novelSubcategory;
    }

    public static String getCATEGORY() {
        return CATEGORY;
    }   
    
}
