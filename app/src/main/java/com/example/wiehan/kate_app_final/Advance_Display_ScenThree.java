package com.example.wiehan.kate_app_final;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class Advance_Display_ScenThree extends AppCompatActivity {

    GraphView graphBPAdvance ;
    GraphView graphPulseAdvance ;
    GraphView graphRRAdvance;
    GraphView graphTempAdvance;
    GraphView graphPAOAdvance ;
    TextView BPNumAdvance ;
    TextView pulseNumAdvance ;
    TextView RRNumAdvance ;
    TextView PAONumAdvance ;
    TextView tempNumAdvance ;
    TextView textInfo ;
    TextView textPatientNo ;
    TextView textPatientInfo ;
    LineGraphSeries<DataPoint> seriesBP ;
    LineGraphSeries<DataPoint> seriesPulse ;
    LineGraphSeries<DataPoint> seriesRR ;
    LineGraphSeries<DataPoint> seriesPAO ;
    LineGraphSeries<DataPoint> seriesTemp ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_display_scen_three);

        BPNumAdvance = (TextView)  findViewById(R.id.BPNumAdvance_Scen3) ;
        pulseNumAdvance = (TextView)  findViewById(R.id.pulseNumAdvance_Scen3) ;
        RRNumAdvance = (TextView)  findViewById(R.id.RRNumAdvance_Scen3) ;
        PAONumAdvance = (TextView) findViewById(R.id.PAONumAdvance_Scen3) ;
        tempNumAdvance = (TextView)  findViewById(R.id.tempNumAdvance_Scen3) ;

        textInfo = (TextView) findViewById(R.id.textInfo_Scen3) ;
        textPatientNo = (TextView) findViewById(R.id.textPatient);
        textPatientInfo = (TextView) findViewById(R.id.textPatientInfo_Scen3) ;

        graphBPAdvance = (GraphView)findViewById(R.id.graphBPAdvance_Scen3) ;
        graphBPAdvance.getGridLabelRenderer().setTextSize(14f);
        graphBPAdvance.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphBPAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphBPAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphBPAdvance.getViewport().setXAxisBoundsManual(true);
        graphBPAdvance.getViewport().setScrollableY(false);
        graphBPAdvance.getViewport().setMinX(10);
        graphBPAdvance.getViewport().setMaxX(15);
        graphBPAdvance.getViewport().setYAxisBoundsManual(true);
        graphBPAdvance.getViewport().setMinY(100);
        graphBPAdvance.getViewport().setMaxY(160);

        graphPulseAdvance = (GraphView)findViewById(R.id.graphPulseAdvance_Scen3) ;
        graphPulseAdvance.getGridLabelRenderer().setTextSize(14f);
        graphPulseAdvance.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphPulseAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPulseAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPulseAdvance.getViewport().setXAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setScrollableY(false);
        graphPulseAdvance.getViewport().setMinX(10);
        graphPulseAdvance.getViewport().setMaxX(15);
        graphPulseAdvance.getViewport().setYAxisBoundsManual(true);
        graphPulseAdvance.getViewport().setMinY(40);
        graphPulseAdvance.getViewport().setMaxY(130);

        graphRRAdvance = (GraphView)findViewById(R.id.graphRRAdvance_Scen3) ;
        graphRRAdvance.getGridLabelRenderer().setTextSize(14f);
        graphRRAdvance.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphRRAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphRRAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphRRAdvance.getViewport().setXAxisBoundsManual(true);
        graphRRAdvance.getViewport().setScrollableY(false);
        graphRRAdvance.getViewport().setMinX(10);
        graphRRAdvance.getViewport().setMaxX(15);
        graphRRAdvance.getViewport().setYAxisBoundsManual(true);
        graphRRAdvance.getViewport().setMinY(12);
        graphRRAdvance.getViewport().setMaxY(22);

        graphPAOAdvance = (GraphView)findViewById(R.id.graphPAOAdvance_Scen3) ;
        graphPAOAdvance.getGridLabelRenderer().setTextSize(14f);
        graphPAOAdvance.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphPAOAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphPAOAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphPAOAdvance.getViewport().setXAxisBoundsManual(true);
        graphPAOAdvance.getViewport().setScrollableY(false);
        graphPAOAdvance.getViewport().setMinX(10);
        graphPAOAdvance.getViewport().setMaxX(15);
        graphPAOAdvance.getViewport().setYAxisBoundsManual(true);
        graphPAOAdvance.getViewport().setMinY(94);
        graphPAOAdvance.getViewport().setMaxY(100);

        graphTempAdvance = (GraphView)findViewById(R.id.graphTempAdvance_Scen3) ;
        graphTempAdvance.getGridLabelRenderer().setTextSize(14f);
        graphTempAdvance.getGridLabelRenderer().setNumHorizontalLabels(6);
        graphTempAdvance.getGridLabelRenderer().setHorizontalLabelsVisible(true);
        graphTempAdvance.getGridLabelRenderer().setVerticalLabelsVisible(true);
        graphTempAdvance.getViewport().setXAxisBoundsManual(true);
        graphTempAdvance.getViewport().setScrollableY(false);
        graphTempAdvance.getViewport().setMinX(10);
        graphTempAdvance.getViewport().setMaxX(15);
        graphTempAdvance.getViewport().setYAxisBoundsManual(true);
        graphTempAdvance.getViewport().setMinY(96.6);
        graphTempAdvance.getViewport().setMaxY(99.6);


        Button createActionPlan = (Button) findViewById(R.id.buttonCAP_Scen3);

        createActionPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Action_Plan.class);
                startActivity(intent);
            }
        });


        //start of setting patient 1 data by default

        graphBPAdvance.removeAllSeries();
        graphPulseAdvance.removeAllSeries();
        graphRRAdvance.removeAllSeries();
        graphTempAdvance.removeAllSeries();
        graphPAOAdvance.removeAllSeries();

        BPNumAdvance.setText("124/82 ");
        BPNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
        pulseNumAdvance.setText("98 ");
        pulseNumAdvance.setTextColor(Color.parseColor("#1bca00"));
        RRNumAdvance.setText("14 ");
        RRNumAdvance.setTextColor(Color.parseColor("#1bca00"));
        PAONumAdvance.setText("97 ");
        PAONumAdvance.setTextColor(Color.parseColor("#1bca00"));
        tempNumAdvance.setText("98.6 ");
        tempNumAdvance.setTextColor(Color.parseColor("#1bca00"));
        textInfo.setText("Dressing burns - min 2\nStart IV - min 3\nPain control - min 4");

        seriesBP = new LineGraphSeries<DataPoint>();
        seriesPulse = new LineGraphSeries<DataPoint>();
        seriesRR = new LineGraphSeries<DataPoint>();
        seriesPAO = new LineGraphSeries<DataPoint>();
        seriesTemp = new LineGraphSeries<DataPoint>();

        textPatientNo.setText("Patient 1:");
        textPatientInfo.setText("18 y/o male, 2nd & 3rd degree burns - arms, torso");

        patienOneRandomGraphs();

        graphPulseAdvance.addSeries(seriesPulse);
        graphBPAdvance.addSeries(seriesBP);
        graphRRAdvance.addSeries(seriesRR);
        graphPAOAdvance.addSeries(seriesPAO);
        graphTempAdvance.addSeries(seriesTemp);
        //end

        final Button patientOne = (Button) findViewById(R.id.patient_One_Button_Adv_Scen3) ;
        final Button patientTwo = (Button) findViewById(R.id.patient_Two_Button_Adv_Scen3) ;
        final Button patientThree = (Button) findViewById(R.id.patient_Three_Button_Adv_Scen3) ;

        patientOne.setSelected(true);
        patientTwo.setSelected(false);
        patientThree.setSelected(false);

        patientOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBPAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();
                graphPAOAdvance.removeAllSeries();

                BPNumAdvance.setText("124/82 ");
                BPNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
                pulseNumAdvance.setText("98 ");
                pulseNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                RRNumAdvance.setText("14 ");
                RRNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                PAONumAdvance.setText("97 ");
                PAONumAdvance.setTextColor(Color.parseColor("#1bca00"));
                tempNumAdvance.setText("98.6 ");
                tempNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                textInfo.setText("Dressing burns - min 2\nStart IV - min 3\nPain control - min 4");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesPAO = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();

                textPatientNo.setText("Patient 1:");
                textPatientInfo.setText("18 y/o male, 2nd & 3rd degree burns - arms, torso");

                patientOne.setSelected(true);
                patientTwo.setSelected(false);
                patientThree.setSelected(false);

                patienOneRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBPAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphPAOAdvance.addSeries(seriesPAO);
                graphTempAdvance.addSeries(seriesTemp);

            }
        });



        patientTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBPAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();
                graphPAOAdvance.removeAllSeries();

                BPNumAdvance.setText("121/82 ");
                BPNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
                pulseNumAdvance.setText("94 ");
                pulseNumAdvance.setTextColor(Color.parseColor("#ffff4c"));
                RRNumAdvance.setText("15 ");
                RRNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                PAONumAdvance.setText("97 ");
                PAONumAdvance.setTextColor(Color.parseColor("#1bca00"));
                tempNumAdvance.setText("98.5 ");
                tempNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                textInfo.setText("Dressing burns - min 3\nTend to cuts - min 4\nEye protection - min 7");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesPAO = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();

                textPatientNo.setText("Patient 2:");
                textPatientInfo.setText("22 y/o female, glass in eye, cuts on face - active bleeding");

                patientOne.setSelected(false);
                patientTwo.setSelected(true);
                patientThree.setSelected(false);

                patientTwoRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBPAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphPAOAdvance.addSeries(seriesPAO);
                graphTempAdvance.addSeries(seriesTemp);

            }


        });



        patientThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                graphBPAdvance.removeAllSeries();
                graphPulseAdvance.removeAllSeries();
                graphRRAdvance.removeAllSeries();
                graphTempAdvance.removeAllSeries();
                graphPAOAdvance.removeAllSeries();

                BPNumAdvance.setText("119/80 ");
                BPNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                pulseNumAdvance.setText("48 ");
                pulseNumAdvance.setTextColor(Color.parseColor("#ff0000"));
                RRNumAdvance.setText("15 ");
                RRNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                PAONumAdvance.setText("98 ");
                PAONumAdvance.setTextColor(Color.parseColor("#1bca00"));
                tempNumAdvance.setText("98.4 ");
                tempNumAdvance.setTextColor(Color.parseColor("#1bca00"));
                textInfo.setText("Tripod position/get patient in position they feel okay breathing - min 1\nAssessment lungs/airway - min 2\nBreath mask - min 6\nSupplemental heat - min 13");

                seriesBP = new LineGraphSeries<DataPoint>();
                seriesPulse = new LineGraphSeries<DataPoint>();
                seriesRR = new LineGraphSeries<DataPoint>();
                seriesPAO = new LineGraphSeries<DataPoint>();
                seriesTemp = new LineGraphSeries<DataPoint>();

                textPatientNo.setText("Patient 3:");
                textPatientInfo.setText("19 y/o male, smoke inhalation - LOC");

                patientOne.setSelected(false);
                patientTwo.setSelected(false);
                patientThree.setSelected(true);

                patientThreeRandomGraphs();

                graphPulseAdvance.addSeries(seriesPulse);
                graphBPAdvance.addSeries(seriesBP);
                graphRRAdvance.addSeries(seriesRR);
                graphPAOAdvance.addSeries(seriesPAO);
                graphTempAdvance.addSeries(seriesTemp);

            }


        });

    }

    private void patienOneRandomGraphs() {

        seriesBP.appendData(new DataPoint(10, 120), true, 15);
        seriesBP.appendData(new DataPoint(11, 121), true, 15);
        seriesBP.appendData(new DataPoint(12, 124), true, 15);
        seriesBP.appendData(new DataPoint(13, 122), true, 15);
        seriesBP.appendData(new DataPoint(14, 127), true, 15);
        seriesBP.appendData(new DataPoint(15, 124), true, 15);


        seriesPulse.appendData(new DataPoint(10, 100), true, 15);
        seriesPulse.appendData(new DataPoint(11, 98), true, 15);
        seriesPulse.appendData(new DataPoint(12, 96), true, 15);
        seriesPulse.appendData(new DataPoint(13, 99), true, 15);
        seriesPulse.appendData(new DataPoint(14, 94), true, 15);
        seriesPulse.appendData(new DataPoint(15, 98), true, 15);


        seriesRR.appendData(new DataPoint(10, 17), true, 15);
        seriesRR.appendData(new DataPoint(11, 15), true, 15);
        seriesRR.appendData(new DataPoint(12, 16), true, 15);
        seriesRR.appendData(new DataPoint(13, 17), true, 15);
        seriesRR.appendData(new DataPoint(14, 18), true, 15);
        seriesRR.appendData(new DataPoint(15, 14), true, 15);


        seriesPAO.appendData(new DataPoint(10, 96), true, 15);
        seriesPAO.appendData(new DataPoint(11, 95), true, 15);
        seriesPAO.appendData(new DataPoint(12, 97), true, 15);
        seriesPAO.appendData(new DataPoint(13, 97), true, 15);
        seriesPAO.appendData(new DataPoint(14, 96), true, 15);
        seriesPAO.appendData(new DataPoint(15, 97), true, 15);


        seriesTemp.appendData(new DataPoint(10, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(11, 98.8), true, 15);
        seriesTemp.appendData(new DataPoint(12, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(13, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(14, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(15, 98.6), true, 15);
    }

    private void patientTwoRandomGraphs() {
        seriesBP.appendData(new DataPoint(10, 120), true, 15);
        seriesBP.appendData(new DataPoint(11, 117), true, 15);
        seriesBP.appendData(new DataPoint(12, 115), true, 15);
        seriesBP.appendData(new DataPoint(13, 120), true, 15);
        seriesBP.appendData(new DataPoint(14, 125), true, 15);
        seriesBP.appendData(new DataPoint(15, 121), true, 15);


        seriesPulse.appendData(new DataPoint(10, 121), true, 15);
        seriesPulse.appendData(new DataPoint(11, 105), true, 15);
        seriesPulse.appendData(new DataPoint(12, 100), true, 15);
        seriesPulse.appendData(new DataPoint(13, 98), true, 15);
        seriesPulse.appendData(new DataPoint(14, 99), true, 15);
        seriesPulse.appendData(new DataPoint(15, 94), true, 15);


        seriesRR.appendData(new DataPoint(10, 17), true, 15);
        seriesRR.appendData(new DataPoint(11, 16), true, 15);
        seriesRR.appendData(new DataPoint(12, 18), true, 15);
        seriesRR.appendData(new DataPoint(13, 19), true, 15);
        seriesRR.appendData(new DataPoint(14, 14), true, 15);
        seriesRR.appendData(new DataPoint(15, 15), true, 15);


        seriesPAO.appendData(new DataPoint(10, 97), true, 15);
        seriesPAO.appendData(new DataPoint(11, 95), true, 15);
        seriesPAO.appendData(new DataPoint(12, 96), true, 15);
        seriesPAO.appendData(new DataPoint(13, 97), true, 15);
        seriesPAO.appendData(new DataPoint(14, 98), true, 15);
        seriesPAO.appendData(new DataPoint(15, 97), true, 15);


        seriesTemp.appendData(new DataPoint(10, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(11, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(12, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(13, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(14, 98.8), true, 15);
        seriesTemp.appendData(new DataPoint(15, 98.5), true, 15);

    }

    private void patientThreeRandomGraphs() {

        seriesBP.appendData(new DataPoint(10, 115), true, 15);
        seriesBP.appendData(new DataPoint(11, 112), true, 15);
        seriesBP.appendData(new DataPoint(12, 114), true, 15);
        seriesBP.appendData(new DataPoint(13, 118), true, 15);
        seriesBP.appendData(new DataPoint(14, 117), true, 15);
        seriesBP.appendData(new DataPoint(15, 119), true, 15);


        seriesPulse.appendData(new DataPoint(10, 45), true, 15);
        seriesPulse.appendData(new DataPoint(11, 47), true, 15);
        seriesPulse.appendData(new DataPoint(12, 46), true, 15);
        seriesPulse.appendData(new DataPoint(13, 47), true, 15);
        seriesPulse.appendData(new DataPoint(14, 48), true, 15);
        seriesPulse.appendData(new DataPoint(15, 48), true, 15);


        seriesRR.appendData(new DataPoint(10, 15), true, 15);
        seriesRR.appendData(new DataPoint(11, 16), true, 15);
        seriesRR.appendData(new DataPoint(12, 16), true, 15);
        seriesRR.appendData(new DataPoint(13, 16), true, 15);
        seriesRR.appendData(new DataPoint(14, 14), true, 15);
        seriesRR.appendData(new DataPoint(15, 15), true, 15);


        seriesPAO.appendData(new DataPoint(10, 95), true, 15);
        seriesPAO.appendData(new DataPoint(11, 97), true, 15);
        seriesPAO.appendData(new DataPoint(12, 98), true, 15);
        seriesPAO.appendData(new DataPoint(13, 97), true, 15);
        seriesPAO.appendData(new DataPoint(14, 96), true, 15);
        seriesPAO.appendData(new DataPoint(15, 97), true, 15);


        seriesTemp.appendData(new DataPoint(10, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(11, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(12, 98.6), true, 15);
        seriesTemp.appendData(new DataPoint(13, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(14, 98.7), true, 15);
        seriesTemp.appendData(new DataPoint(15, 98.6), true, 15);
    }


}

