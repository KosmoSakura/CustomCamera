package zull.chcts.a3dgarrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import zull.chcts.a3dgarrary.view.CustomGallery;
import zull.chcts.a3dgarrary.view.ImageAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <10 ; i++) {
            list.add(R.drawable.ss);
        }
        ImageAdapter adapter = new ImageAdapter(MainActivity.this, list);
        CustomGallery cc = (CustomGallery) findViewById(R.id.cc);
        cc.setAdapter(adapter);
    }
}
