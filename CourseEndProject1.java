package fullStackDeveloper;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CourseEndProject1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		int choice;
		char ch;
		Feature1 f1 = new Feature1();
		Feature2 f2 = new Feature2();
		WelcomeScreen ws = new WelcomeScreen();
		
		ws.welcomescreen();
		
		Scanner sc=new Scanner(System.in);
		try {
		do
		{
		System.out.println("************************************************");
		System.out.println("1. List all the files from current directory");
		System.out.println("2. The details of the user interface");
		System.out.println("3. Navigate Back");
		System.out.println("************************************************");
		System.out.println("Enter your option");
		System.out.println("************************************************");
		
		 choice= sc.nextInt();
		System.out.println("************************************************");
		switch(choice)
		{
		
		case 1:
		      f1.search();	
		      break;
			
		
		case 2:
		{
			f2.Option2();
			break;
		}
		case 3:
			System.out.println("To Navigate back to Choose the Options from the Application(Y/N)");
			break;
			
		default:
			
			System.out.println("your choice is incorrect. ");
			break;
		}
		System.out.println("********************************************************");
		System.out.println("Do you want to continue the Application Operations(Y/N)");
		System.out.println("********************************************************");
		 ch= sc.next().charAt(0);
		 
		}while(ch=='y'|| ch=='Y');
		}catch(InputMismatchException e) {
			System.out.println("Enter a choice type other than numbers");
		}
		sc.close();
		
}
}


