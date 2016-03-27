package com.kalher.henu.myappportfolio;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{
    private List<String> TitleList;

    public MyAdapter(List<String> TitleList){
        this.TitleList = TitleList;
    }

    @Override
    public int getItemCount() {
        return TitleList.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText(TitleList.get(position));
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.card_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        protected TextView title;
        public MyViewHolder(View v){
            super(v);
            title =(TextView) v.findViewById(R.id.title);
            v.setOnClickListener(new View.OnClickListener(){
                @Override public void onClick(View v) {
                    CharSequence appname = title.getText().toString();
                    Context context = v.getContext();
                    CharSequence messageText = "This button will launch my " + appname + " app!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast messageToast = Toast.makeText(context,messageText,duration);
                    messageToast.show();
                }
            });
        }
    }
}
