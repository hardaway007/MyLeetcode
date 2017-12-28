package No345;

/**
 * Created by hardaway on 2017/12/28.
 */

public class Solution1{
    public String reverseVowels(String s) {

        int[] location = new int[s.length()];
        char[] vowel=new char[s.length()];
        String ss ="";
        int index =0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||
                    s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                location[index] = i;
                vowel[index] =s.charAt(i);
                index++;
                //ss=ss+""+i;   字符串不停的重新创建，使得代码效率极低!!!!!!!
            }
        }
        char[] news = s.toCharArray();
        for(int i= 0;i<index;i++){
            news[location[i]]=vowel[index-1-i];
        }
        s = new String(news);
        return s;
    }
}