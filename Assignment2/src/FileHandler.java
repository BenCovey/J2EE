
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class FileHandler {

	FileHandler(){}//Constructor
	//file delimiter
	private static final String FILE_DELIMITER = "\\,";
	public static final String DATA_FILE = "users.txt";
	

	
	
public static ArrayList<String[]> loadFileData(final String fileName) throws IOException {
        
        String temp;
        ArrayList<String[]> users = new ArrayList<String[]>();
        
        
        try (BufferedReader bfr = new BufferedReader(new FileReader("C:/Users/benvc/Desktop/EclispeProjects/Assignment2/myapp/WEB-INF/users.txt")))
        {
        	int count = 0;
        	
            while ((temp = bfr.readLine()) != null)
            {
            	ArrayList<String>tempArray = new ArrayList<String>();
            	
                String[] data = temp.split(FILE_DELIMITER);
                users.add(data);
                
                //System.out.println(users.get(count));
                count ++;
               // map.put(tempArray.get(2) , tempArray);
                
            }//end while
        }//end try
        return users;
    }//end Map
}//end class

	
	
	
	
