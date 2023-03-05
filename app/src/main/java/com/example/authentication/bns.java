package com.example.authentication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

public class bns extends AppCompatActivity {
    Button plus;

    public FirestoreRecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bns);
        FirebaseFirestore firebaseFirestore = FirebaseFirestore.getInstance();
        RecyclerView mFirestoreList = findViewById(R.id.recyclerView);
        plus= findViewById(R.id.Add_Lost);
        plus.setOnClickListener(view -> startActivity(new Intent(bns.this, sell_form.class)));

        Query query = firebaseFirestore.collection("Seller");
        FirestoreRecyclerOptions<products_models> options = new FirestoreRecyclerOptions.Builder<products_models>()
                .setQuery(query,products_models.class)
                .build();
        Log.d("HERE---", options.toString());
        adapter = new FirestoreRecyclerAdapter<products_models, bns.ProductsViewHolder>(options) {
            @NonNull
            @Override
            public bns.ProductsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_singlet,parent,false);
                return new ProductsViewHolder(view);
            }

            @Override
            protected void onBindViewHolder(@NonNull ProductsViewHolder holder, int position, @NonNull products_models model) {
                Log.d("here is name", model.toString());
                holder.name.setText(model.getCourseName());
                holder.desc.setText(model.getCourseDescription());
                holder.date.setText(model.getCourseDuration());
            }
        };
        mFirestoreList.setHasFixedSize(true);
        mFirestoreList.setLayoutManager(new LinearLayoutManager(this));
        mFirestoreList.setAdapter(adapter);
    }

    private class ProductsViewHolder extends RecyclerView.ViewHolder {
        final TextView name;
        final TextView desc;
        final TextView date;
        public ProductsViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView)itemView.findViewById(R.id.name);
            desc = (TextView)itemView.findViewById(R.id.desc);
            date = (TextView)itemView.findViewById(R.id.date);
            System.out.println("name being printed" + name);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }
}