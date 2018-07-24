package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given

        Book book1 = new Book("No second chance", "Harlan Coben", LocalDate.of(2003, 4, 28));
        Book book2 = new Book("Don't let go", "Harlan Coben", LocalDate.of(2017,9,26));
        Book book3 = new Book("The Shining", "Stephen King", LocalDate.of(1977,1,28));
        Book book4 = new Book("The firm", "John Grisham", LocalDate.of(1991,2,1));
        Book book5 = new Book("All that remains", "Patricia Cornwell", LocalDate.of(1992,8,4));
        Book book6 = new Book("Behawiorysta", "Remigiusz Mroz", LocalDate.of(2016,10,26));

        Library library = new Library("The best books");
        final Set<Book> books = new HashSet<>();

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);

        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().add(new Book("Bastion", "Stephen King", LocalDate.of(2017, 9, 29)));

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        //Then
        Assert.assertEquals(7, library.getBooks().size());
        Assert.assertEquals(7, clonedLibrary.getBooks().size());
        Assert.assertEquals(6, deepClonedLibrary.getBooks().size());
    }
}
