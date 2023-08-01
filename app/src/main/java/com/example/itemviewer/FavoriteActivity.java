package com.example.itemviewer;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FavoriteActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Fetch the favorite items from the list of items
        List<Item> items = adapter.getItems();
        List<Item> favoriteItems = new ArrayList<>();
        for (Item item : items) {
            if (item.isFavorite()) {
                favoriteItems.add(item);
            }
        }
        adapter = new ItemAdapter(favoriteItems);
        recyclerView.setAdapter(adapter);
    }
}
