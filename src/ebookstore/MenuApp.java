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
public class MenuApp {
    
    public static void runMenu(Menu menu, Byte selection){
        
        if (menu.getMenuType().equalsIgnoreCase("main menu")){
            switch (selection){
                case 0:{
                    System.exit(0);
                }
                case 1:{
                    Menu categMenu = new EbookCategoryMenu();
                    runMenu(categMenu, categMenu.inputMenuOption());
                    break;
                }
                case 2:{
                    Ebook.sellBook(Ebook.getBookByISBN());
                    break;
                }
                case 3:{
                    Ebook.removeBook(Ebook.getBookByISBN());
                    break;
                }
                case 4:{
                    Ebook.listAllBooks();
                    break;
                }
                case 5:{
                    Ebook.displaySoldEbooks();
                    break;
                }
                case 6:{
                    Ebook.listAllAuthors();
                    break;
                }
                case 7:{
                    if (!(Ebook.getBookByISBN() == null)){
                        Ebook.updatePrice(Ebook.getBookByISBN(), new ValidInput().validInput("price"));
                    }
                    break;
                }
                case 8:{
                    Ebook.addRating(Ebook.getBookByISBN());
                    break;
                }
                case 9:{
                    Ebook.listBookRatingDetails(Ebook.getBookByISBN());
                    break;
                }
                case 10:{
                    ManualTest.testFunctionalityClass();
                    ManualTest.testAuthorClass();
                    ManualTest.testEbookClass();
                    System.out.println("***Please refer to ManualTest class "
                                        + "to change test conditions!");
                    break;
                }
                default:{
                    break;
                }
        
            }
        }else{
            if (menu.getMenuType().equalsIgnoreCase("category menu")){
                switch (selection){
                    case 1:{
                        Ebook technical = new TechnicalEbook();
                        technical.addBook(technical);                       
                        System.out.println("Technical eBook added! ( " 
                                + technical.getSubcategory() + " )");
                        break;
                    }
                    case 2:{
                        Ebook novel = new NovelEbook();
                        novel.addBook(novel);                       
                        System.out.println("Novel eBook added! ( " 
                                + novel.getSubcategory() + " )");
                        break;
                    }
                    case 3:{
                        Ebook artAlbum = new ArtAlbumEbook();
                        artAlbum.addBook(artAlbum);                       
                        System.out.println("Art Album eBook added! ( " 
                                + artAlbum.getSubcategory() + " )");
                        break;
                    }
                    default:{
                        break;
                    }
                }    
            }
        }
    }
}
