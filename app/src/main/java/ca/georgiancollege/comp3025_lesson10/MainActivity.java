package ca.georgiancollege.comp3025_lesson10;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NAME_INFO = "ca.georgiancollege.comp3025_lesson10.Android.UserName";
    public String NameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText NameEditText = (EditText) findViewById(R.id.NameEditText);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInfoIntent = new Intent(MainActivity.this, InfoActivity.class);
                startActivity(openInfoIntent);
            }
        });

        // ok button
        Button OKButton = (Button) findViewById(R.id.OKButton);
        OKButton.setOnClickListener(new View.OnClickListener() {
            @Override
        public  void onClick(View view) {
                NameString = NameEditText.getText().toString();
                openInfoScreen();
            }
        });

        // cancel
        Button CancelButton = (Button) findViewById(R.id.CancelButton);
        CancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NameEditText.setText(R.string.EnterName);
            }
        });

        // highlight edit text
        NameEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NameEditText.setText(""); // selectAll();
            }

        });
    }

    public void openInfoScreen() {
        Intent openInfoIntent = new Intent(MainActivity.this, InfoActivity.class);
        openInfoIntent.putExtra("NAME_INFO", NameString);
        startActivity(openInfoIntent);
    }


}
