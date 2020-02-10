import java.io.*;

class FileCounter{
	public static void main(String[] args) {
		File file = new File("myfile.txt");
		try{
		StringBuilder sb = new StringBuilder("");
 	int i=1;
	BufferedReader br = new BufferedReader(new FileReader(file));
	String str = "";
	while((str = br.readLine()) != null)
	{
	    sb.append(i + ". " + str );
	    i++;
	}
	br.close();
	// fr.close();
	System.out.println("Contents from file are : " + sb);
	  } 
	catch (IOException e)
	   {System.out.println("Can't read from the file currently..."); }
	 }
	
	}