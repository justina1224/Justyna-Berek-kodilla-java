package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianaCountingAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianCounting() {
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Stephen King", "Lsnienie", 1999, "1"));
        books.add(new Book("Remigiusz Mroz", "Nieodnaleziona", 2017, "2"));
        books.add(new Book("Remigiusz Mroz", "Hashtag", 2018, "3"));
        books.add(new Book("Harlan Coben", "Bez sladu", 2012, "4"));
        MedianaCountingAdapter adapter = new MedianaCountingAdapter();

        //When
        int median = adapter.publicationYearMedian(books);

        //Then
        Assert.assertEquals(2017, median);
    }
}
