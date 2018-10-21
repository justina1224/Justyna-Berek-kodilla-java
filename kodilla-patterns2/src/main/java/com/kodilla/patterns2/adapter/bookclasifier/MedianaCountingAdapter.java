package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianaCountingAdapter extends MedianaCountingAdaptee implements Classifier {
    private Book book;

    public MedianaCountingAdapter() {
        this.book = book;
    }

    @Override
    public int publicationYearMedian(Set<Book> bookset) {
        Map<String, Integer> booksMap = new HashMap<>();
        for(Book book : bookset) {
            booksMap.put(book.getSignature(), book.getPublicationYear());
        }
        if (booksMap.size() == 0) return 0;
        int[] years = new int [booksMap.size()];
        int n = 0;
        for(Map.Entry<String, Integer> entry : booksMap.entrySet()) {
            years[n] = entry.getValue();
            n++;
        }
        Arrays.sort(years);
        if (years.length % 2 == 0) {
            return years[(int) (years.length / 2 + 0.5)];
        } else {
            return years[years.length / 2];
        }
    }
}
