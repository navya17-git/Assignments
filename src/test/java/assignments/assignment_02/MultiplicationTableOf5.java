package assignments.assignment_02;

public class MultiplicationTableOf5 {

    public static void main(String[] args) {
        int i = 5;
        int c = 1;
        System.out.println("Using while loop:");
        while(i<=50) {
            System.out.println("5*" + c + "=" + i);
            c++;
            i+=5;
        }

        System.out.println("\nUsing for loop:");
        for(int k=5,n=1; k<=50; k+=5,n++) {
            System.out.println("5*" + n + "=" + k);
        }


    }
}
