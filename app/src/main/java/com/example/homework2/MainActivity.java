package com.example.homework2;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        input = (EditText)findViewById(R.id.et_input);
        submit =(Button) findViewById(R.id.btn_submit);

        submit.setOnClickListener(calcResult);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_about:
                AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("About this app");
                ad.setMessage("Author:Wei-Ying Xin");

                DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface di , int i){

                    }
                };
                ad.setPositiveButton("OK",listener);
                ad.show();
                break;
            case R.id.action_reset:
                input.setText("");
                break;
        }
        return true;
    }

    private View.OnClickListener calcResult = new View.OnClickListener(){
        @Override
        public void  onClick(View v){
            Toast.makeText(MainActivity.this, "Hello " + input.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    };
}
