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

public class RegisterActivity extends AppCompatActivity {
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnregister =(Button) findViewById(R.id.btnregister);
btnregister.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(RegisterActivity.this, AlmostthereActivity.class);
        startActivity(i);
    }
});

    }
}
