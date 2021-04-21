package com.example.bankapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.ViewTarget;

import java.text.BreakIterator;
import java.util.ArrayList;

import static com.bumptech.glide.Glide.*;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private static final String TAG = "Adapter";
    private String url="https://www.denofgeek.com/wp-content/uploads/2019/02/mcu-1-iron-man.jpg?resize=768%2C432.jpg";
    private ArrayList<Beneficiary> names=new ArrayList<Beneficiary>() ;
    private Context mcontext;

    public Adapter(Context mcontext) {
        this.mcontext = mcontext;
    }

    public Adapter() {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_beneficiary,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder.name.setText(names.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public void setName(ArrayList<Beneficiary> name) {
        this.names = name;
        notifyDataSetChanged();
    }
    
    public class ViewHolder extends RecyclerView.ViewHolder{
        private CardView parent;
        private ImageView imgperson;
        private TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent=itemView.findViewById(R.id.parent);
            imgperson= itemView.findViewById(R.id.imgperson);
            name= itemView.findViewById(R.id.txtName);
        }
    }
}
