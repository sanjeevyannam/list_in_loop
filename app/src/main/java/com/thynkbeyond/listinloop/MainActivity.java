package com.thynkbeyond.listinloop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ListInLoop";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showClassesButton = (Button) findViewById(R.id.show_classses);
        showClassesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"Launch VerticalGrid");
                showGrades();
            }
        });
    }

    private void showGrades() {
        Intent launchIntent = new Intent(this, GradesActivity.class);
        startActivity(launchIntent);
    }
}
