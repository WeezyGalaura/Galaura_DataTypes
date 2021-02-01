package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display;

        display = findViewById(R.id.displayTxt);

        String textdisplay = "Weezy Mie R. Galaura";

        String stringButnumber = "98808";
        String firstName = "Weezy Mie";
        char middleInitial = 'R';
        String lastName = "Galaura";
        int myAge = 18;
        float myDreamTVLGrade = 97.0f;
        double myMoney =999999.99;

        Double.parseDouble(stringButnumber);

        //double into string
        //String.valueOf(myMoney);
        display.setText("My name is "+firstName+" "
                +String.valueOf(middleInitial)+ " "
                +lastName+ "\nand my age is "
                +myAge+ ".\nI esnt my grade in TVL3 to be"
                +String.valueOf(myDreamTVLGrade));

        boolean amIMarried = false;


        //Double.parseDouble => converts datatypes to double
        //Integer.parseInt => converts datatypes to int
        //String.valueOf => converts datatypes to String


    }
}
