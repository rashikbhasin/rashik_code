package customFurnish;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class total_Words_File {

	public static void main(String [] args) {

        String fileName = "temp.txt";
        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);
            
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int total=0;
            while((line = bufferedReader.readLine()) != null) 
            {
            	String[] splited = line.split("\\s+");
            	total=total+splited.length;
                System.out.println(line);
            }   
            System.out.println("Total words are:"+total);
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println( "Unable to open file '" +  fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '"  + fileName + "'");                  
        }
    }


}
