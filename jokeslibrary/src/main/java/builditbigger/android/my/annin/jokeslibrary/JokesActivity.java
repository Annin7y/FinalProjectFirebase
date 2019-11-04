package builditbigger.android.my.annin.jokeslibrary;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity
{
    public static final String JOKE_STRING = "joke_string";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        Intent intent = getIntent();
        String result = intent.getStringExtra(JOKE_STRING);
        TextView textView = findViewById(R.id.joke_android);
        textView.setText(result);
    }
}
