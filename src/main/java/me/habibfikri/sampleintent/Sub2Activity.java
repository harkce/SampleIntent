package me.habibfikri.sampleintent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by habib on 31/12/15.
 * Semangat!!
 */
public class Sub2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        TextView txtData = (TextView) findViewById(R.id.txt_data);
        String receivedData = getIntent().getStringExtra("data");
        txtData.setText(receivedData);
    }
}
