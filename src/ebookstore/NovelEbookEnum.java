/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebookstore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author kossT
 */
public enum NovelEbookEnum {
    FICTION, COMEDY, DRAMA, HORROR,
    NON_FICTION, REALISTIC_FICTION,
    ROMANCE, SATIRE, TRAGEDY, 
    TRAGICOMEDY, FANTASY;
    
    private static final List<NovelEbookEnum> VALUES =
        Collections.unmodifiableList(Arrays.asList(values()));
  
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static NovelEbookEnum randomSubcategory()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
