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

        final TextView tv=findViewById(R.id.text);
        ListView listView=findViewById(R.id.listview);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref=database.getReference("PRODUCTS");
        products pr=new products("a","b","c","d","e","f","g");
        //ref.push().setValue(pr);
       /* final String[] str = {""};

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot snap:dataSnapshot.getChildren()){
                products products=snap.getValue(products.class);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });*/


        ArrayList<products> arrayList=new ArrayList<>();
        arrayList.add(new products("a","b","c","d","e","f","g"));
        arrayList.add(new products("a","b","c","d","e","f","g"));
        arrayList.add(new products("a","b","c","d","e","f","g"));
        adaptors adaptors=new adaptors(arrayList,MainActivity.this);
        listView.setAdapter(adaptors);



    }
}
