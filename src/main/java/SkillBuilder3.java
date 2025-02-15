/**
 * SkillBuilder3 is a class for completing
 *  Skill Builder 3 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder3
{
    private static String repeat(String s, int numOfTimesToRepeat)
    {
        String result = "";
        for (int i = 0; i < numOfTimesToRepeat; i++) {
            result += s;
        }
        return result;
    }
    public static String leftRightTriangle(int height)
    {
        String str = "";
        for (int i = 1; i <= height; i++) {
            str += repeat("", i) + "\n";
        }
        return str;
    }

    public static String rightRightTriangle(int height)
    {
        String str = "";
        for (int i = 1; i <= height; i++) {
            str += repeat(" ", height - i);
            str += repeat("", i) + "\n";
        }
        return str;
    }

    public static String circle(int radius)
    {
        String str = "";
        int x;
        for (int i = radius-1; i > -radius; i--) {

            x = (int) (Math.sqrt(Math.pow(radius, 2) - (Math.pow(i, 2))));

            str += repeat(" ", radius - x);
            str += repeat("", 2*x) + "\n";
        }
        return str;
    }

    public static long sumOfDivisors(long number) {
        long sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfect(long number){
        return sumOfDivisors(number) == number;
    }

    public static long sumOfDivisorsUsingWhile(long number){
        long sum = 0;
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
}
