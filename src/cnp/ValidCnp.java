/*
 * ValidCnp class
 */
package cnp;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implementation of a series of methods used for validating CNP input
 * @author kossT
 */
public class ValidCnp {
    boolean validCnp;
    String validatedCnp;
    private static final Map<String, String> COUNTRY_ZONE = new HashMap<>();
    static{
        COUNTRY_ZONE.put("01", "Alba");
        COUNTRY_ZONE.put("02", "Arad");
        COUNTRY_ZONE.put("03", "Argeş");
        COUNTRY_ZONE.put("04", "Bacău");
        COUNTRY_ZONE.put("05", "Bihor");
        COUNTRY_ZONE.put("06", "Bistriţa-Năsăud");
        COUNTRY_ZONE.put("07", "Botoşani");
        COUNTRY_ZONE.put("08", "Braşov");
        COUNTRY_ZONE.put("09", "Brăila");
        COUNTRY_ZONE.put("10", "Buzău");
        COUNTRY_ZONE.put("11", "Caraş-Severin");
        COUNTRY_ZONE.put("12", "Cluj");
        COUNTRY_ZONE.put("13", "Constanţa");
        COUNTRY_ZONE.put("14", "Covasna");
        COUNTRY_ZONE.put("15", "Dâmboviţa");
        COUNTRY_ZONE.put("16", "Dolj");
        COUNTRY_ZONE.put("17", "Galaţi");
        COUNTRY_ZONE.put("18", "Gorj");
        COUNTRY_ZONE.put("19", "Harghita");
        COUNTRY_ZONE.put("20", "Hunedoara");
        COUNTRY_ZONE.put("21", "Ialomiţa");
        COUNTRY_ZONE.put("22", "Iaşi");
        COUNTRY_ZONE.put("23", "Ilfov");
        COUNTRY_ZONE.put("24", "Maramureş");
        COUNTRY_ZONE.put("25", "Mehedinţi");
        COUNTRY_ZONE.put("26", "Mureş");
        COUNTRY_ZONE.put("27", "Neamţ");
        COUNTRY_ZONE.put("28", "Olt");
        COUNTRY_ZONE.put("29", "Prahova");
        COUNTRY_ZONE.put("30", "Satu Mare");
        COUNTRY_ZONE.put("31", "Sălaj");
        COUNTRY_ZONE.put("32", "Sibiu");
        COUNTRY_ZONE.put("33", "Suceava");
        COUNTRY_ZONE.put("34", "Teleorman");
        COUNTRY_ZONE.put("35", "Timiş");
        COUNTRY_ZONE.put("36", "Tulcea");
        COUNTRY_ZONE.put("37", "Vaslui");
        COUNTRY_ZONE.put("38", "Vâlcea");
        COUNTRY_ZONE.put("39", "Vrancea");
        COUNTRY_ZONE.put("40", "Bucureşti");
        COUNTRY_ZONE.put("41", "Bucureşti, Sector 1");
        COUNTRY_ZONE.put("42", "Bucureşti, Sector 2");
        COUNTRY_ZONE.put("43", "Bucureşti, Sector 3");
        COUNTRY_ZONE.put("44", "Bucureşti, Sector 4");
        COUNTRY_ZONE.put("45", "Bucureşti, Sector 5");
        COUNTRY_ZONE.put("46", "Bucureşti, Sector 6");
        COUNTRY_ZONE.put("51", "Calaraşi");
        COUNTRY_ZONE.put("52", "Giurgiu");
    }
    private enum Months {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }
    // Digits used to computing checksum/ checkdigit
    private static final int[] DIGITS_CHECKSUM = {2, 7, 9, 1, 4, 6, 3, 5, 8, 2, 7, 9};
    
    private String getGender(String cnp){
        char s = cnp.charAt(0);
        switch (s){
            case '1':
            case '3':
            case '5':{
                return "male";
            }
            case '7':{
                return "male resident";
            }       
            case '2':
            case '4':
            case '6':{
                return "female";
            }    
            case '8':{
                return "female resident";
            }
            // case '9'
            default:{
                return "gender undefined/ foreign citizen";
            }
        }
    }
    // Get the first 2 digits for year of birth
    private String getPrevCentury(String cnp){
        char s = cnp.charAt(0);
        switch (s){
            case '1':
            case '2':{
                return "19";
            }
            case '3':    
            case '4':{
                return "18";
            }
            case '5':    
            case '6':{
                return "20";
            }
            default:{
                return "19";
            }
        }
    }
    // Method returns the year of birth in full format (AAAA)
    private String getYearOfBirth(String cnp){
        String yy = cnp.substring(1, 3);
        return (getPrevCentury(cnp) + yy); 
    }
    // Method returns month of birth using String representation of an element in enum
    private String getMonthOfBirth(String cnp){
        String mm = cnp.substring(3, 5);
        for (Months m : Months.values()){
            // Enum elements start at index 0, 
            // while group of digits representing month start at 01 
            if ((m.ordinal() + 1) == (Integer.parseInt(mm))){
                return m.toString();
            }
        }
        return null;
    }
    
