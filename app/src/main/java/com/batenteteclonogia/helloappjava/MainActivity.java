package com.batenteteclonogia.helloappjava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TOTAL_COUNT = "total_count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toastMe(View view) {
        // Toast myToast = Toast.makeText(this, message, duration)
        Toast myToast = Toast.makeText(this, "Hello Toast!",
                Toast.LENGTH_SHORT);
        myToast.show();
    }

    public void countMe(View view) {
        // get text view
        TextView showCountTextView =
                (TextView) findViewById(R.id.textView);

        // get value of text view
        String countString = showCountTextView.getText().toString();

        // convert to a number and increment it
        Integer count = Integer.parseInt(countString);
        count += 1;

        // display the new value in screen
        showCountTextView.setText(count.toString());
    }

    public void randomMe(View view) {
        // create an Intent to start the second screen
        Intent secondScreen = new Intent(this, Main2Activity.class);

        // pass information to intent
        TextView showCountTextView =
                (TextView) findViewById(R.id.textView);
        // get value of text view
        String countString = showCountTextView.getText().toString();
        // convert to a number and increment it
        Integer count = Integer.parseInt(countString);

        secondScreen.putExtra(TOTAL_COUNT, count);

        startActivity(secondScreen);
    }
}
