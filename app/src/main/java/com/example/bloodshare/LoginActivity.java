package com.example.bloodshare;

/*10116502
Ken Wite Ariing Cahyu
AKB-11
18 April 2019 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btnconnectwithfacebook;
    TextView regist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

btnconnectwithfacebook =(Button) findViewById(R.id.btnconnectwithfacebook);
btnconnectwithfacebook.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(i);
    }
});
    }
}
