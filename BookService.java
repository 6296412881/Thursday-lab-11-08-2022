package booksystem;

import java.util.Scanner;

public class BookService {
	static Book book[]=new Book[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	//create Book method
		public void createBook()
		{
			int id;
			String bname;
			double price;
			System.out.println("enter Book Id: ");
			id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter Book Name: ");
			bname=sc.nextLine();
			System.out.println();
			System.out.println("enter the price");
			price=sc.nextDouble();
			 book[index]=new Book(id,bname,price);
			 index++;
			 System.out.println("Book details add successfully");
		}
		//get all book details
		public static void getAllBookDetails()
		{
			for(int i=0;i<index;i++)
			{
				System.out.println("Book Id: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookName());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("======================================================");
			}
		}
		
		//get book details based on id
		public static void SreachById()
		{
			System.out.println("Enter the Book Id: ");
			int sid=sc.nextInt();
			int i;
			for( i=0;i<index;i++)
			{
				if(book[i].getBookId()==sid)
				{
					System.out.println("Book Id: "+book[i].getBookId());
				System.out.println("Book Name: "+book[i].getBookName());
				System.out.println("Book Price: "+book[i].getBookPrice());
				System.out.println("======================================================");
				}
			}
			/*if(i==index)
				System.out.println("Book not found");*/
		}
}
		
	