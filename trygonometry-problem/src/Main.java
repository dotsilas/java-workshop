import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        /*
        * The goal of this exercise is to solve the hypotenuse of a right triangle,
        * given the lengths of the other two sides.
        * Note that the formula for calculating the hypotenuse of a right-angled triangle
        * is as follows: h2 = a2 + b2
        * */

        double a, b, h;
        a = 3; // first side of triangle
        b = 4; // second side of triangle

        h = Math.sqrt((a*a) + (b*b));
        String message = MessageFormat.format("The hypotenuse of a right-angled " +
                "triangle with sides of {0} and {1} is {2}", a, b, h);
        System.out.println(message);
    }
}