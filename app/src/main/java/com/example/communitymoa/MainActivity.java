package com.example.communitymoa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.communitymoa.model.Moa;
import com.example.communitymoa.mvvm.MainViewModel;
import com.example.communitymoa.ui.MoaAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    SwipeRefreshLayout swipeRefresh;
    private MainViewModel mainViewModel;
    MoaAdapter moaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        getPopularBlog();
    }

    private void getPopularBlog() {

        swipeRefresh.setRefreshing(true);
        mainViewModel.getAllMoa().observe(this, new Observer<List<Moa>>() {
            @Override
            public void onChanged(List<Moa> blogs) {
                swipeRefresh.setRefreshing(false);
                prepareRecyclerView(blogs);
            }
        });
    }

    private void init() {
        swipeRefresh = findViewById(R.id.swipeRefresh);
        mRecyclerView = findViewById(R.id.recycleView);
    }

    private void prepareRecyclerView(List<Moa> moaList) {

        moaAdapter = new MoaAdapter(moaList);
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        } else {
            mRecyclerView.setLayoutManager(new GridLayoutManager(this, 4));

        }
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(moaAdapter);
        moaAdapter.notifyDataSetChanged();

    }
}
