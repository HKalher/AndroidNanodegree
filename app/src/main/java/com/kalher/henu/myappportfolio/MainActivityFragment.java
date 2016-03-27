package com.kalher.henu.myappportfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivityFragment extends Fragment {

    private List<String> AppList;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RecyclerView recyclerList = (RecyclerView) getView().findViewById(R.id.cardList);
        recyclerList.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerList.setLayoutManager(linearLayoutManager);

        MyAdapter ma = new MyAdapter(CreateList());
        recyclerList.setAdapter(ma);
    }

    public List<String> CreateList(){
        AppList = new ArrayList<String>();
        AppList.add("Spotify Streamer");
        AppList.add("Super Duo");
        AppList.add("Build It Bigger");
        AppList.add("XYZ Reader");
        AppList.add("Capstone: My Own App");
        return AppList;
    }
}
