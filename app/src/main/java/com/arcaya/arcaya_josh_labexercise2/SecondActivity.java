package com.arcaya.arcaya_josh_labexercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText courseIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        courseIn = findViewById(R.id.editText9);
    }

    public void validate(View v) {
        SharedPreferences sp = getSharedPreferences("myCourses", MODE_PRIVATE);
    /* from the xml file */
    String et1SP = sp.getString("course4",null);
    String et2SP = sp.getString("course3", null);
    String et3SP = sp.getString("course6",null);
    String et4SP = sp.getString("course5", null);
    String et5SP = sp.getString("course8",null);
    String et6SP = sp.getString("course7", null);
    String et7SP = sp.getString("course2",null);
    String et8SP = sp.getString("course1", null);


    /* from the widget */
    String crs = courseIn.getText().toString();

        if (crs.equals(et1SP) || crs.equals(et2SP) || crs.equals(et3SP) || crs.equals(et4SP) || crs.equals(et5SP) || crs.equals(et6SP) || crs.equals(et7SP) || crs.equals(et8SP)){
        Toast.makeText(this, "Course is offered in UST.", Toast.LENGTH_LONG).show();
    }
        else {
        Toast.makeText(this, "Course is not offered in UST.", Toast.LENGTH_LONG).show();
    }
    }

    public void backPage(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
