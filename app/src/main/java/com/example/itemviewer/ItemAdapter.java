package com.example.itemviewer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> items;

    public ItemAdapter(List<Item> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Item item = items.get(position);

        // Bind item data to the view
        holder.itemTitle.setText(item.getTitle());
        holder.favoriteIcon.setImageResource(item.isFavorite() ? R.drawable.ic_favorite : R.drawable.ic_favorite_outline);

        // Set a click listener for the favorite icon to toggle its state
        holder.favoriteIcon.setOnClickListener(v -> {
            item.setFavorite(!item.isFavorite());
            notifyDataSetChanged();
        });

        // Set a click listener for the item to view detailed information
        holder.itemView.setOnClickListener(v -> {
            // Handle click on the item (optional)
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView favoriteIcon;
        TextView itemTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            favoriteIcon = itemView.findViewById(R.id.favoriteIcon);
            itemTitle = itemView.findViewById(R.id.itemTitle);
        }
    }
}
