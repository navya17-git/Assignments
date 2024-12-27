package assignments.assignment_02;

public class TrafficLightProgram {

    public static void main(String[] args) {
        String light = "green";
        switch(light) {
            case "red":
            System.out.println(light + ": Stop" ); break;
            case "yellow":
            System.out.println(light + ": Ready" ); break;
            case "green":
            System.out.println(light + ": Go" ); break;
            default: System.out.println("Invalid choice");

        }
    }
}
