public class Practice20 {
    private double value;

    // Constructors
    public Practice20() {
        // Default constructor, initializes value to 0
        this.value = 0;
    }

    public Practice20(double value) {
        // Parameterized constructor
        this.value = value;
    }

    // Getter and setter for value
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    // Boolean methods
    public boolean isZero() {
        return value == 0;
    }

    public boolean isPositive() {
        return value > 0;
    }

    public boolean isNegative() {
        return value < 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isPrime() {
        // Implementation for checking prime number
        // (you may replace this with your specific logic)
        // Assuming non-negative integers are considered
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isArmstrong() {
        // Implementation for checking Armstrong number
        // (you may replace this with your specific logic)
        // Assuming non-negative integers are considered
        int n = (int) value;
        int temp = n;
        int digits = (int) Math.log10(n) + 1;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == n;
    }

    // Double-returning methods
    public double getFactorial() {
        // Implementation for calculating factorial
        // (you may replace this with your specific logic)
        int n = (int) value;
        if (n < 0) {
            return Double.NaN; // Factorial is not defined for negative numbers
        }

        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double getSqrt() {
        return Math.sqrt(value);
    }

    public double getSqr() {
        return value * value;
    }

    public double sumDigits() {
        // Implementation for calculating the sum of digits
        // (you may replace this with your specific logic)
        int n = (int) Math.abs(value);
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public double getReverse() {
        // Implementation for reversing the digits
        // (you may replace this with your specific logic)
        int n = (int) value;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed;
    }

    // Void methods
    public void listFactors() {
        // Implementation for listing factors
        // (you may replace this with your specific logic)
        System.out.print("Factors of " + value + ": ");
        for (int i = 1; i <= Math.abs(value); i++) {
            if (value % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void dispBinary() {
        // Implementation for displaying binary representation
        // (you may replace this with your specific logic)
        System.out.println("Binary representation of " + value + ": " + Long.toBinaryString((long) value));
    }

    // Main method for testing
    public static void main(String[] args) {
        Practice20 num = new Practice20(15);

        System.out.println("isZero: " + num.isZero());
        System.out.println("isPositive: " + num.isPositive());
        System.out.println("isNegative: " + num.isNegative());
        System.out.println("isOdd: " + num.isOdd());
        System.out.println("isEven: " + num.isEven());
        System.out.println("isPrime: " + num.isPrime());
        System.out.println("isArmstrong: " + num.isArmstrong());

        System.out.println("getFactorial: " + num.getFactorial());
        System.out.println("getSqrt: " + num.getSqrt());
        System.out.println("getSqr: " + num.getSqr());
        System.out.println("sumDigits: " + num.sumDigits());
        System.out.println("getReverse: " + num.getReverse());

        num.listFactors();
        num.dispBinary();
    }
}
