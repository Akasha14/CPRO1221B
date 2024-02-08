import java.util.Arrays;

public class NumberCruncherApp {
    public static void main(String[] args) {

        var numbers = new int[11];
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 51); // 0 to 50
            total += numbers[i];
        }
        Arrays.sort(numbers);
        printArray(numbers);

        // Calculate average (mean)
        double mean = (double) total / numbers.length;

        // Calculate median
        double median;
        median = numbers[numbers.length / 2];

        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(numbers);

        // Print results
        System.out.printf("Total: %d\n", total);
        System.out.printf("Count: %d\n", numbers.length);
        System.out.printf("Average: %.2f\n", mean);
        System.out.printf("Median: %.2f\n", median);
        System.out.printf("Standard Deviation: %.2f\n", standardDeviation);
    }

    public static void printArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Element # %d is %d\n", i, x[i]);
        }
    }

    public static double calculateStandardDeviation(int[] array) {
        double sum = 0.0;
        for (int num : array) {
            sum += num;
        }
        double mean = sum / array.length;
        double standardDeviation = 0.0;
        for (int num : array) {
            standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation / array.length);
    }
}