package ua.com.wadyan.viewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.list_view);

        DataAdapter dataAdapter = new DataAdapter(this, getDataSet());
        listView.setAdapter(dataAdapter);
    }

    String[] getDataSet(){
        String[] dataSet = new String[100];
        for (int i = 0; i < 100; i++) {
            dataSet[i] = "item " + i;
        }
        return dataSet;
    }
}
