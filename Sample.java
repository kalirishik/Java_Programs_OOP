public class Sample {
    public static void main(String[] args) {
        int a = 11;
        int b = 1;

        // Convert integers to binary strings
        String binaryA = Integer.toBinaryString(a);
        String binaryB = Integer.toBinaryString(b);

        // Print the binary representation of a and b
        System.out.println("Binary representation of a: " + binaryA);
        System.out.println("Binary representation of b: " + binaryB);

        // Convert binary strings back to integers and add them
        int sum = Integer.parseInt(binaryA, 2) + Integer.parseInt(binaryB, 2);

        // Convert the sum to a binary string
        String binarySum = Integer.toBinaryString(sum);

        // Print the sum in binary form
        System.out.println("Binary sum of a and b: " + binarySum);
    }
}
