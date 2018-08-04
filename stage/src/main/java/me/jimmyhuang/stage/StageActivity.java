package me.jimmyhuang.stage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StageActivity extends AppCompatActivity {

    public static final String JOKE_INTENT = "Joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stage);
        TextView mStageTV = findViewById(R.id.stage_tv);

        Intent intent = getIntent();

        if (intent.hasExtra(JOKE_INTENT)) {
            String joke = intent.getStringExtra(JOKE_INTENT);
            mStageTV.setText(joke);
        }
    }
}
