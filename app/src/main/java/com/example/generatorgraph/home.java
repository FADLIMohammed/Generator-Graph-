package com.example.generatorgraph;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class home extends Fragment {

    public home() {
    }

    public static home newInstance() {
        home fragment = new home();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    LineGraphSeries<DataPoint> series;
    double a,b,c,x,y;
    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        GraphView graph = view.findViewById(R.id.graph);
        EditText atext = view.findViewById(R.id.a);
        EditText btext = view.findViewById(R.id.b);
        EditText ctext = view.findViewById(R.id.c);
        Button Draw = view.findViewById(R.id.Draw);
        Button clear = view.findViewById(R.id.clear);


        Draw.setOnClickListener(v -> {
            series = new LineGraphSeries<>();
            a=Double.parseDouble(atext.getText().toString());
            b=Double.parseDouble(btext.getText().toString());
            c=Double.parseDouble(ctext.getText().toString());
            for (double i = -200; i < 200; i++) {
                x = i;
                y = (a * (Math.pow(i, 2))) + (b * x) + c;
                series.appendData(new DataPoint(x, y), false, 1000);
            }
            graph.addSeries(series);
        });
        clear.setOnClickListener(v -> graph.removeAllSeries());


    }
}