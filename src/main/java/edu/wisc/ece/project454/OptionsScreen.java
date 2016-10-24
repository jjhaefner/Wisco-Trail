package edu.wisc.ece.project454;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OptionsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_screen);

        Button tx = (Button)findViewById(R.id.TravelTheTrailBtn);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/PressStart2P.ttf");
        tx.setTypeface(custom_font);

    }

    public void startTrail(View view){
        Intent intent = new Intent(this, StartTrail.class);
        startActivity(intent);
    }

    public void learnAboutTrail(View view){
        Intent intent = new Intent(this, TrailInfo.class);
        startActivity(intent);
    }

    public void topTen(View view){
        Intent intent = new Intent(this, TopTen.class);
        startActivity(intent);
    }

    public void turnSoundOff(View view){
        Intent intent = new Intent(this, ToggleSound.class);
        startActivity(intent);
    }

    public void gotoOptions(View view){
        Intent intent = new Intent(this, ManagementOptions.class);
        startActivity(intent);
    }

    public void endGame(View view){
        //end game, quit all activities
        System.exit(1);
    }
}
