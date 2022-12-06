package com.example.trafficsignapplication.helpers;

public class PhoneHelper {

    public static boolean regexPhoneValidationPattern(String tel) {
        // Set Pattern:
        String regex = "^\\d{10}$";

        if(tel.matches(regex)) {
            return true;
        }
        return false;
    }

}
