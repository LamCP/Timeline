package com.maic.timeline.timeline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.maic.timeline.timeline.model.Plan;
import com.orm.SugarContext;
import com.orm.SugarRecord;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Plan plan = new Plan("adasd",new Date());
        plan.save();

        Plan plan1 = Plan.findById(Plan.class,1);
        Log.e("orm",plan1.planName);



    }
}
