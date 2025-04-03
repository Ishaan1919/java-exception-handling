import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        String fileName = "data.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.print(e.getMessage());
//            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(fileName));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("File not found");
//        } catch (IOException e) {
//            System.out.println("An error occurred while reading the file.");
//        }
    }
}
