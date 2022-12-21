package com.example.generatorgraph;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn= findViewById(R.id.butn);
        btn.setOnClickListener(v -> openActivity());

        ImageButton gethub=findViewById(R.id.gethub);

        gethub.setOnClickListener(v -> {
            Uri uri=Uri.parse("https://github.com/Mohammedfadli9");
            startActivity(new Intent(Intent.ACTION_VIEW,uri));

        });
    }
    public void openActivity(){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}