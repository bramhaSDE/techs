public class StringSortBasedOnFreequency {

    public static void main(String[] args) {
        String s = "tree";

        String sortedArray = sortStringBasedOnFreequency(s);

    }

    public static String sortStringBasedOnFreequency(String s){
        String sortedAns = "";
            int[] ans =  new int[26];
                if(s.length()==1){
                    return s;
                }

                for(char ch:s.toCharArray()){
                    ans[ch-97]++;
                }


            return sortedAns;
    }
}
