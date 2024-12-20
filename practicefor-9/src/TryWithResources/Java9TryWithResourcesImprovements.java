package TryWithResources;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Java9TryWithResourcesImprovements 
{
    public static void main(String[] args) throws FileNotFoundException
    {
    	FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\demo.txt");
         
        try(fos)     //No need to declare resources locally
        {
            //Using the resources
             
            fos.write("हर हर महादेव".getBytes());
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
         
        //No need to close the resources explicitly.
        //Resources are implicitly closed
    }
}