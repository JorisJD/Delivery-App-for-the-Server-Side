package com.example.sirojiddinjumaev.niholeatitserver.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.sirojiddinjumaev.niholeatitserver.R;

import com.example.sirojiddinjumaev.niholeatitserver.Interface.ItemClickListener;

public class OrderViewHolder extends RecyclerView.ViewHolder {

    public TextView txtOrderId;
    public TextView txtOrderStatus;
    public TextView txtOrderPhone;
    public TextView txtOrderAddress;
    public TextView txtOrderDate;

    public Button btnEdit, btnRemove, btnDetail, btnDirection;



    public OrderViewHolder(View itemView) {
        super(itemView);

        txtOrderAddress = (TextView) itemView.findViewById(R.id.order_address);
        txtOrderId = (TextView) itemView.findViewById(R.id.order_id);
        txtOrderPhone = (TextView) itemView.findViewById(R.id.order_phone);
        txtOrderStatus = (TextView) itemView.findViewById(R.id.order_status);
        txtOrderDate = (TextView) itemView.findViewById(R.id.order_date);

        btnEdit = (Button)itemView.findViewById(R.id.btnEdit);

        btnDetail = (Button)itemView.findViewById(R.id.btnDetail);

        btnRemove = (Button)itemView.findViewById(R.id.btnRemove);

        btnDirection = (Button)itemView.findViewById(R.id.btnDirection);



    }




//    @Override
//    public boolean onLongClick(View view) {
//        itemClickListener.onClick(view, getAdapterPosition(), true);
//        return true;
//    }
}
