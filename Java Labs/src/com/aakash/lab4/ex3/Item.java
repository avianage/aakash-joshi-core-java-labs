package com.aakash.lab4.ex3;

import java.util.Objects;

abstract class Item {
    private int identificationNumber;
    private String title;
    private int numberOfCopies;

    public Item(int identificationNumber, String title, int numberOfCopies) {
        this.identificationNumber = identificationNumber;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    // Getters and Setters
    public int getIdentificationNumber() { return identificationNumber; }
    public void setIdentificationNumber(int identificationNumber) { this.identificationNumber = identificationNumber; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getNumberOfCopies() { return numberOfCopies; }
    public void setNumberOfCopies(int numberOfCopies) { this.numberOfCopies = numberOfCopies; }

    // Common Methods
    public void checkIn() {
        numberOfCopies++;
        System.out.println("1 copy checked in. Total available: " + numberOfCopies);
    }

    public void checkOut() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            System.out.println("1 copy checked out. Total available: " + numberOfCopies);
        } else {
            System.out.println("Error: No copies available to check out.");
        }
    }

    public void addItem(int count) {
        this.numberOfCopies += count;
        System.out.println(count + " copies added. New total: " + this.numberOfCopies);
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return identificationNumber == item.identificationNumber &&
               numberOfCopies == item.numberOfCopies &&
               Objects.equals(title, item.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificationNumber, title, numberOfCopies);
    }

    @Override
    public String toString() {
        return "ID: " + identificationNumber + ", Title: '" + title + "', Copies: " + numberOfCopies;
    }
}

// 2. ABSTRACT SUBCLASS: WrittenItem
abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int identificationNumber, String title, int numberOfCopies, String author) {
        super(identificationNumber, title, numberOfCopies);
        this.author = author;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }
}

// 3. SUBCLASS OF WRITTENITEM: Book
class Book extends WrittenItem {
    public Book(int identificationNumber, String title, int numberOfCopies, String author) {
        super(identificationNumber, title, numberOfCopies, author);
    }
    // No new private data needed; utilizes WrittenItem/Item methods
}

// 4. SUBCLASS OF WRITTENITEM: JournalPaper
class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int identificationNumber, String title, int numberOfCopies, String author, int yearPublished) {
        super(identificationNumber, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() { return yearPublished; }
    public void setYearPublished(int yearPublished) { this.yearPublished = yearPublished; }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }
}

// 5. ABSTRACT SUBCLASS: MediaItem
abstract class MediaItem extends Item {
    private int runtime; // in minutes

    public MediaItem(int identificationNumber, String title, int numberOfCopies, int runtime) {
        super(identificationNumber, title, numberOfCopies);
        this.runtime = runtime;
    }

    public int getRuntime() { return runtime; }
    public void setRuntime(int runtime) { this.runtime = runtime; }

    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " mins";
    }
}

// 6. SUBCLASS OF MEDIAITEM: Video
class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(int identificationNumber, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
        super(identificationNumber, title, numberOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    // Getters, Setters, toString overrides...
    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Genre: " + genre + ", Released: " + yearReleased;
    }
}

// 7. SUBCLASS OF MEDIAITEM: CD
class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int identificationNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {
        super(identificationNumber, title, numberOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }
}
