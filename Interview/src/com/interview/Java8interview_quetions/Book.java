package com.interview.Java8interview_quetions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 class BookInfo 
{
	
	private String title;
	private String auther;
	private int year;
	private double price;
  
	
	
	public BookInfo(String title, String auther, int year, double price) {
		super();
		this.title = title;
		this.auther = auther;
		this.year = year;
		this.price = price;
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return auther;
	}
	public void setAuther(String auther) {
		this.auther = auther;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book {title=" + title + ","
				+ " auther=" + auther + ","
				+ "year=" + year + ","
				+ "price=" + price + "}";
	}
	
}
	public class Book
	{
		
		public static void main(String[] args) {
			
			
					List<BookInfo> bookinfo =Arrays.asList(
							
							new BookInfo("Midnight's Children", "Salman", 1981, 499),
							new BookInfo("The White Tiger", "Arvind", 2008, 350),
							new BookInfo("A Suitable Boy", "Vikram ", 1993, 599),
							new BookInfo("Interpreter of Maladies", "Jhumpa  ", 1999, 200),
							new BookInfo("The God of Small Things", "Arundhati", 1997, 100));
					
					
				//	1. Print the titles of books published after 2000
							
							
					 bookinfo.stream().filter(book -> book.getYear() > 2000).map(BookInfo::getTitle)
					                     .forEach(System.out::println);
					 
							
					
					// 2 . Calculate the total price of all books
					 
					 double sum= bookinfo.stream().mapToDouble(BookInfo::getPrice).sum();
					 
					 System.out.println("the total price of all books :- "+sum);
					
					// 3. Find the book with the highest price
					 
					 
					// 4. Create a new list with books priced less than $40
					 
				List<BookInfo> books=	 bookinfo.stream().filter(book -> book.getPrice()< 300).collect(Collectors.toList());
					 System.out.println(books.toString());
			
		}
	}
	
	
  

