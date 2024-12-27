package assignments.assignment_02;

public class ReverseStringUsingCharAt {

    public static void main(String[] args) {
        // Original string
        String original = "QAShastra Online Training";
        // Variable to store the reversed string
        String reversed = "";

        // Loop through the string in reverse order
        for (int i = original.length() - 1; i >= 0; i--) {
            // Use charAt() to get the character at position 'i'
            reversed += original.charAt(i);
        }

        // Print the reversed string
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
