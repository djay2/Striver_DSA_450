public class ModuloPower {

    // Function to compute (base^exponent) % modulus
    public static long modPower(long base, long exponent, long modulus) {
        if (modulus == 1) return 0;  // Any number mod 1 is 0

        long result = 1;
        base = base % modulus;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {  // If exponent is odd
                result = (result * base) % modulus;
            }

            base = (base * base) % modulus;  // Square the base
            exponent >>= 1;  // Divide exponent by 2
        }

        return result;
    }

    public static void main(String[] args) {
        long a = 3;
        long b = 13;
        long m = 100;

        System.out.println(modPower(a, b, m));  // Output: 23
    }
}
