package edu;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class FileHandler {

	FileHandler(){}//Constructor
	//file delimiter
	private static final String FILE_DELIMITER = "\\^";
	public static final String DATA_FILE = "league.txt";
	

	
	
public static Map<String, ArrayList<String>> loadFileData(final String fileName) throws IOException {
        
        String temp;
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        try (BufferedReader bfr = new BufferedReader(new FileReader(fileName)))
        {
        	int count = 0;
        	
            while ((temp = bfr.readLine()) != null)
            {
            	ArrayList<String>tempArray = new ArrayList<String>();
            	count ++;
                String[] data = temp.split(FILE_DELIMITER);
                try{
                tempArray.add(data[0]);
                tempArray.add(data[1]);
                tempArray.add(data[2]);
                tempArray.add(data[3]);
                tempArray.add(data[4]);
                }catch(Exception E){
                	
                }
                //System.out.println(tempArray.get(2));
                map.put(count + "" , tempArray);
               // map.put(tempArray.get(2) , tempArray);
                
            }//end while
        }//end try
        return map;
    }//end Map
}//end class

	
	
	
	
