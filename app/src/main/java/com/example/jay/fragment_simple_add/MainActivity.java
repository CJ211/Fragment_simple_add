package com.example.jay.fragment_simple_add;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.jay.fragment_simple_add.R.id.editext;
import static com.example.jay.fragment_simple_add.R.id.fragtxt;

public class MainActivity extends AppCompatActivity {

    private Button msubmitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
