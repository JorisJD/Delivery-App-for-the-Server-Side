package com.example.sirojiddinjumaev.niholeatitserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.sirojiddinjumaev.niholeatitserver.Interface.ItemClickListener;
import com.example.sirojiddinjumaev.niholeatitserver.R;

import org.w3c.dom.Text;

import info.hoang8f.widget.FButton;

public class ShipperViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    public TextView shipper_name, shipper_phone;
    public FButton btn_edit, btn_remove;
    private ItemClickListener itemClickListener;


    public ShipperViewHolder(View itemView) {
        super(itemView);

        shipper_name = (TextView)itemView.findViewById(R.id.shipper_name);
        shipper_phone = (TextView)itemView.findViewById(R.id.shipper_phone);
        btn_edit = (FButton)itemView.findViewById(R.id.btnEdit);
        btn_remove = (FButton)itemView.findViewById(R.id.btnRemove);

    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), false);

    }
}
