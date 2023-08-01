package com.example.itemviewer;

public interface ApiService {
    @GET("items")
    Call<List<Item>> getItems();
}
