public class ClimbingStairs {
    public int climbStairs(int n) {
        switch (n) {
            case 0: return 0;
            case 1: return 1;
            case 2: return 2;
        }
        int[] stairs = new int[n + 1];
        stairs[0] = 0;
        stairs[1] = 1;
        stairs[2] = 2;
        for (int i = 3; i < stairs.length; i++) {
            stairs[i] = stairs[i - 1] + stairs[i - 2];
        }
        return stairs[stairs.length - 1];
    }

    public int climbStairsLoop(int n) {
        if (n == 2) return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
