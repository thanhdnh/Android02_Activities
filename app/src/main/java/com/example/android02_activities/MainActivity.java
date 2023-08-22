package com.example.android02_activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity{
    private EditText txtName, txtBirth;
    private Switch swGender;
    private Button btCreate, btShow;
    private Students students = new Students();
  private View.OnClickListener onclick = new View.OnClickListener() {
    @Override
    public void onClick(View view) {
      if(view.getId()==R.id.btCreate){
        Student st = new Student(txtName.getText().toString(), Integer.parseInt(txtBirth.getText().toString()), (swGender.isChecked())?true:false);
        students.addStudent(st);
        txtName.setText("");
        txtBirth.setText("");
        swGender.setChecked(false);
      }else if(view.getId()==R.id.btShow){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("mydata", students);
        intent.putExtras(bundle);
        startActivity(intent);
      }
    }
  };

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtName = findViewById(R.id.txtName);
        txtBirth = findViewById(R.id.txtBirth);
        swGender = findViewById(R.id.swGender);
        btCreate = findViewById(R.id.btCreate);
        btShow = findViewById(R.id.btShow);
        btCreate.setOnClickListener(onclick);
        btShow.setOnClickListener(onclick);
    }
}
