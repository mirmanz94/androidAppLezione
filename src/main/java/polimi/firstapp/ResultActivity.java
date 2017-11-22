package polimi.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent =getIntent();
        String text = intent.getStringExtra("data"); //data, the same set in the MainActivity

        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText(text);

    }
}
