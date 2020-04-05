package com.sonacollegeotechnology.departmentadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DepartmentInfo extends AppCompatActivity {

    TextView deptName,deptContact,deptHod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_info);

        deptName = findViewById(R.id.deptName);
        deptContact = findViewById(R.id.deptContact);
        deptHod = findViewById(R.id.deptHod);

        Intent intent = getIntent();
        String deptname = intent.getStringExtra("deptname");
        String deptHodd = intent.getStringExtra("hodname");
        String deptcontact = intent.getStringExtra("contactname");

        deptName.setText(deptname);
        deptContact.setText(deptcontact);
        deptHod.setText(deptHodd);
    }
}
