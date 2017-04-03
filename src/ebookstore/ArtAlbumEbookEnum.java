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
public enum ArtAlbumEbookEnum {
    ALBUMS, MONUMENTAL_ART, POPULAR_ART,
    FINE_ARTS, VANGUARDISM, 
    CINEMATOGRAPHY, ART_HISTORY,
    ART_CRITIC, FOLKLORE, MUSIC,
    DRAMATURGY, PHOTOGRAPHY;

    private static final List<ArtAlbumEbookEnum> VALUES =
        Collections.unmodifiableList(Arrays.asList(values()));
  
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static ArtAlbumEbookEnum randomSubcategory()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}


