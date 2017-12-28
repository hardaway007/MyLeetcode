package no345;

import java.util.Arrays;

/**
 * Created by hardaway on 2017/12/28.
 */
//改进的双指针法，耗时最少
public class Solution3 {
    public static boolean isVowel(char a){
        switch(a){
            case ('a') : return true;
            case ('e') : return true;
            case ('i') : return true;
            case ('o') : return true;
            case ('u') : return true;
            case ('A') : return true;
            case ('E') : return true;
            case ('I') : return true;
            case ('O') : return true;
            case ('U') : return true;
            default : return false;
        }
    }

    public static String reverseVowels(String s) {
        if (s.length()<2) return s;

        char[] tab = s.toCharArray();
        int j = tab.length - 1;
        int i = 0;

        while( i < j ) {

            if (!isVowel(tab[i]))
                i++;
            else {
                while (j!=i && !isVowel(tab[j]))
                    j--;

                char temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
                i++;
                j--;
            }
        }
        return new String(tab);
    }


}