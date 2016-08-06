package ua.com.wadyan.recyclerview_viewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter rvAdapter;
    private RecyclerView.LayoutManager rvLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        rvLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(rvLayoutManager);

        rvAdapter = new MainRecyclerViewAdapter(getDataSet());
        recyclerView.setAdapter(rvAdapter);
    }

    String[] getDataSet(){
        String[] dataSet = new String[100];
        for (int i = 0; i < 100; i++) {
            dataSet[i] = "item " + i;
        }
        return dataSet;
    }
}
