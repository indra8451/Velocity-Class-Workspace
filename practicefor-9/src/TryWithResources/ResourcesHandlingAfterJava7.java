package TryWithResources;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class ResourcesHandlingAfterJava7 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\demo.txt");
         
        try(FileOutputStream localFos = fos)     //OR  try(FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\demo.txt"))
        {
            //Using the resources
             
            fos.write("Aadesh!!!Alkha Nirjan".getBytes());
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
         
        //No need to close the resources explicitly.
        //Resources are implicitly closed.
    }
}