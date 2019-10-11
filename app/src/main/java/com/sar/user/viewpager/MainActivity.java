package com.sar.user.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        int []models={R.drawable.invi,R.drawable.invite,R.drawable.ic_launcher_background,R.drawable.ic_launcher_foreground};
        Adapter adapter=new Adapter(models,this);
        viewPager.setAdapter(adapter);
    }
}
