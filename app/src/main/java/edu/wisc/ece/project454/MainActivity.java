package edu.wisc.ece.project454;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tx = (TextView)findViewById(R.id.appTitle);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/PressStart2P.ttf");
        tx.setTypeface(custom_font);

        waitAndGoToOptionsMenu();
    }

    private void waitAndGoToOptionsMenu(){
        Intent intent = new Intent(this, OptionsScreen.class);
        SystemClock.sleep(3000);
        startActivity(intent);

    }

    private void DisplayAppOpening(){

        TextView basicTextView = (TextView) findViewById(R.id.dotDotDot);

        while(true) {
            basicTextView.setText(".  ");
            SystemClock.sleep(500);
            basicTextView.setText(" . ");
            SystemClock.sleep(500);
            basicTextView.setText("  .");
            SystemClock.sleep(500);
        }
    }
}

