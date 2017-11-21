package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView ballDisplay = (ImageView) findViewById(R.id.Image_eightBall);
        final Button myButton = (Button) findViewById(R.id.askButton);
        final int[] ballArray= {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randNumGenerator = new Random();
                int randomNum = randNumGenerator.nextInt(5);
                Log.d("Dicee gf message is", "the  nunber is " +randomNum);
                ballDisplay.setImageResource(ballArray[randomNum]);

            }
        });
    }

}
