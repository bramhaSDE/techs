import java.util.Arrays;

public class LongestPrefix {

    public static void main(String[] args) {
        String[] strs = {"bramha",""};
        String ans = longestPrefix(strs);
        System.out.println(ans);
    }


    public static String longestPrefix(String[] strs){
        String ans="";
        if(strs.length==1){
            return strs[0];
        }

        Arrays.sort(strs);

        int x=0,y=0;

        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        while (x<s1.length() && y<s2.length()){

            if(s1.charAt(x) == s2.charAt(y)){

                ans+=s1.charAt(x);
                x++;
                y++;

            }
            else{
                break;
            }

        }

        return ans;
    }
}
