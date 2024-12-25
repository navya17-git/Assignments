package assignments.assignment_01;

public class SimpleInterestCal {
    public static void main(String[] args) {
        // Declare variables for principal, rate, and time
        int principal = 10000; // Example principal amount
        int rate = 5; // Example rate of interest (percentage)
        int time = 2; // Example time (in years)

        // Calculate Simple Interest using the formula
        int simpleInterest = (principal * rate * time) / 100;

        // Print the results
        System.out.println("Principal Amount: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Simple Interest: " + simpleInterest);
    }

}
