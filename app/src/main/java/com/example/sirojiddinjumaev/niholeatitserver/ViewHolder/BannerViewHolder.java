package com.example.sirojiddinjumaev.niholeatitserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sirojiddinjumaev.niholeatitserver.Common.Common;
import com.example.sirojiddinjumaev.niholeatitserver.Interface.ItemClickListener;
import com.example.sirojiddinjumaev.niholeatitserver.R;

public class BannerViewHolder extends RecyclerView.ViewHolder implements
        View.OnCreateContextMenuListener
{

    public TextView banner_name;
    public ImageView banner_image;




    public BannerViewHolder(View itemView) {
        super(itemView);

        banner_name = (TextView) itemView.findViewById(R.id.banner_name);
        banner_image = (ImageView) itemView.findViewById(R.id.banner_image);


        itemView.setOnCreateContextMenuListener(this);



    }




    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.setHeaderTitle("Select the action");


        contextMenu.add(0,0,getAdapterPosition(),Common.UPDATE);
        contextMenu.add(0,0,getAdapterPosition(),Common.DELETE);

    }
}
