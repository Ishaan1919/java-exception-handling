import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter size");
            int size = scanner.nextInt();
            int[] arr = new int[size];
//            arr = null;

            System.out.println("Enter index");
            int index = scanner.nextInt();
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bound");
        }
        catch (NullPointerException e){
            System.out.println("Initialize the array first");
        }
        catch (Exception e){
            System.out.println("Some error occurred");
        }
        finally {
            scanner.close();
        }

//        try {
//            System.out.print("Enter the size of the array: ");
//            int size = scanner.nextInt();
//            int[] array = new int[size];
//
//            System.out.print("Enter index to retrieve: ");
//            int index = scanner.nextInt();
//
//            System.out.println("Value at index " + index + ": " + array[index]);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Invalid index!");
//        } catch (NullPointerException e) {
//            System.out.println("Array is not initialized!");
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter valid numbers.");
//        } finally {
//            scanner.close();
//        }
    }
}
