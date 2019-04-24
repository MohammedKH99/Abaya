package com.mteam.abayatie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Hi ", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Mohammed waramhen", Toast.LENGTH_SHORT).show();


    }

    public void MM(){
        Toast.makeText(this, "Zoombie", Toast.LENGTH_SHORT).show();
    }
}
