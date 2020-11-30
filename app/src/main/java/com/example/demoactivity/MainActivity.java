package com.example.demoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
 EditText editText,email,address,itemname,price,mmob;
 Button btn;
FirebaseDatabase rootnode;
DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText) findViewById(R.id.userName);
        email=(EditText) findViewById(R.id.EmailAddress);
        address=(EditText) findViewById(R.id.Address);
        itemname=(EditText)  findViewById(R.id.ItemName);
        price=(EditText) findViewById(R.id.ItemPrice);
        mmob=(EditText) findViewById(R.id.Phone);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameValue=editText.getText().toString();
                String emailValue=email.getText().toString();
                String addressValue=address.getText().toString();
                String itemValue=itemname.getText().toString();
                String priceV= price.getText().toString();
                String mobV=mmob.getText().toString();

                Intent intent=new Intent(MainActivity.this,DemoActivity2.class);
              intent.putExtra("Key",nameValue);
              intent.putExtra("Email",emailValue);
                intent.putExtra("Address",addressValue);
                intent.putExtra("ItemV",itemValue);
                intent.putExtra("Price",priceV);

                startActivity(intent);
                    rootnode=FirebaseDatabase.getInstance();
                    reference=rootnode.getReference("user");
                    //get all fields


                    shopHelper helperClass=new shopHelper(nameValue,emailValue,addressValue,itemValue,priceV,mobV);


                    reference.child(mobV).setValue(helperClass);


            }
        });
    }
}