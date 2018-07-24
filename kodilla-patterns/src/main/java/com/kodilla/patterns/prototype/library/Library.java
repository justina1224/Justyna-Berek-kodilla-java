package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "   Library [" + name + "]\n";
        for(Book book : books) {
            s = s + "\n" + book.toString();
        }
        return s + "\n";
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepClonedLibrary = (Library)super.clone();
        deepClonedLibrary.books = new HashSet<>();
            for(Book book : books) {
                deepClonedLibrary.getBooks().add(book);
            }
        return deepClonedLibrary;
    }
}
