package com.example.customalertdialogex;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Dialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       btn = findViewById(R.id.btn);
       dialog = new Dialog(MainActivity.this);

       dialog.setContentView(R.layout.customalert); //find customalert
       dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.curves));
       Button yes = dialog.findViewById(R.id.yes);
       Button no = dialog.findViewById(R.id.no);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               dialog.show();
           }
       });
       yes.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Battery saver on!", Toast.LENGTH_SHORT).show();
           }
       });
       no.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               dialog.dismiss();
           }
       });
    }
}