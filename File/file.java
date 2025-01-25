import java.io.File;
import java.io.IOException;
public class file{
    public static void main(String[] rags){
        try{
            File myfile = new File("Sadman.txt");
            if(myfile.createNewFile()){
                System.out.println("File Created\nName :  "+myfile.getName());
            }
        }
        catch(Exception ioe){
            System.out.println("Error Ocurred");
        }
    }
}