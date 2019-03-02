import java.util.List;

public class Qualis {

    public static void main(String[] args) {
        System.out.println(breakPalindrome("aaaa"));
        System.out.println(numberOfWays(7));
    }

    public static String breakPalindrome(String s) {
        // Write your code here
        String result = s.replaceFirst("[b-z]", "a");
        if (result.equals(s))
            return "IMPOSSIBLE";
        else
            return result;
    }

    public static int collision(List<Integer> speed, int pos) {
        // Write your code here
        List<Integer> beforeData = speed.subList(0, pos);
        List<Integer> afterData = speed.subList(pos + 1, speed.size());
        int bcount = (int) beforeData.stream().filter(o -> o > speed.get(pos)).count();
        int acount = (int) afterData.stream().filter(o -> o < speed.get(pos)).count();
        return bcount + acount;
    }

    public static int numberOfWays(int n) {
        // Write your code here
        if(n==0)
            return 0;
        return ways(n);
    }

    private static int ways(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        return ways(n - 1) + ways(n - 3);
    }
}
