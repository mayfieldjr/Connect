package com.example.connectionbase;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ET;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET = (EditText)findViewById(R.id.EdText);
        btn = (Button)findViewById(R.id.website);
    }
    public void openconnection()
    {
        Uri uri = Uri.parse("www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, ur)
    }
}
