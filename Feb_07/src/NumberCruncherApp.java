import java.util.Arrays;

public class NumberCruncherApp {
    public static void main(String[] args) {

        var nums = new int[11];
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 101); // 0 to 100
            total += nums[i];
        }
        Arrays.sort(nums);
        printArray(nums);

        // get average
        double ave = (double) total / nums.length;

        // get median
        double median;
        median = nums[nums.length / 2];

        // get standard deviation
        double standardDeviation = getStandardDeviation(nums);

        // Print results
        System.out.printf("Total: %d\n", total);
        System.out.printf("Count: %d\n", nums.length);
        System.out.printf("Average: %.2f\n", ave);
        System.out.printf("Median: %.2f\n", median);
        System.out.printf("Standard Deviation: %.2f\n", standardDeviation);
    }

    public static double getStandardDeviation(int[] array) {
        double sum = 0.0;
        for (int num : array) {
            sum += num;
        }
        double ave = sum / array.length;
        double standardDeviation = 0.0;
        for (int num : array) {
            standardDeviation += Math.pow(num - ave, 2);
        }
        return Math.sqrt(standardDeviation / array.length);
    }
    public static void printArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.printf("Element # %d is %d\n", i, x[i]);
        }
    }
}