package String;

import java.util.ArrayList;
import java.util.List;

public class longestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        List<Character> list= new ArrayList<Character>();

        int start=0;
        int end=0;
        int maxLen=0;
        while (end<s.length()){
           if(!list.contains(s.charAt(end))){
               list.add(s.charAt(end));
               end++;
               maxLen=Math.max(maxLen, list.size());
           }
           else{
               list.remove(Character.valueOf(s.charAt(start)));
               start++;
           }
        }

        System.out.println("Maximum length of the substring is "+ maxLen);

    }
}




