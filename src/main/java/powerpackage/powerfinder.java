package powerpackage;

public class PowerFinder {
    public static int power(int base, int exponent) {
        int power = base;
        for (int i = 0; i<exponent-1; i++) {
            power*=base;
        }
        return power;
    }
}
