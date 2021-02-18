package com.dgl114.colmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int col1;
    int col2;
    Color c1;
    Color c2;
    Color targetColor;
    Color blendColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        col1=0;
        col2=0;


        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button button10 = findViewById(R.id.button10);
        Button button11 = findViewById(R.id.button11);
        Button button12 = findViewById(R.id.button12);




        TextView t2= findViewById(R.id.textView2);
        ColorDrawable viewColor = (ColorDrawable) t2.getBackground();
        targetColor = Color.valueOf(viewColor.getColor());





        //setting onclick listener to buttons
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button1:
                if (col1==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col1 = viewColor.getColor();
                    c1= Color.valueOf(col1);
                }
                if (col2==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col2 = viewColor.getColor();
                    c2= Color.valueOf(col2);
                }



               Toast.makeText(this, "Button 1 Clicked" , Toast.LENGTH_SHORT).show();

                break;
            case R.id.button2:

                if (col1==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col1 = viewColor.getColor();
                    c1= Color.valueOf(col1);
                }
                if (col2==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col2 = viewColor.getColor();
                    c2= Color.valueOf(col2);
                }

                Toast.makeText(this, "Button 2 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:

                if (col1==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col1 = viewColor.getColor();
                    c1= Color.valueOf(col1);
                }
                if (col2==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col2 = viewColor.getColor();
                    c2= Color.valueOf(col2);
                }

                Toast.makeText(this, "Button 3 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:

                if (col1==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col1 = viewColor.getColor();
                    c1= Color.valueOf(col1);
                }
                if (col2==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col2 = viewColor.getColor();
                    c2= Color.valueOf(col2);
                }

                Toast.makeText(this, "Button 4 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:

                if (col1==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col1 = viewColor.getColor();
                    c1= Color.valueOf(col1);
                }
                if (col2==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col2 = viewColor.getColor();
                    c2= Color.valueOf(col2);
                }

                Toast.makeText(this, "Button 5 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:

                if (col1==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col1 = viewColor.getColor();
                    c1= Color.valueOf(col1);
                }
                if (col2==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col2 = viewColor.getColor();
                    c2= Color.valueOf(col2);
                }

                Toast.makeText(this, "Button 6 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:

                if (col1==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col1 = viewColor.getColor();
                    c1= Color.valueOf(col1);
                }
                if (col2==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col2 = viewColor.getColor();
                    c2= Color.valueOf(col2);
                }

                Toast.makeText(this, "Button 7 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:

                if (col1==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col1 = viewColor.getColor();
                    c1= Color.valueOf(col1);
                }
                if (col2==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col2 = viewColor.getColor();
                    c2= Color.valueOf(col2);
                }

                Toast.makeText(this, "Button 8 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button9:

                if (col1==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col1 = viewColor.getColor();
                    c1= Color.valueOf(col1);
                }
                if (col2==0){
                    ColorDrawable viewColor = (ColorDrawable) v.getBackground();
                    col2 = viewColor.getColor();
                    c2= Color.valueOf(col2);
                }

                Toast.makeText(this, "Button 9 Clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button10:
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                TextView t2 = findViewById(R.id.textView2);
                t2.setBackgroundColor(color);
                ColorDrawable viewColor = (ColorDrawable) t2.getBackground();
                targetColor = Color.valueOf(viewColor.getColor());

                Toast.makeText(this, "Select two colors to match target color and Press MATCH COLOR button!", Toast.LENGTH_LONG).show();

                break;
            case R.id.button11:
                blendColor = ColorMatchGame.colorMatch(c1,c2);
                if (blendColor== targetColor){
                    Toast.makeText(this, "Hurrh! Color Matched.", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(this, "Color Not Matched!!!!", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.button12:
                Toast.makeText(this, "Bye!!!", Toast.LENGTH_SHORT).show();
                this.finish();
                System.exit(0);
                break;

            default:
                
        }

    }

}