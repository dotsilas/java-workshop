import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        // Strings
        String t = "";
        System.out.println(t);
        t = t + "Joe ...";
        System.out.println(t);
        t = t + "Joe ... hola";
        System.out.println(t);

        // Some math
        int result;
        result = 1 + 1;
        double result2 = result * 3.3;
        double result3 = result2 / 5;

        // other mathematical operators
        int numberToSqrt = 144;
        int result4 = (int)sqrt(numberToSqrt); // raíz
        System.out.println(result4);

        //min and max
        int minimal = Math.min(10, 15);
        int maximal = Math.max(10, 15);
        System.out.println(minimal + maximal);
        double numberToRound = (double)(minimal + maximal) / 2;
        System.out.println(Math.round(numberToRound));
    }
}