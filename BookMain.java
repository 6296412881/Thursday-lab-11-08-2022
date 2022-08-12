package booksystem;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc=new Scanner(System.in);
		BookService bservice=new BookService();
		System.out.println("Welcome to book service system");
		do {
		System.out.println("\n1.create Book\n2.for get book details by id"
				+ "\n3.get all the book details\n4.Quit");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			
			bservice.createBook();
			break;
		case 2:
			BookService.SreachById();
			break;
		case 3:
			BookService.getAllBookDetails();
			break;
		case 4:
			System.exit(0);
			
		}
		
		}
		while(ch !=4);
		System.out.println("Thanks for visit us");
	}
}
		
		
		