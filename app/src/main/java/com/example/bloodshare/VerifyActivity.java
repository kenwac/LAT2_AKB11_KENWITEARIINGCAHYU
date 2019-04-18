package com.example.bloodshare;

/*10116502
Ken Wite Ariing Cahyu
AKB-11
18 April 2019 */

import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VerifyActivity extends AppCompatActivity {
Button btnSend;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        btnSend =(Button) findViewById(R.id.btnsend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(VerifyActivity.this, FinalActivity.class);
                startActivity(i);
            }
        });
    }
}
