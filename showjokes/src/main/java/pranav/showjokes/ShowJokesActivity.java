package pranav.showjokes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Pranav on 17/07/16.
 */
public class ShowJokesActivity extends AppCompatActivity {

    TextView mJokesTV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_show_jokes);

        mJokesTV = (TextView) findViewById(R.id.joke_tv);
        Intent in = getIntent();
        String joke = in.hasExtra("joke") ? in.getStringExtra("joke") : null;
        if(joke == null){
            Toast.makeText(this, "No joke available", Toast.LENGTH_LONG).show();
        }else{
            mJokesTV.setText(joke);
        }


    }
}
