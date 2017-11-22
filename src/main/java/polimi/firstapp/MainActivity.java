package polimi.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //R.string.hello -- we had already created a string in value/strings.xml and now we can access it in this way
        setContentView(R.layout.activity_main_linear); //use class R to access to resources, we don't need to access it directly
        Button button1 = (Button) findViewById(R.id.button1);
        final MainActivity self = this; // to launch another activity we need to take the reference, we cannot do in the inner class because we will refer to the inner class and not to Main activity
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                EditText editText = (EditText)findViewById(R.id.editText1);
                String text = editText.getText().toString();
                System.out.print(text);
                TextView textView = (TextView) findViewById(R.id.TextView2);
                textView.setText(text);

                //write to another on another activity and launch it
                Intent intent = new Intent(self, ResultActivity.class);
                intent.putExtra("data", text);//"data" is a key to retrieve text
                startActivity(intent);
            }
        });
    }

    public void clickMe(View view) { //refere to activity_main_linear.xml reference onClick
        System.out.println("Click You"); //print in console
    }
}
