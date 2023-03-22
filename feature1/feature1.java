package fullStackDeveloper;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Feature1 {
	
	String path="C:\\Users\\1931923\\Documents\\GTM DB";
	File directory= new File(path);
	String contents[] = directory.list();
	ArrayList<String> ar = new ArrayList<String>();
	Scanner sc= new Scanner(System.in);
	
	public void search() {
		//list all files
		for(int i=0; i<contents.length; i++) {
			  ar.add(contents[i]);  
		      }
		
		  ar.sort(Comparator.naturalOrder());
    System.out.println("List of files and directories in the specified directory:");
    Iterator<String> itr = ar.iterator();
    while(itr.hasNext()) {
  	  System.out.println(itr.next());
    }
	}
}
