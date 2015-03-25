package com.example.claude.interactivestory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    private EditText mNameField;
    private Button mStartButtoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText) findViewById(R.id.nameEditText);
        mStartButtoon = (Button) findViewById(R.id.startButton);

        mStartButtoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mNameField.getText().toString();
                startStory(name);
            }
        });
    }

    private void startStory(String name){
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);
    }


}
