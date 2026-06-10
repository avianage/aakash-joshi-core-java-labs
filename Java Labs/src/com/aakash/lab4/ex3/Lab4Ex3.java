package com.aakash.lab4.ex3;

public class Lab4Ex3 {
	public static void main(String[] args) {
		System.out.println("Using an inheritance hierarchy, design a Java program to model items at a library (books, journal articles, videos, and CDs).\r\n"
				+ "\r\n"
				+ "    Implement an abstract superclass Item with common data: identification number, title, number of copies. Define constructors, getters, setters, equals, toString, print, checkIn, checkOut, addItem, etc.\r\n"
				+ "\r\n"
				+ "    Implement an abstract subclass WrittenItem (extends Item) with added private data: author.\r\n"
				+ "\r\n"
				+ "    Implement 2 subclasses of WrittenItem:\r\n"
				+ "        Book — no new private data; override/overload methods as needed.\r\n"
				+ "        JournalPaper — added private data: yearPublished; override/overload methods as needed.\r\n"
				+ "\r\n"
				+ "    Implement an abstract subclass MediaItem (extends Item) with added private data: runtime (integer).\r\n"
				+ "\r\n"
				+ "    Implement 2 subclasses of MediaItem:\r\n"
				+ "        Video — added private data: director, genre, yearReleased.\r\n"
				+ "        CD — added private data: artist, genre.\r\n"
				+ "\r\n"
				+ "Write the definitions of these classes and a client program demonstrating them in use.");
	
		System.out.println("--- Library System Testing ---");

        Book book = new Book(101, "Java Programming", 5, "James Gosling");
        book.checkOut();
        book.addItem(2);
        
        System.out.println();
        
        JournalPaper paper = new JournalPaper(201, "Tech Trends", 2, "Alan Turing", 2023);
        paper.print();
        
        System.out.println();
        
        Video video = new Video(301, "The Matrix", 3, 136, "Wachowskis", "Sci-Fi", 1999);
        video.print();
	
	}
}
