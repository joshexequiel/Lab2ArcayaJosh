package com.arcaya.arcaya_josh_labexercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5,et6,et7,et8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editText);
         et2 = findViewById(R.id.editText2);
         et3 = findViewById(R.id.editText3);
         et4 = findViewById(R.id.editText4);
         et5 = findViewById(R.id.editText5);
         et6 = findViewById(R.id.editText6);
         et7 = findViewById(R.id.editText7);
         et8 = findViewById(R.id.editText8);

    }

    public void saveData(View v) {
        SharedPreferences sp = getSharedPreferences("myCourses", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        String crs1 = et1.getText().toString();
        String crs2 = et2.getText().toString();
        String crs3 = et3.getText().toString();
        String crs4 = et4.getText().toString();
        String crs5 = et5.getText().toString();
        String crs6 = et6.getText().toString();
        String crs7 = et7.getText().toString();
        String crs8 = et8.getText().toString();

        editor.putString("course1", crs1);
        editor.putString("course2", crs2);
        editor.putString("course3", crs3);
        editor.putString("course4", crs4);
        editor.putString("course5", crs5);
        editor.putString("course6", crs6);
        editor.putString("course7", crs7);
        editor.putString("course8", crs8);

        editor.commit();

        Toast.makeText(this, "Courses are saved....", Toast.LENGTH_LONG).show();
    }

    public void nextPage(View v){
        Intent i = new Intent(this, SecondActivity.class);
        startActivity(i);
    }
}
