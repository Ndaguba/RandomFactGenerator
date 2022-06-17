package com.example.acceptinginput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      }
       public void ChangeText(View v){
        // initialize the variable and grab them using the find view by ID
        findViewById(R.id.factTextView);
        findViewById(R.id.changeFact);
       // cast the facttextview in a Text view so you can use the setText method
        TextView factTextView = (TextView) findViewById(R.id.factTextView);
        // initialize the button.
        Button changeFact = (Button) findViewById(R.id.changeFact);
        // update the screen with new fact using the @random java class
           Random randomGenerator = new Random();
           String fact = "";
           int randomNumber = randomGenerator.nextInt(4);
           if(randomNumber == 0){
               fact ="The earth is round";
           }
           else if(randomNumber == 1){
               fact = "There are seven continents in the world";
           }
           else if(randomNumber == 2){
               fact = "Whale songs can be used to map out the ocean floor.";
           }else if(randomNumber == 3){
               fact = "New creatures have been found in deep-sea volcanoes.";
           }
           else if (randomNumber == 4){
               fact = "Mount Everest is bigger now than the last time it was measured.";
           }
           // if random fact is equal to any of the numbers above then set the text to the corresponding texts.
        factTextView.setText(fact);
       }

      }

