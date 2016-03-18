package ca.georgiancollege.comp3025_lesson10;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    private String UserName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final TextView InfoTextView = (TextView) findViewById(R.id.InfoTextView);

        // get username from extra
        UserName = getIntent().getExtras().getString("NAME_INFO");
        InfoTextView.setText(UserName);

    }

}
