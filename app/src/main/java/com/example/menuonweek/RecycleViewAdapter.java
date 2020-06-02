package com.example.menuonweek;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.menuonweek.food.RecipeInterface;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.RecycleViewViewHolder> {

    private ArrayList<RecipeInterface> arrayList;
    Context context;

    public class RecycleViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageView;
        public TextView textView1;
        public TextView textView2;

        public RecycleViewViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageView = itemView.findViewById(R.id.imageView);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            RecipeInterface recipeInterface = arrayList.get(position);

            Intent intent = new Intent(context, RecipeActivity.class);
            intent.putExtra("imageResource", recipeInterface.getImageResource());
            intent.putExtra("title", recipeInterface.getTitle());
            intent.putExtra("description", recipeInterface.getDescription());
            intent.putExtra("recipe", recipeInterface.getRecipe());
            context.startActivity(intent);
        }
    }

    public RecycleViewAdapter(ArrayList<RecipeInterface> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecycleViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_view_item,
                parent, false);
        RecycleViewViewHolder recycleViewViewHolder = new RecycleViewViewHolder(view);
        return recycleViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecycleViewViewHolder holder, int position) {
        RecipeInterface recipeInterface = arrayList.get(position);

        holder.imageView.setImageResource(recipeInterface.getImageResource());
        holder.textView1.setText(recipeInterface.getTitle());
        holder.textView2.setText(recipeInterface.getDescription());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
