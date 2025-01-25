package read;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class readfile {
        public static void main(String[] fs){
            File Myfile = new File("readfile.txt");
            try{
                if(Myfile.createNewFile()){
                    System.out.println("File Created");
                }
                Scanner read = new Scanner(Myfile);
                while(read.hasNextLine()){
                    String data =  read.nextLine();
                    System.out.println(data);
                }
                read.close();
            }
            catch(IOException ioe){
                System.out.println("Error!!");
                ioe.printStackTrace();
            }
            catch(Exception e){
                System.out.println("Error");
            }
        }
}
