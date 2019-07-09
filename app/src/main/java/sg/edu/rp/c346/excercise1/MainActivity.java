package sg.edu.rp.c346.excercise1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ToDoList> tdItem;
  
    CustomAdapter ca;
    ListView lvExamTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips=findViewById(R.id.listViewMovie);
        tdItem =new ArrayList<ToDoList>();
        tdItem.add(new ToDoList("MSA","1/7/2019"));
        tdItem.add(new ToDoList("Go for hair cut","22/9/2019"));


        ca=new CustomAdapter(this,R.layout.row, tdItem);


        lvExamTips.setAdapter(ca);
    }
}
