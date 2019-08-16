package com.example.communitymoa.ui;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    private int currentPostion;

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    protected abstract void clear();

    public void onBind(int currentPostion){
        this.currentPostion = currentPostion;
        clear();
    }

    public int getCurrentPostion() {
        return currentPostion;
    }
}
