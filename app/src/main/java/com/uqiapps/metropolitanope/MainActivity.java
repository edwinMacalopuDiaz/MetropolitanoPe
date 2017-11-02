package com.uqiapps.metropolitanope;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


import com.uqiapps.metropolitanope.fragments.CarFragment;
import com.uqiapps.metropolitanope.fragments.InfoFragment;
import com.uqiapps.metropolitanope.fragments.MapsFragment;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_car:
                    CarFragment carFragment=new CarFragment();
                    FragmentTransaction fragmentTransaction1=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction1.replace(R.id.content,carFragment);
                    fragmentTransaction1.commit();
                    return true;
                case R.id.navigation_maps:
                    MapsFragment mapsFragment=new MapsFragment();
                    FragmentTransaction fragmentTransaction2=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction2.replace(R.id.content,mapsFragment);
                    fragmentTransaction2.commit();
                    return true;
                case R.id.navigation_info:
                    InfoFragment infoFragment=new InfoFragment();
                    FragmentTransaction fragmentTransaction3=getSupportFragmentManager().beginTransaction();
                    fragmentTransaction3.replace(R.id.content,infoFragment);
                    fragmentTransaction3.commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        CarFragment carFragment=new CarFragment();
        FragmentTransaction fragmentTransaction1=getSupportFragmentManager().beginTransaction();
        fragmentTransaction1.replace(R.id.content,carFragment);
        fragmentTransaction1.commit();
    }

}
