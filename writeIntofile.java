import java.io.FileWriter;   
   
// Importing the IOException class for handling errors  
import java.io.IOException;   
   
class writeIntofile
{  
    public static void main(String[] args) {  
      
    try {  
        FileWriter fwrite = new FileWriter("D:writeIntofile.txt");  
        // writing the content into the FileOperationExample.txt file  
        fwrite.write("A named location used to store related information is referred to as a File.");   
   
        // Closing the stream  
        fwrite.close();   
        System.out.println("Content is successfully wrote to the file.");  
    } catch (IOException e) {  
        System.out.println("Unexpected error occurred");  
        e.printStackTrace();  
        }  
    }  
}  