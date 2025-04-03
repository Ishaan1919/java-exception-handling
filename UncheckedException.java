import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter Numerator: ");
            int a = input.nextInt();
            System.out.println("Enter Denominator: ");
            int b = input.nextInt();

            int ans = a/b;
            System.out.println(ans);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage() + " why are you trying to divide by 0, are you dum");
        }
        catch (InputMismatchException e){
            System.out.println("Don't you know that you have to enter integer values");
            System.out.println(e.getMessage());
        }
        finally {
            input.close();
        }

//        try {
//            System.out.print("Enter numerator: ");
//            int numerator = scanner.nextInt();
//
//            System.out.print("Enter denominator: ");
//            int denominator = scanner.nextInt();
//
//            int result = numerator / denominator;
//            System.out.println("Result: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("Cannot divide by zero.");
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter numeric values only.");
//        } finally {
//            scanner.close();
//        }
    }
}
