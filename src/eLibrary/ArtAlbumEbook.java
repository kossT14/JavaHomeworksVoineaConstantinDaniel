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
public class ArtAlbumEbook extends Ebook{
    private static final String CATEGORY = "Art album";
    private final ArtAlbumEbookEnum artAlbumSubcategory;

    public ArtAlbumEbook() {
        super();
        this.artAlbumSubcategory = ArtAlbumEbookEnum.randomSubcategory();
    }

    public ArtAlbumEbook(ArtAlbumEbookEnum artAlbumSubcategory, String ISBN, String title, int noOfPages, Set<Author> listOfAuthors, double price) {
        super(ISBN, title, noOfPages, listOfAuthors, price);
        this.artAlbumSubcategory = artAlbumSubcategory;
    }   
    
    @Override
    public String getSubcategory() {
        return "Subcategory: " + artAlbumSubcategory;
    }

    public static String getCATEGORY() {
        return CATEGORY;
    }   
    
}
