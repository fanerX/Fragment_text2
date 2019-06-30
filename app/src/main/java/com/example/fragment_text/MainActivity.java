package com.example.fragment_text;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragments.BlankFragment_1;
import fragments.BlankFragment_2;
import fragments.BlankFragment_3;
import fragments.BlankFragment_4;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private  Button[] buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttons = new Button[] {
                findViewById(R.id.button_1),
                findViewById(R.id.button_2),
                findViewById(R.id.button_3),
                findViewById(R.id.button_4),
        };
        for( Button button:buttons){
            button.setOnClickListener(this);
        }
        replaceFragment(new BlankFragment_1());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_1:
                replaceFragment(new BlankFragment_1());
                break;
            case R.id.button_2:
                replaceFragment(new BlankFragment_2());
                break;
            case R.id.button_3:
                replaceFragment(new BlankFragment_3());
                break;
            case R.id.button_4:
                replaceFragment(new BlankFragment_4());
                break;
            default:
                 break;
        }
    }

    private void replaceFragment(Fragment fragment){

        FragmentTransaction  transaction= getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout,fragment).commit();
    }
}
