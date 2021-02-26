package com.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){
        Item item  = null;

        try{
            item = (Item) (items.get(type)).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return item;
    }

    private void loadItems(){
        Movie movie = new Movie();
        movie.setRuntime("3 hours");
        movie.setTitle("3 Idiots");
        movie.setPrice(100.00);
        items.put("Movie", movie);

        Book book = new Book();
        book.setNumberOfPages(1000);
        book.setTitle("Homo Sapiens");
        book.setPrice(99.89);
        items.put("Book", book);
    }
}
