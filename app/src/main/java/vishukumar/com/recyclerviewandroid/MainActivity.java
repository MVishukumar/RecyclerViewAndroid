package vishukumar.com.recyclerviewandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    StudenAdapter studenAdapter;

    List<Student> studentList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        studentList.add(new Student("vishu", "001"));
        studentList.add(new Student("vishu", "002"));
        studentList.add(new Student("vishu", "003"));
        studentList.add(new Student("vishu", "004"));
        studentList.add(new Student("vishu", "005"));
        studentList.add(new Student("vishu", "006"));
        studentList.add(new Student("vishu", "007"));
        studentList.add(new Student("vishu", "008"));
        studentList.add(new Student("vishu", "009"));
        studentList.add(new Student("vishu", "010"));
        studentList.add(new Student("vishu", "011"));
        studentList.add(new Student("vishu", "012"));
        studentList.add(new Student("vishu", "013"));
        studentList.add(new Student("vishu", "014"));
        studentList.add(new Student("vishu", "015"));
        studentList.add(new Student("vishu", "016"));

        studenAdapter = new StudenAdapter(this, studentList);


        recyclerView.setAdapter(studenAdapter);
    }
}