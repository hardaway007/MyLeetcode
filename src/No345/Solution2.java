package No345;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hardaway on 2017/12/28.
 */
public class Solution2{
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] c = s.toCharArray();

        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !set.contains(c[i])) {
                i++;
            }
            while (i < j && !set.contains(c[j])) {
                j--;
            }
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
        return String.valueOf(c);
    }
}


