package com.ntuc.demos.loops;

import java.util.Scanner;

/**
 *
 * @author Sridhar Guzzu
 */
public class Vowels {

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        Vowels vw = new Vowels();
        String s = scan.next();
        System.out.println(vw.RemoveVowels(s));
    }

    String RemoveVowels(String s) {
        char[] rep = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) != 'a' && s.toLowerCase().charAt(i) != 'e' && s.toLowerCase().charAt(i) != 'i' && s.toLowerCase().charAt(i) != 'o' && s.toLowerCase().charAt(i) != 'u') {
                rep[i] = s.charAt(i);
            }
        }
        String res = new String(rep);
        return res;
    }
}

// capture the string
// loop thru the string
// check each character to see if it is a vowel
// if the check is true, then ignore that character
// if the check is false, then append that character to a new string.
// limitations of the code above
// does not address upper case characters

