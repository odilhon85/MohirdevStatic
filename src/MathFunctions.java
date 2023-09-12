public class MathFunctions {

    private static double PI;
    private static double E;

    static {
        PI = 3.14159265359;
        E = 2.71828182846;
    }

    public static double getAreaCircle(double radius) {
        return PI * radius * radius;
    }

    public static double getPowOfE(int powerNum) {
        return Math.pow(E, powerNum);
    }

    public static double heroneFormula(double a, double b, double c){
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

}
