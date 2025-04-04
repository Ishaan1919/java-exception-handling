import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            int size = 4;
            int[] arr = new int[size];
            int divisor = 0;
            try{
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid array index");
                System.out.println(e.getMessage());
            }
//            try{
                System.out.println(arr[3]/divisor);
//            }
        } catch (ArithmeticException e){
            System.out.println("Can not divide by zero");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Some error occured");
            System.out.println(e.getMessage());
        }

//        try {
//            System.out.print("Enter the size of the array: ");
//            int size = scanner.nextInt();
//            int[] array = new int[size];
//
//            System.out.println("Enter " + size + " elements:");
//            for (int i = 0; i < size; i++) {
//                array[i] = scanner.nextInt();
//            }
//
//            System.out.print("Enter index to access: ");
//            int index = scanner.nextInt();
//
//            try {
//                System.out.print("Enter divisor: ");
//                int divisor = scanner.nextInt();
//
//                int result = array[index] / divisor;
//                System.out.println("Result: " + result);
//            } catch (ArithmeticException e) {
//                System.out.println("Cannot divide by zero!");
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Invalid array index!");
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter valid numbers.");
//        } finally {
//            scanner.close();
//        }
    }
}
