package com.example.sayuran;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class GridAdapter extends RecyclerView.Adapter<GridAdapter.GridViewHolder> {

    private static final String TAG = "ListView";
    private ArrayList<String> imagevgNames = new ArrayList<>();
    private ArrayList<String> vgImages = new ArrayList<>();
    private ArrayList<String> vgImagesDesc = new ArrayList<>();
    private ArrayList<String> vgDescriptionDetail = new ArrayList<>();

    private Context context;

    public GridAdapter(Context context, ArrayList<String> imagevgNames, ArrayList<String> vgImages, ArrayList<String> vgImagesDesc , ArrayList<String> vgDescriptionDetail ) {

        this.imagevgNames = imagevgNames;
        this.vgImages = vgImages;
        this.vgImagesDesc = vgImagesDesc;
        this.vgDescriptionDetail = vgDescriptionDetail;
        this.context = context;

    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, final int i) {
        Glide.with(context)
                .asBitmap()
                .load(vgImages.get(i))
                .into(holder.imgPhoto);
        holder.imgPhoto.setOnClickListener(new View.OnClickListener() {
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
    }

    @Override
    public int getItemCount() {
        return vgImages.size();
    }

    @Override
    public int getItemViewType(int position){
        return position;
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}

