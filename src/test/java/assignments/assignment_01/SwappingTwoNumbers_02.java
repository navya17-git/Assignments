package assignments.assignment_01;

public class SwappingTwoNumbers_02 {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;
         a = a + b;
         b = a - b;
         a = a - b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
