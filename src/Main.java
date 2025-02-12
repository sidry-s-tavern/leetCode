import java.sql.Time;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println("result:" + climbingStairs.climbStairs(45));
        System.out.println("result:" + climbingStairs.climbStairsLoop(45));
    }
}