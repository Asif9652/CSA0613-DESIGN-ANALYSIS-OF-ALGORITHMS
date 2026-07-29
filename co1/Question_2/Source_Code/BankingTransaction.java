package Question_2.Source_Code;


import java.util.Scanner;

public class BankingTransaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Banking Transaction Processing System");

        System.out.print("Enter the number of transactions (n): ");
        int n = sc.nextInt();

        int levels = calculateLevels(n);

        double work = n * n;

        System.out.println("\nMaster Theorem Analysis");
        System.out.println("-----------------------------");

        System.out.println("Recurrence:");
        System.out.println("T(n) = 4T(n/2) + n²");

        System.out.println("\na = 4");
        System.out.println("b = 2");
        System.out.println("f(n) = n²");

        System.out.println("\nlog₂(4) = 2");

        System.out.println("n^(log₂4) = n²");

        System.out.println("\nSince");
        System.out.println("f(n) = Θ(n²)");

        System.out.println("Master Theorem Case 2");

        System.out.println("\nTime Complexity:");

        System.out.println("T(n) = Θ(n² log n)");

        System.out.println("\nApproximate Recursion Levels = " + levels);

        System.out.printf("Approximate Processing Cost = %.2f\n", work);

        System.out.println("\nInterpretation:");

        System.out.println("The divide-and-conquer banking algorithm");
        System.out.println("processes large transaction volumes efficiently.");
        System.out.println("Its running time grows as n² log n.");

    }

    static int calculateLevels(int n) {

        int level = 0;

        while (n > 1) {
            n = n / 2;
            level++;
        }

        return level;
    }

}

