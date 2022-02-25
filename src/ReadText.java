import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadText {

	public static void main(String[] args) throws IOException {
		
		//Using FileReader, BufferedReader, while loop, and readLine method
        
      FileReader fr=new FileReader("C:\\Users\\Anikm\\Downloads\\ReadFile.txt");
       BufferedReader br=new BufferedReader(fr);
       String str;
       while((str=br.readLine())!=null) {
    	   System.out.println(str);
       }
       
		
	     
		
	
         //Using Scanner, hasNextLine method and while loop
		/*
		 File file=new File("C:\\Users\\Anikm\\Downloads\\ReadFile.txt");
         Scanner sc=new Scanner(file);
           
          while(sc.hasNextLine()) {
          System.out.println(sc.nextLine());
        	 }
        */ 
         
         
		
         //Using Scanner next method and useDelimiter method
         /*
          File file=new File("C:\\Users\\Anikm\\Downloads\\ReadFile.txt");
         Scanner sc=new Scanner(file);
         sc.useDelimiter("\\z");
         System.out.println(sc.next());
         */
         
         
         
         
	}

}
