package sg.edu.rp.c346.id17032457.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 //Declare variable
    ListView lvEmployeeInfo;
    ArrayList<EmployeeInfo>alEmployeeInfo;
    //normal
    //ArrayAdapter<String>aaEmployeeInfo;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind data
        lvEmployeeInfo = findViewById(R.id.viewlistEmployee);

        //Create an object to store the array
        alEmployeeInfo = new ArrayList<>();
        alEmployeeInfo.add(new EmployeeInfo("John","Software Technical Leader",3400.0));
        alEmployeeInfo.add(new EmployeeInfo("May","Programmer",2200.0));


        //aaEmployeeInfo=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,alEmployeeInfo);
        adapter=new CustomAdapter(this,R.layout.row,alEmployeeInfo);
        lvEmployeeInfo.setAdapter(adapter);



    }
}
