/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kossT
 */
public class Collections {
    
    private static Set<Ebook> allEbooks = new HashSet<>();
    private static Set<Author> allAuthors = new HashSet<>();
    private static Map<Ebook,Set<Author>> eBookAuthorsMap = new HashMap<>();
    private static Map<Ebook,List<Rating>> eBookRatings = new HashMap<>();
    private static Map<Ebook,List<Rating>> soldEbook = new HashMap<>();
    private static Set<User> allUsers = new HashSet<>();
    private static Map<User,List<Rating>> userRatings = new HashMap<>();

    
    public static Set<Ebook> getAllEbooks() {
        return allEbooks;
    }

    public static Set<Author> getAllAuthors() {
        return allAuthors;
    }
    
    public static Map<Ebook, Set<Author>> geteBookAuthorsMap() {
        return eBookAuthorsMap;
    }

    public static Map<Ebook, List<Rating>> geteBookRatings() {
        return eBookRatings;
    }

    public static Map<Ebook, List<Rating>> getSoldEbook() {
        return soldEbook;
    }

    public static Set<User> getAllUsers() {
        return allUsers;
    }

    public static Map<User, List<Rating>> getUserRatings() {
        return userRatings;
    }

        
    
    
}
