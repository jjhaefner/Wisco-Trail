package edu.wisc.ece.project454;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

public class TravelAnimation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_animation);
        //reset the milestone marker once mileage has been increased
        MainScreen.milestoneSet = false;

        //TODO: calculate and save variables
        //TODO: random event generator!!!
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
        return super.onTouchEvent(event);
    }
}
