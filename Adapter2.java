package com.example.bankapplication;

import android.content.Context;
import android.content.Intent;
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

import java.text.BreakIterator;
import java.util.ArrayList;

import static com.example.bankapplication.MainActivity3.KEY;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder2> {
    private static final String TAG = "Adapter2";
    private ArrayList<Beneficiary> names1=new ArrayList<Beneficiary>() ;
    private Context mcontext;

    public Adapter2(Context mcontext) {
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent2, int viewType) {
        View view= LayoutInflater.from(parent2.getContext()).inflate(R.layout.list_beneficiary2,parent2,false);
        return new ViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder2 holder1, int position) {
        Log.d(TAG, "onBindViewHolder: called");
        holder1.name2.setText(names1.get(position).getName());

        holder1.parent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mcontext,  MainActivity3.class);
                intent.putExtra(KEY, names1.get(position).getAc());
                mcontext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return names1.size();
    }

    public void setName(ArrayList<Beneficiary> name) {
        this.names1 = name;
        notifyDataSetChanged();
    }

    public class ViewHolder2 extends RecyclerView.ViewHolder{
        private CardView parent2;
        private TextView name2;
        public ViewHolder2(@NonNull View itemView) {
            super(itemView);
            parent2=itemView.findViewById(R.id.parent2);
            name2= itemView.findViewById(R.id.txtName2);
        }
    }
}

