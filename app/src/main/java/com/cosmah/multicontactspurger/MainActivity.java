package com.cosmah.multicontactspurger;



import static android.widget.ListView.*;
import com.cosmah.multicontactspurger.CustomAdaptor;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            //create a list of data to display
        List<String> dataList = new ArrayList<>();
        dataList.add("Item 1");
        dataList.add("Item 2");
        dataList.add("Item 3");

        // Declare and initialize the ListView
        ListView listView = findViewById(R.id.listView);

        //create and set the custom adapter
        CustomAdaptor adapter = new CustomAdaptor(this, dataList);
        listView.setAdapter(adapter);




    }
}