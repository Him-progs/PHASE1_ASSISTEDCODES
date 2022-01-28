import java.io.File;
import java.io.IOException;
import java .io.RandomAccessFile;
import java.lang.NumberFormatException;


public class crudOperations 
{

	public static void main(String data[])
	{
		System.out.println("\n------------------------------------\n");
        System.out.println("\tWelcome to Emp Conact Delatil Application \n");
        System.out.println("---------------------------------------");
        optionsSelection();
        
        try {
        	 
            // Get the name of the contact to be updated
            // from the Command line argument
            String newName = data[0];
 
            String nameNumberString;
            String name;
            long number;
            int index;
 
            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");
 
            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
 
            // Opening file in reading and write mode.
            RandomAccessFile raf
                = new RandomAccessFile(file, "rw");
            boolean found = false;
 
            // Checking whether the name of contact exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {
 
                // reading line from the file.
                nameNumberString = raf.readLine();
 
                // splitting the string to get name and
                // number
                String[] lineSplit
                    = nameNumberString.split("!");
 
                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);
 
                // if condition to find existence of record.
                if (name == newName) {
                    found = true;
                    break;
                }
            }
 
            // Delete the contact if record exists.
            if (found == true) {
 
                // Creating a temporary file
                // with file pointer as tmpFile.
                File tmpFile = new File("temp.txt");
 
                // Opening this temporary file
                // in ReadWrite Mode
                RandomAccessFile tmpraf
                    = new RandomAccessFile(tmpFile, "rw");
 
                // Set file pointer to start
                raf.seek(0);
 
                // Traversing the friendsContact.txt file
                while (raf.getFilePointer()
                       < raf.length()) {
 
                    // Reading the contact from the file
                    nameNumberString = raf.readLine();
 
                    index = nameNumberString.indexOf('!');
                    name = nameNumberString.substring(
                        0, index);
 
                    Object inputName = null;
					// Check if the fetched contact
                    // is the one to be deleted
                    if (name.equals(inputName)) {
 
                        // Skip inserting this contact
                        // into the temporary file
                        continue;
                    }
 
                    // Add this contact in the temporary
                    // file
                    tmpraf.writeBytes(nameNumberString);
 
                    // Add the line separator in the
                    // temporary file
                    tmpraf.writeBytes(
                        System.lineSeparator());
                }
 
                // The contact has been deleted now
                // So copy the updated content from
                // the temporary file to original file.
 
                // Set both files pointers to start
                raf.seek(0);
                tmpraf.seek(0);
 
                // Copy the contents from
                // the temporary file to original file.
                while (tmpraf.getFilePointer()
                       < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }
 
                // Set the length of the original file
                // to that of temporary.
                raf.setLength(tmpraf.length());
 
                // Closing the resources.
                tmpraf.close();
                raf.close();
 
                // Deleting the temporary file
                tmpFile.delete();
 
                System.out.println(" Friend deleted. ");
            }
 
            // The contact to be deleted
            // could not be found
            else {
 
                // Closing the resources.
                raf.close();
 
                // Print the message
                System.out.println(" Input name"
                                   + " does not exists. ");
            }
        }
 
        catch (IOException ioe) 
        {
            System.out.println(ioe);
        }

	
     }
	private static void optionsSelection()
	{
        String[] arr = {"1. I wish to review my expenditure",
                "2. I wish to add Emp Contact ",
                "3. I wish to delete details",
                "4. I wish to sort the Names",
                "5. I wish to search for a particular Emp",
                "6. Close the application" };
        int[] arr1 = {1,2,3,4,5,6};
        int slen = arr1.length;
        for ( int i=0;i<slen;i++)
        {
        	System.out.println(arr[i]);
        }
        
	}
	
	
}
