package com.example.itemviewer;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Get the item object from the intent
        Item item = (Item) getIntent().getSerializableExtra("item");

        // Bind views
        ImageView itemImage = findViewById(R.id.itemImage);
        TextView itemTitle = findViewById(R.id.itemTitle);
        TextView itemDescription = findViewById(R.id.itemDescription);

        // Display item details on the detail screen
        itemImage.setImageResource(R.drawable.placeholder_image); // Replace with the actual image resource or load image from URL using Glide
        itemTitle.setText(item.getTitle());
        itemDescription.setText(item.getDescription());

        // You can add additional TextViews or other views to display more details about the item.
    }
}
