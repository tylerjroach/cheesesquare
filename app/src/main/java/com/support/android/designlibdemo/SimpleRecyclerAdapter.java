package com.support.android.designlibdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tylerroach on 6/18/15.
 */
public class SimpleRecyclerAdapter extends RecyclerView.Adapter<SimpleRecyclerAdapter.SimpleItemViewHolder> {
    private List<String> items;

    // Provide a reference to the views for each data item
    // Provide access to all the views for a data item in a view holder
    public final static class SimpleItemViewHolder extends RecyclerView.ViewHolder {
        TextView label;

        public SimpleItemViewHolder(View itemView) {
            super(itemView);
            label = (TextView) itemView.findViewById(android.R.id.text1);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public SimpleRecyclerAdapter(List<String> items) {
        this.items = items;
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return this.items.size();
    }

    // Create new items (invoked by the layout manager)
    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public SimpleItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).
                inflate(android.R.layout.simple_list_item_1, viewGroup, false);
        return new SimpleItemViewHolder(itemView);
    }

    // Replace the contents of a view (invoked by the layout manager)
    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(SimpleItemViewHolder viewHolder, int position) {
        String item = items.get(position);
        viewHolder.label.setText(item);
    }
}