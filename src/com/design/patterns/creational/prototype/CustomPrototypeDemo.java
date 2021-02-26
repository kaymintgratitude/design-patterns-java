package com.design.patterns.creational.prototype;

public class CustomPrototypeDemo {

    public static void main(String[] args){

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("The best ever movie");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getPrice());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie secondMovie = (Movie) registry.createItem("Movie");
        movie.setTitle("The best ever movie in the universe 2");

        System.out.println(secondMovie);
        System.out.println(secondMovie.getRuntime());
        System.out.println(secondMovie.getPrice());
        System.out.println(secondMovie.getTitle());
        System.out.println(secondMovie.getUrl());

        Book book = (Book) registry.createItem("Book");
        book.setTitle("Alibaba and 40 thieves");

        System.out.println(book.getNumberOfPages());
        System.out.println(book.getPrice());
        System.out.println(book.getTitle());
        System.out.println(book.getUrl());
    }
}
