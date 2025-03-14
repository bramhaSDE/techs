public class RotateString {

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        boolean isRotate = chechIfStringRotates(s,goal);
        System.out.println(isRotate);
    }

    public static boolean chechIfStringRotates(String s,String goal) {
        boolean result = false;
        String rotated = "";
        if (s.length() != goal.length()) {

            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            rotated = s.substring(i) +
                       s.substring(0, i);
        if (rotated.equals(goal)) {
            result = true;
        }
    }

        return result;
    }
}
