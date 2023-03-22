

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Feature1 {
	
	
	String path="E:\\New folder\\sandeep";
	File directory= new File(path);
	String contents[] = directory.list();
	ArrayList<String> ar = new ArrayList<String>();
	Scanner sc= new Scanner(System.in);

	public void search() throws InterruptedException {
		for(int i=0; i<contents.length; i++) {
			  ar.add(contents[i]);  
		      }
		
		  ar.sort(Comparator.naturalOrder());
    System.out.println("List of files and folders in the specified directory:");
    Thread.sleep(1000);
    Iterator<String> itr = ar.iterator();
    while(itr.hasNext()) {
    	Thread.sleep(300);
  	  System.out.println(itr.next());
    }
	}
}
