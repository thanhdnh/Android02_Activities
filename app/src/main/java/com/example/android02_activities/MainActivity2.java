package com.example.android02_activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
  private TextView txtResult;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main2);

    txtResult = findViewById(R.id.txtResult);
    Intent intent = getIntent();
    Bundle bundle = intent.getExtras();
    Students students = null;
    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
      students = (Students) bundle.getSerializable("mydata", Students.class);
    } else
      students = (Students) bundle.getSerializable("mydata");
    txtResult.setText(students+"");
  }
}
