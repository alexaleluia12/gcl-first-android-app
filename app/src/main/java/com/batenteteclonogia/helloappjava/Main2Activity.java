package com.batenteteclonogia.helloappjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        showRandomNumber();
    }

    public void showRandomNumber() {
        // get headin display
        TextView headingView = (TextView) findViewById(R.id.textview_label);
        // get random number display
        TextView ramdomView = (TextView) findViewById(R.id.textview_random);

        // get count from intent extra
        Integer count = getIntent().getIntExtra(TOTAL_COUNT, 0);

        Random random = new Random();
        int randInt = 0;
        if (count > 0) {
            randInt = random.nextInt(count);
        }

        // set random value
        ramdomView.setText(Integer.toString(randInt));

        // update heading with count value
        headingView.setText(getString(R.string.ramdon_heading, count));
    }
}
