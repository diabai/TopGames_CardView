package com.yiriba.cardview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yiriba.cardview.R;
import com.yiriba.cardview.model.Game;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    // 1- Data
    private Context context;
    private ArrayList<Game> gamesList;

    // 2- Constructor
    public MyAdapter(Context context, ArrayList<Game> gamesList) {
        this.context = context;
        this.gamesList = gamesList;
    }

    // 3- View Holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gameImage;
        private TextView gameName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.gameImage = itemView.findViewById(R.id.iv_card);
            this.gameName = itemView.findViewById(R.id.tv_card);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Game model = gamesList.get(position);
            holder.gameName.setText(model.getName());
            holder.gameImage.setImageResource(model.getImage());

            //Handle click events
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "You chose "+ gamesList.get(position).getName(), Toast.LENGTH_SHORT).show();
                }
            });
    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }

}
