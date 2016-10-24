package com.efrainmunoz.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.efrainmunoz.interactivestory.R;

public class MainActivity extends AppCompatActivity {
    private EditText mNameText;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameText = (EditText) findViewById(R.id.nameEditText);
        mStartButton = (Button) findViewById(R.id.startButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(mNameText.getText());
                startStory(name);
            }
        };

        mStartButton.setOnClickListener(listener);
    }

    private void startStory(String name) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra(String.valueOf(R.string.key_name), name);
        startActivity(intent);
    }
}
