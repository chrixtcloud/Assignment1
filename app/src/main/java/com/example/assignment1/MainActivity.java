package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm aa");
        SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm");


        //Sydney
        //Updates Time and changes between 12/24hr by pressing Button
       Calendar syd = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"), Locale.US);

        ConstraintLayout sydney = findViewById(R.id.sydney);
        ImageView sydImg = sydney.findViewById(R.id.imageView);
        TextView sydText = sydney.findViewById(R.id.title);
        TextView sydTime12 = sydney.findViewById(R.id.time);
        TextView sydTime24 = sydney.findViewById(R.id.time2);
        Button sydButton = sydney.findViewById(R.id.button);

        sydImg.setImageResource(R.drawable.syd);
        sydText.setText(R.string.SYDNEY);

        sdf12.setCalendar(syd);
        sydTime12.setText(sdf12.format(syd.getTime()));

        sdf24.setCalendar(syd);
        sydTime24.setText(sdf24.format(syd.getTime()));


        sydButton.setOnClickListener(new View.OnClickListener() {

            ConstraintLayout sydney = findViewById(R.id.sydney);
            TextView sydTime12 = sydney.findViewById(R.id.time);
            TextView sydTime24 = sydney.findViewById(R.id.time2);

            @Override
            public void onClick(View view) {

                SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm aa");
                SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm");

                Calendar syd = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"), Locale.US);
                sydTime12.setText(sdf12.format(syd.getTime()));
                sydTime24.setText(sdf24.format(syd.getTime()));

                if(sydTime24.getVisibility() == View.GONE|| sydTime12.getVisibility() == View.VISIBLE){
                    sydTime12.setVisibility(View.GONE);
                    sydTime24.setVisibility(View.VISIBLE);

                }else if(sydTime24.getVisibility() == View.VISIBLE || sydTime12.getVisibility() == View.GONE){
                    sydTime24.setVisibility(View.GONE);
                    sydTime12.setVisibility(View.VISIBLE);

                }else sydTime12.setVisibility(View.VISIBLE);
            }

        });

        //Egypt
        //Changes between 12/24hr by pressing Button
        Calendar egy = Calendar.getInstance(TimeZone.getTimeZone("Egypt"), Locale.US);

        ConstraintLayout egypt = findViewById(R.id.egypt);
        ImageView egyImg = egypt.findViewById(R.id.imageView);
        TextView egyText = egypt.findViewById(R.id.title);
        TextView egyTime12 = egypt.findViewById(R.id.time);
        TextView egyTime24 = egypt.findViewById(R.id.time2);
        Button egyButton = egypt.findViewById(R.id.button);

        egyImg.setImageResource(R.drawable.egypt);
        egyText.setText(R.string.EGYPT);

        sdf12.setCalendar(egy);
        egyTime12.setText(sdf12.format(egy.getTime()));

        sdf24.setCalendar(egy);
        egyTime24.setText(sdf24.format(egy.getTime()));

        egyButton.setOnClickListener(new View.OnClickListener() {

            ConstraintLayout egypt = findViewById(R.id.egypt);
            TextView egyTime12 = egypt.findViewById(R.id.time);
            TextView egyTime24 = egypt.findViewById(R.id.time2);

            public void onClick(View view1) {

                if(egyTime24.getVisibility() == View.GONE || egyTime12.getVisibility() == View.VISIBLE){
                    egyTime12.setVisibility(View.GONE);
                    egyTime24.setVisibility(View.VISIBLE);

                }else if(egyTime24.getVisibility() == View.VISIBLE || egyTime12.getVisibility() == View.GONE ){
                    egyTime24.setVisibility(View.GONE);
                    egyTime12.setVisibility(View.VISIBLE);

                }else egyTime12.setVisibility(View.VISIBLE);
            }

        });


        //India
        //Changes between 12/24hr by pressing Button
        Calendar ind = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kuala_Lumpur"), Locale.US);

        ConstraintLayout india = findViewById(R.id.india);
        ImageView indImg = india.findViewById(R.id.imageView);
        TextView indText = india.findViewById(R.id.title);
        TextView indTime12 = india.findViewById(R.id.time);
        TextView indTime24 = india.findViewById(R.id.time2);
        Button indButton = india.findViewById(R.id.button);

        indImg.setImageResource(R.drawable.ind);
        indText.setText(R.string.INDIA);

        sdf12.setCalendar(ind);
        indTime12.setText(sdf12.format(ind.getTime()));

        sdf24.setCalendar(ind);
        indTime24.setText(sdf24.format(ind.getTime()));

        indButton.setOnClickListener(new View.OnClickListener()

        {Calendar ind = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kuala_Lumpur"), Locale.US);
            ConstraintLayout india = findViewById(R.id.india);
            TextView indTime12 = india.findViewById(R.id.time);
            TextView indTime24 = india.findViewById(R.id.time2);

            @Override
            public void onClick(View view) {

                if(indTime24.getVisibility() == View.GONE || indTime12.getVisibility() == View.VISIBLE){
                    indTime12.setVisibility(View.GONE);
                    indTime24.setVisibility(View.VISIBLE);

                }else if(indTime24.getVisibility() == View.VISIBLE || indTime12.getVisibility() == View.GONE ){
                    indTime24.setVisibility(View.GONE);
                    indTime12.setVisibility(View.VISIBLE);

                }else indTime12.setVisibility(View.VISIBLE);
            }

        });

        //Bangkok
        //Changes between 12/24hr by pressing Button
        Calendar kon = Calendar.getInstance(TimeZone.getTimeZone("Asia/Bangkok"), Locale.US);

        ConstraintLayout kong = findViewById(R.id.kong);
        ImageView konImg = kong.findViewById(R.id.imageView);
        TextView konText = kong.findViewById(R.id.title);
        TextView konTime12 = kong.findViewById(R.id.time);
        TextView konTime24 = kong.findViewById(R.id.time2);
        Button konButton = kong.findViewById(R.id.button);

        konImg.setImageResource(R.drawable.chi);
        konText.setText(R.string.KONG);

        sdf12.setCalendar(kon);
        konTime12.setText(sdf12.format(kon.getTime()));

        sdf24.setCalendar(kon);
        konTime24.setText(sdf24.format(kon.getTime()));


        konButton.setOnClickListener(new View.OnClickListener() {
            Calendar kon = Calendar.getInstance(TimeZone.getTimeZone("Asia/Bangkok"), Locale.US);
            ConstraintLayout kong = findViewById(R.id.kong);
            TextView konTime12 = kong.findViewById(R.id.time);
            TextView konTime24 = kong.findViewById(R.id.time2);

            SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm aa");
            SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm");

            @Override
            public void onClick(View view){

                sdf12.setCalendar(kon);
                konTime12.setText(sdf12.format(kon.getTime()));

                sdf24.setCalendar(kon);
                konTime24.setText(sdf24.format(kon.getTime()));

                if(konTime24.getVisibility() == View.GONE|| konTime12.getVisibility() == View.VISIBLE){
                    konTime12.setVisibility(View.GONE);
                    konTime24.setVisibility(View.VISIBLE);

                }else if(konTime24.getVisibility() == View.VISIBLE || konTime12.getVisibility() == View.GONE){
                    konTime24.setVisibility(View.GONE);
                    konTime12.setVisibility(View.VISIBLE);

                }else konTime12.setVisibility(View.VISIBLE);
            }

        });

        //New York
        //Changes between 12/24hr by pressing Button
        Calendar yor = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"), Locale.US);

        ConstraintLayout york = findViewById(R.id.yor);
        ImageView yorImg = york.findViewById(R.id.imageView);
        TextView yorText = york.findViewById(R.id.title);
        TextView yorTime12 = york.findViewById(R.id.time);
        TextView yorTime24 = york.findViewById(R.id.time2);
        Button yorButton = york.findViewById(R.id.button);

        yorImg.setImageResource(R.drawable.yor);
        yorText.setText(R.string.YORK);

        sdf12.setCalendar(yor);
        yorTime12.setText(sdf12.format(yor.getTime()));

        sdf24.setCalendar(yor);
        yorTime24.setText(sdf24.format(yor.getTime()));

        yorButton.setOnClickListener(new View.OnClickListener(){

            Calendar yor = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"), Locale.US);
            ConstraintLayout york = findViewById(R.id.yor);
            TextView yorTime12 = york.findViewById(R.id.time);
            TextView yorTime24 = york.findViewById(R.id.time2);

            SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm aa");
            SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm");

            @Override
            public void onClick(View view1){

                ConstraintLayout york = findViewById(R.id.yor);
                sdf12.setCalendar(yor);
                yorTime12.setText(sdf12.format(yor.getTime()));

                sdf24.setCalendar(yor);
                yorTime24.setText(sdf24.format(yor.getTime()));

                if(yorTime24.getVisibility() == View.GONE || yorTime12.getVisibility() == View.VISIBLE){
                    yorTime12.setVisibility(View.GONE);
                    yorTime24.setVisibility(View.VISIBLE);

                }else if(yorTime24.getVisibility() == View.VISIBLE || yorTime12.getVisibility() == View.GONE){
                    yorTime24.setVisibility(View.GONE);
                    yorTime12.setVisibility(View.VISIBLE);

                }else yorTime12.setVisibility(View.VISIBLE);
            }

        });


    }


}