package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Date;

public class Chart extends AppCompatActivity {
    PieChart piechart;
    BarChart barchart;
    private RelativeLayout mainLayout;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chart);
        //sql date last entry
        //if today more than sql date
        //get todays total
        //add todays total in database
        //add todays total in entry



        ArrayList<PieEntry> barEntries = new ArrayList<>();




        //barchart = (BarChart) findViewById(R.id.bargraph);
        piechart = (PieChart) findViewById(R.id.bargraph);

        barEntries.add(new PieEntry(1,"add") );
        barEntries.add(new PieEntry(1,"did"));
        barEntries.add(new PieEntry(1,22));
        PieDataSet barDataSet = new PieDataSet(barEntries,"Dates");

        ArrayList<String> theDates = new ArrayList<>();
        theDates.add("April");

        PieData thedata = new PieData(barDataSet);
        piechart.setData(thedata);
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS); // set the color<br />


    }

}
