package fullStackDeveloper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Feature2 {
	
	String filename;
	char ch1;
	int choice;
	char ch = 0;
	String path="C:\\Users\\1931923\\Documents\\GTM DB";
	File directory= new File(path);
	String contents[] = directory.list();
	ArrayList<String> ar = new ArrayList<String>();
	ArrayList<String> br=new ArrayList<String>();
	Scanner sc= new Scanner(System.in);
	
	public void Option2() throws IOException, InterruptedException {
		System.out.println("1. Add a file to the existing directory list");
		System.out.println("2. Delete a user specified file from the existing directory list");
		System.out.println("3. Search a user specified file from the main directory");
		System.out.println("************************************************");
		System.out.println("Enter the choice from Option 2");
		System.out.println("************************************************");
		
		try {
		int choice1=sc.nextInt();
		System.out.println("************************************************");
		switch(choice1) {
		case 1:
		System.out.println("Enter a file name to create");
		System.out.println("************************************************");
		 filename= sc.next().toLowerCase();
		 File f1=new File(path+"\\"+filename+".txt");
		 if(f1.exists()) {
			 System.out.println("************************************************");
			 System.out.println("File is already created with the given name");
			 
		 }
		 else {
		 f1.createNewFile();
		 System.out.println("************************************************");
		 System.out.println("Created a file with name "+filename);
		 
		 }
		 
//		 System.out.println(f1.getName());
//		 System.out.println(f1.getAbsolutePath());;
		break;
		
	    case 2:
		System.out.println("Enter a file name to delete");
		System.out.println("************************************************");
		String file1=sc.next();
		File f2 = new File(path+"\\"+file1+".txt");
		if(f2.exists()) {
		f2.delete();
		System.out.println("************************************************");
		System.out.println("Deleted the mentioned file");
		}
		else {
		System.out.println("************************************************");	
		System.out.println("File not find");
		}
		break;
	
	    case 3: 
	    System.out.println("Enter a file name to search");
	    System.out.println("************************************************");
	    String filename2=sc.next();
	    System.out.println("************************************************");
		System.out.println("Searching....");
		Thread.sleep(1000);
	    boolean flag=false;
		for(int i=0;i<contents.length;i++) {
			if(contents[i].equals(filename2)) {
				flag=true;
			}
		}
//		  for(int i=0; i<contents.length; i++) {
//				  br.add(contents[i]);  
//			      }
//			  br.sort(Comparator.naturalOrder());
//			  Thread.sleep(300);
//			  boolean flag=false;
//			  //System.out.println(br.size());
//			  Iterator<String> itr1 = br.iterator();
//			    while(itr1.hasNext()) {
//			  	  if(itr1.next()==(filename2)) {
//			  		  flag=true;
//		  	  }
////			    	if(flag==true) {
////			    		break;
////			    	}
//			    }
		  if(flag) {
			  System.out.println("************************************************");
			  System.out.println("File with name "+filename2+" is found in the path: "+directory.getAbsolutePath());
		  }
		  else {
			  System.out.println("************************************************");
			  System.out.println("File not found");
		  }
		break;
	    default: System.out.println("Invalid Choice");
	    break;
		}
		}catch(InputMismatchException e) {
			e.getMessage();
		}
}
}
