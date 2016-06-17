package customFurnish;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class top_3_Repeated_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String fileName = "temp.txt";
	        String line = null;

	        try {
//	        	Calendar cal = Calendar.getInstance();
//	            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
//	            System.out.println( sdf.format(cal.getTime()) );
	        	 System.out.println(System.currentTimeMillis());
	            FileReader fileReader = new FileReader(fileName);
	            
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            int total=0;
	            while((line = bufferedReader.readLine()) != null) 
	            {
	            	String[] splited = line.split("\\s+");
	            	total=total+splited.length;
	                //System.out.println(line);
	            }   
	            System.out.println("Total words are:"+total);
	           // System.out.println( sdf1.format(cal1.getTime()) );
	            System.out.println(System.currentTimeMillis());
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
