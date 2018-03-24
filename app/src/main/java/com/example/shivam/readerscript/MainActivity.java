package com.example.shivam.readerscript;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<products> productsArrayList=new ArrayList<>();

        final ListView listView=findViewById(R.id.listview);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref=database.getReference("PRODUCTS");
        products pr=new products("a","sem1 books","20%","2018-03-26 08:59:59","100","f","http://pngimg.com/uploads/book/book_PNG2122.png");
        ref.push().setValue(pr);

        ref=database.getReference("PRODUCTS");

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot snap:dataSnapshot.getChildren()){
                products products=snap.getValue(products.class);
                productsArrayList.add(products);
                }
                adaptors adaptors=new adaptors(productsArrayList,MainActivity.this);
                listView.setAdapter(adaptors);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });





    }
}
