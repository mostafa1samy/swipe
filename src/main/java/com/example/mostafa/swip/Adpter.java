package com.example.mostafa.swip;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mostafa.swip.model.Item;
import com.example.mostafa.swip.model.Total;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adpter extends RecyclerView.Adapter<Adpter.vh> {
    Context context;
    List<Item>totals;

    public Adpter(Context context, List<Item> totals) {
        this.context = context;
        this.totals = totals;
    }




    @Override
    public vh onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new vh(view);
    }

    @Override
    public void onBindViewHolder(vh holder, int position) {
        Total t=new Total();
        totals=t.getItems();
        Item  item=totals.get(position);
        String titl=item.getVolumeInfo().getTitle();
        String autho=item.getVolumeInfo().getAuthors().get(0);
        String image=item.getVolumeInfo().getImageLinks().getSmallThumbnail();
        holder.author.setText(autho);
        holder.title.setText(titl);
        Picasso.get().load(image).into(holder.imageView);


    }

    @Override
    public int getItemCount() {
        return totals.size();
    }

    class vh extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView title,author;


        public vh(View itemView) {

            super(itemView);
            imageView=itemView.findViewById(R.id.i);
            title=itemView.findViewById(R.id.t1);
            author=itemView.findViewById(R.id.t2);
        }
    }
}
