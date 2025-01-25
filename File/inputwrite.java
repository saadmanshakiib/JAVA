import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class inputwrite {
        public static void main(String[] argsh){
            System.out.println();
            try(Scanner in = new Scanner(System.in)){
            try{
                File file = new File("input.txt");
                if(file.createNewFile()){
                    System.out.println("File Created");
                }
                FileWriter fw = new FileWriter("input.txt");
                System.out.println("Enter the line : ");
                String line = in.nextLine();
                fw.write(line);
                fw.close();
            }
            catch(IOException e){
                System.out.println("File Error");
            }
        }
        catch(Exception ioe){
            System.out.println("Input Error");
        }

    }
        
    }

