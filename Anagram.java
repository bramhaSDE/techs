public class Anagram {

    public static void main(String[] args) {
        String s = "abc";
        String t= "bca";

        boolean isAnagram = checkifAnagramOrNot(s,t);
        System.out.println(isAnagram);
    }

    public static boolean checkifAnagramOrNot(String s,String t){
    boolean isAnagram = false;
        int[] ans =new int[26];
        if(s.length()!=t.length()){
            return false;
        }

        for(char ch:s.toCharArray()){
            ans[ch-97]++; // ch-97 means ch means a and 97 means ASCII, always char-97 will give 1 count
        }

        for(char ch:t.toCharArray()){
            ans[ch-97]--;
        }

        for(int val:ans){
            if(val!=0){
                return false;
            }
            isAnagram=true;
        }
        return isAnagram;
    }
}
