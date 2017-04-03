/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eLibrary;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author kossT
 */
public enum TechnicalEbookEnum {
    AGRICULTURE, CONSTRUCTION, ELECTROTECHNICS, 
    ELECTRONICS, MECHANICS, SCIENTIFIC_RESEARCH,
     AUTOMATION, AUTO_MOTO, ENERGETICS;
     
    private static final List<TechnicalEbookEnum> VALUES =
        Collections.unmodifiableList(Arrays.asList(values()));
  
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static TechnicalEbookEnum randomSubcategory()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
