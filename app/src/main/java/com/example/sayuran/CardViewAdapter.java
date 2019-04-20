package com.example.sayuran;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;



public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.ViewHolder> {

    private static final String TAG = "CardViewAdapter";

    private ArrayList<String> imagevgNames = new ArrayList<>();
    private ArrayList<String> vgImages = new ArrayList<>();
    private ArrayList<String> vgImagesDesc = new ArrayList<>();
    private ArrayList<String> vgDescriptionDetail = new ArrayList<>();

    private Context context;

    public CardViewAdapter(Context context, ArrayList<String> imagevgNames, ArrayList<String> vgImages, ArrayList<String> vgImagesDesc , ArrayList<String> vgDescriptionDetail ) {
        this.imagevgNames = imagevgNames;
        this.vgImages = vgImages;
        this.vgImagesDesc = vgImagesDesc;
        this.vgDescriptionDetail = vgDescriptionDetail;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int i) {
        Log.d(TAG,"onBindViewHolder: called.");

        Glide.with(context)
                .asBitmap()
                .load(vgImages.get(i))
                .into(holder.image);
        holder.imageName.setText(imagevgNames.get(i));
        holder.vgImagesDesc.setText(vgImagesDesc.get(i));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ imagevgNames.get(i));
                Toast.makeText(context, imagevgNames.get(i),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(context, GalleryActivity.class);
                intent.putExtra("url_image",vgImages.get(i));
                intent.putExtra("name_image",imagevgNames.get(i));
                intent.putExtra("desc_image",vgDescriptionDetail.get(i));
                context.startActivity(intent);
            }
        });
        holder.btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ imagevgNames.get(i));
                Toast.makeText(context, "Favorite "+imagevgNames.get(i),Toast.LENGTH_SHORT).show();
            }
        });
        holder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick: clicked on: "+ imagevgNames.get(i));
                Toast.makeText(context, "Share "+ imagevgNames.get(i),Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return imagevgNames.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        Button btnFavorite;
        Button btnShare;
        ImageView image;
        TextView imageName;
        TextView vgImagesDesc;
        CardView parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.name_image);
            vgImagesDesc = itemView.findViewById(R.id.desc_image);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
