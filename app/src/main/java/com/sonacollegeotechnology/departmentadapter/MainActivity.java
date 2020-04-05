package com.sonacollegeotechnology.departmentadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private List<ModelItem> modelItems = new ArrayList<ModelItem>();
    private DepartmentAdapter departmentAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;

    private List<String> deptname = new ArrayList<String>();
    private List<String> contactname = new ArrayList<String>();
    private List<String> hodname = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.dept);
        recyclerView.setNestedScrollingEnabled(false);
        linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        departmentAdapter = new DepartmentAdapter(MainActivity.this, modelItems);
        recyclerView.setAdapter(departmentAdapter);

        deptname.add("Computer Science And Engineering");
        deptname.add("Electrical And Electronics Engineering");
        deptname.add("Information Technology");
        deptname.add("Fashion Technology");
        deptname.add("Electronics and Communication Engineering");
        deptname.add("Civil Engineering");
        deptname.add("Bio Medical Engineering");

        contactname.add("Dr.B.Sathiyabhama, M.Tech., Ph.D");
        contactname.add("Dr.S.Padma, M.E., Ph.D.");
        contactname.add("Dr.J.Akilandeswari M.E., Ph.D.");
        contactname.add("Dr.D.Raja, Ph.D");
        contactname.add("Dr.R.S.Sabeenian");
        contactname.add("Dr.R.Malathy,Ph.D");
        contactname.add("Dr.R.S.Sabeenian,Ph.D");

        hodname.add("+91 – 427 – 2443545, 4099744");
        hodname.add("+91 – 427 – 4099739");
        hodname.add("+91 – 427 – 4099999 / 4099835");
        hodname.add("+91 – 427 – 4099999 / 4099835");
        hodname.add("+91 – 427 – 2443545, 4099777");
        hodname.add("+91 – 427 – 4099766");
        hodname.add("+91 – 427 – 2443545, 4099777");

        addDepartments();

    }

    private void addDepartments() {

        for (int i = 0; i < contactname.size(); i++) {

            ModelItem modelItem = new ModelItem();

            modelItem.setDeptname(deptname.get(i));
            modelItem.setContactname(contactname.get(i));
            modelItem.setHodname(hodname.get(i));

            modelItems.add(modelItem);
        }
        departmentAdapter.notifyDataSetChanged();
    }

}
