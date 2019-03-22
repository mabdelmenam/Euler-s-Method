import java.util.ArrayList;
import java.util.Scanner;

public class eulerMethod{
    public static void main(String []args) {
        ArrayList<Double> time = new ArrayList<Double>();

        Scanner scan = new Scanner(System.in);
        System.out.print("Function: ");
        String func = scan.nextLine();

        //Numbers
        System.out.print("How many numbers? (including 0): ");
        int n = scan.nextInt();
        //Times
        for (int i = 0; i <= n; i++) {
            System.out.print("t" + i + " = ");
            if (scan.hasNextDouble()) {
                double t = scan.nextDouble();
                time.add(t);
            }
        }
        System.out.println("Initial Value");
        System.out.print("y(0)= ");
        double initY = scan.nextDouble();

        System.out.println("Step Size");
        System.out.print("h= ");
        double h = scan.nextDouble();

        //----------------------------------------------------
        //----------------------------------------------------
    }