    private String getDayOfBirth(String cnp){
        return cnp.substring(5, 7);
    }
    // Method returns country zone of birth (from map value)
    private String getCountryZone(String cnp){
        String cz = cnp.substring(7, 9);
        for (Map.Entry<String, String> elem : COUNTRY_ZONE.entrySet()){
            if (elem.getKey().equals(cz)){
                return elem.getValue();
            }
        }
        return null;
    }
    // Method returns an estimated time of birth in that day
    // based on a personal approximation (empiric, for fun)
    private String getEstimatedTimeOfBirth(String cnp){
        String uniqueIdByDay = cnp.substring(9, 12);
        String estTime;
        int id = Integer.parseInt(uniqueIdByDay);
        if (id <= 100){
            estTime = "early in the morning";
        }else{
            if (id <= 200){
                estTime = "in the morning";
            }else{
                if (id <= 400){
                    estTime = "around middday";
                }else{
                    if (id <= 600){
                        estTime = "in the afternoon";
                    }else{
                        if (id <= 750){
                            estTime = "late in the afternoon";
                        }else{
                            if (id <= 900){
                                estTime = "in the evening";
                            }else{
                                estTime = "late in the evening";
                            }
                        }
                    } 
                }
            }
        }
        return estTime;
    }
    
    private boolean validCheckDigit(String cnp){
        int checkSum = 0;
        boolean isValid = false;
        // Every digit in CNP is multiplied by the corresponding digit (same index)
        // in the following number: 279146358279 (represented in DIGITS_CHECKSUM)
        for(int i = 0 ; i<12 ; i++){
             checkSum += ((Character.getNumericValue(cnp.charAt(i))) * DIGITS_CHECKSUM[i]);
        }
        if ((checkSum % 11) == (Character.getNumericValue(cnp.charAt(12)))){
            isValid = true;
        }else{
            // If the remainder is 10, it will count as 1
            if (((checkSum % 11) == 10) && (Character.getNumericValue(cnp.charAt(12)) == 1)){
                isValid = true;
            }
        }
        return isValid;
    }
    // Leap year if divisible by 4 and not by 100
    // OR divisible by 100 and by 400
    private boolean validLeapYear(String cnp){
        boolean isValid;
        if (!(Integer.parseInt(getYearOfBirth(cnp)) % 4 == 0)){
            isValid = false;
        }else{
            if (!(Integer.parseInt(getYearOfBirth(cnp)) % 100 == 0)){
                    isValid = true;
                }else
                    if (!(Integer.parseInt(getYearOfBirth(cnp)) % 400 == 0)){
                        isValid = false;
                    }else{
                        isValid = true;
                    }
                        
        }
        return isValid;
    }
    
    private void checkIfValidCnp(String cnp){
        String regex = "[1-9]" //gender = digit 1 to 9 
                + "[0-9]{2}"// year of birth = 00 to 99
                + "((02((0[1-9])|(1[0-9])|(2[0-9])))" // if february: 01 to 29
                + "|(((01)|(03)|(05)|(07)|(08)|(10)|(12))((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1])))" // if month of birth has 31 days
                + "|(((04)|(06)|(09)|(11))((0[1-9])|(1[0-9])|(2[0-9])|(30))))" // if month of birth has 30 days
                + "((0[1-9])|([1-3][0-9]|(4[0-6])|(5[1-2])))" // country zone 01 to 46 or 51 or 52
                + "((00[1-9])|(0[1-9][0-9])|([1-9][0-9][0-9]))"  // serial number 000 to 999
                + "[0-9]"; // check digit 0 to 9
        Pattern pattern = Pattern.compile(regex);
        // create the matcher as result of applying regex on source string
        Matcher matcher = pattern.matcher(cnp);
        // if the regular expression or pattern was found
        if (matcher.find()) { 
            if (validCheckDigit(cnp)){
                if ((cnp.substring(3, 5).equals("02")) && (cnp.substring(5, 7).equals("29"))){
                    if (validLeapYear(cnp)){
                        validCnp = true;
                        validatedCnp = cnp;
                        System.out.println("Valid CNP!");
                    }else{
                        validCnp = false;
                        System.out.println("Invalid CNP format! Please review first 7 digits!");
                    } 
                }else{
                    validCnp = true;
                    validatedCnp = cnp;
                    System.out.println("Valid CNP!");
                }
            }else{
                validCnp = false;
                System.out.println("Invalid CNP format! Please check last digit!");
            }
        }else{
            System.out.println("Invalid CNP format! Please review your input!");
        }    
    }
    
    private void displayDetails(){
        System.out.println("Y o u r   p e r s o n a l   d e t a i l s : "
                + "\n\t- You are a " + getGender(validatedCnp) + ", born on "
                + getDayOfBirth(validatedCnp) + " " + getMonthOfBirth(validatedCnp)
                + " " + getYearOfBirth(validatedCnp) + "\n\t- Place of birth: "
                + getCountryZone(validatedCnp) + "\n\t- Time of the day: probably "
                + getEstimatedTimeOfBirth(validatedCnp) + "  :)");
    }
    
    void runValidater(String cnp){
        checkIfValidCnp(cnp);
        if (validCnp){
            displayDetails();
        }
    }
}
