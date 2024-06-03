package ru.netology.diff;

public class Book extends Product {
    private String author;
    private int pages;
    private int publishedYear;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public boolean isTooExpensive() {
        if (price > 10_000) {
            return true;
        } else {
            return false;
        }
    }
}
