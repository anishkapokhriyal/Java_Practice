public class power {
    public static int power(int base, int exponent) {
        if (base == 0) {
            return 0;
        }
        if (exponent == 0) {
            return 1;
        }
        int p1 = power(base, exponent - 1);
        int p2 = base * p1;
        return p2;
    }
        public static void main(String args[]) {
            int base = 2; // Example base
            int exponent = 3; // Example exponent
            int result = power(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);

    }
}
