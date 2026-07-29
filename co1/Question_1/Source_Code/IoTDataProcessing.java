import java.util.Scanner;

public class IoTDataProcessing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("IoT Data Processing Pipeline");

        System.out.print("Enter the number of sensor records (n): ");
        int n = sc.nextInt();

        int levels = calculateLevels(n);

        double work = n * (Math.log(n) / Math.log(2));

        System.out.println("\nMaster Theorem Analysis");
        System.out.println("---------------------------");

        System.out.println("Recurrence:");
        System.out.println("T(n) = 3T(n/3) + n log n");

        System.out.println("\na = 3");
        System.out.println("b = 3");
        System.out.println("f(n) = n log n");

        System.out.println("\nlog_b(a) = log3(3) = 1");

        System.out.println("n^(log_b a) = n");

        System.out.println("\nf(n) = n log n");

        System.out.println("Since n log n = Θ(n log¹n)");

        System.out.println("Master Theorem Case 2");

        System.out.println("\nTime Complexity:");

        System.out.println("T(n) = Θ(n log² n)");

        System.out.println("\nApproximate Recursion Levels = " + levels);

        System.out.printf("Approximate Processing Cost = %.2f\n", work);

        System.out.println("\nInterpretation:");

        System.out.println("The divide-and-conquer IoT algorithm scales efficiently.");
        System.out.println("Even for very large sensor datasets,");
        System.out.println("the increase in execution time is close to n(log n)^2.");

    }

    static int calculateLevels(int n) {

        int level = 0;

        while (n > 1) {
            n = n / 3;
            level++;
        }

        return level;
    }

}