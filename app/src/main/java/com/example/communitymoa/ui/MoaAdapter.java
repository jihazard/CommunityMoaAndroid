package com.example.communitymoa.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.communitymoa.R;
import com.example.communitymoa.model.Moa;

import java.util.List;

public class MoaAdapter extends RecyclerView.Adapter<MoaAdapter.ViewHolder> {

    private static final String TAG = "Moa ADAPTER";
    private List<Moa> moaList;
    private Context context;

    public MoaAdapter(List<Moa> moaList) {
        this.moaList = moaList;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.moa_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(position);
    }


    @Override
    public int getItemCount() {
        return moaList.size();
    }


    public class ViewHolder extends BaseViewHolder {
        public ImageView ivImage;
        public TextView tvTitle, tvLink;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImage = itemView.findViewById(R.id.ivImage);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvLink = itemView.findViewById(R.id.tvLink);


        }

        @Override
        protected void clear() {
            ivImage.setImageDrawable(null);
            tvTitle.setText("");
            tvLink.setText("");
        }

        @Override
        public void onBind(int currentPostion) {
            super.onBind(currentPostion);
            final Moa moa = moaList.get(currentPostion);

            tvTitle.setText(moa.getTitle());
            tvLink.setText(moa.getDescription());
            tvLink.setText(moa.getDescription());
            Glide.with(context)
                    .load(moa.getImg())
                    .into(ivImage);


//            tvLink.setOnClickListener(v -> {
//                if(moa.getUrl_pc() != null){
//                    Intent intent = new Intent();
//                    intent.setAction(Intent.ACTION_VIEW);
//                    intent.addCategory(Intent.CATEGORY_APP_BROWSER);
//                    intent.setData(Uri.parse(moa.getUrl_mobile()+moa.getUrl_parameter()));
//                    itemView.getContext().startActivity(intent);
//
//                }
//            });
        }
    }

}
