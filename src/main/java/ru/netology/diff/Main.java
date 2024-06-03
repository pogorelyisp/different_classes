 package ru.netology.diff;

public class Main {
    public static void main(String[] args) {
               //System.out.println("Hello world!");

        Book book = new Book();
        book.setPrice(12_000);
        book.isTooExpensive();
        System.out.println(book.isTooExpensive());
    }
}