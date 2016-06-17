package customFurnish;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class count_Max_3_Words_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fileName = "temp.txt";
		String line = null;
		System.out.println(System.currentTimeMillis());
		FileReader fileReader = new FileReader(fileName);

		BufferedReader bufferedReader = new BufferedReader(fileReader);
		int i=0,j=0,k=0;
		String a="",b="",c="";
		HashMap<String,Integer> m=new HashMap<String,Integer>();
		while((line = bufferedReader.readLine()) != null) 
		{
			String[] splited = line.split("\\s+");
			for(int x=0;x<splited.length;x++)
			{
				if(m.containsKey(splited[x]))
				{
					//System.out.println(Arrays.toString(splited));
					m.put(splited[x],m.get(splited[x])+1);
					//System.out.println(m.get(splited[x]));
					if(!a.equals(splited[x]) && m.get(splited[x])>i )
					{
						k=j;
						j=i;
						i=m.get(splited[x]);
						c=b;
						b=a;
						a=splited[x];
					}
					else if(!splited[x].equals(a) && !b.equals(splited[x]) && m.get(splited[x])>j)
					{
						//System.out.println("here::: "+a+" "+splited[x]);
						k=j;
						j=m.get(splited[x]);
						c=b;
						b=splited[x];
					}
					else if( !splited[x].equals(a) && !b.equals(splited[x]) &&!c.equals(splited[x]) && m.get(splited[x])>k)
					{
						k=m.get(splited[x]);
						c=splited[x];
					}
				}
				else
				{
					//System.out.println(splited[x]);
					m.put(splited[x],1);
					if(k>1)
					{
						continue;
					}
					else if(!a.equals(splited[x]) && m.get(splited[x])>i )
					{
						k=j;
						j=i;
						i=m.get(splited[x]);
						c=b;
						b=a;
						a=splited[x];
					}
					else if(!splited[x].equals(a) && !b.equals(splited[x]) && m.get(splited[x])>j)
					{
						k=j;
						j=m.get(splited[x]);
						c=b;
						b=splited[x];
					}
					else if(!splited[x].equals(a) && !b.equals(splited[x]) &&!c.equals(splited[x]) && m.get(splited[x])>k)
					{
						k=m.get(splited[x]);
						c=splited[x];
					}
				}
				//System.out.println(a+" , "+b+" , "+c);
			}
		}   
		System.out.println(a+" - "+m.get(a));
		System.out.println(b+" - "+m.get(b));
		System.out.println(c+" - "+m.get(c));
		System.out.println(System.currentTimeMillis());
		bufferedReader.close();         

	}

}
