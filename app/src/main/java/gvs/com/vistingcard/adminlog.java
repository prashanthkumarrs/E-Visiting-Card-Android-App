package gvs.com.vistingcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class adminlog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminlog);
    }
    public void alogin(View view){

        final String username = ((EditText) findViewById(R.id.ausername)).getText().toString();
        final String password = ((EditText) findViewById(R.id.apassword)).getText().toString();
        if (username.length() <= 3 || password.length() <= 3 ) {
            Toast.makeText(adminlog.this, "All Fields Should be More then 3 Characters", Toast.LENGTH_SHORT).show();

        } else {

            if(username.equals("admin") && password.equals("admin"))
            {
                Intent intent=new Intent(adminlog.this,AdminHome.class);

                startActivity(intent);
            }
            else{
                Toast.makeText(adminlog.this, "Invalid Login Details", Toast.LENGTH_SHORT).show();


            }

        }



    }
}
