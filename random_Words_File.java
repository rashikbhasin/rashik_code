package customFurnish;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class random_Words_File {

	static final String char_arr="abcdefghijklmnopqrstuvwxyz";
	
	static int randNumber()
	{
		Random r=new Random();
		return r.nextInt(25);
	}
	
	static String randString(int x)
	{
		String s="";
		for(int i=0;i<x;i++)
		{
			s=s+char_arr.charAt(randNumber());
		}
		return s;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "temp3.txt";

		FileWriter fileWriter =	new FileWriter(fileName);

		BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);

		// Note that write() does not automatically
		// append a newline character.
		for(int i=0;i<1000;i++)
		{
			String str=randString(randNumber());
			bufferedWriter.write(str+" ");
			if(i%10==0)
				bufferedWriter.newLine();
		}
		bufferedWriter.close();


	}

}
