package com.example.bloodshare;

import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*10116502
Ken Wite Ariing Cahyu
AKB-11
18 April 2019 */

public class AlmostthereActivity extends AppCompatActivity {
    Button btnverify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almostthere);

        btnverify=(Button) findViewById(R.id.btnverify);
        btnverify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AlmostthereActivity.this, VerifyActivity.class);
                startActivity(i);
            }
        });
    }
}
