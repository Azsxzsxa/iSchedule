package com.example.ischedule;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView txt_title, txt_content;
    Button btn_status;
    IItemClickListener iItemClickListener;

    public void setiItemClickListener(IItemClickListener iItemClickListener) {
        this.iItemClickListener = iItemClickListener;
    }

    public MyRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        txt_content = (TextView) itemView.findViewById(R.id.txt_content);
        txt_title = (TextView) itemView.findViewById(R.id.txt_title);
        btn_status = itemView.findViewById(R.id.btn_status);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        iItemClickListener.onClick(view, getAdapterPosition());
    }
}
