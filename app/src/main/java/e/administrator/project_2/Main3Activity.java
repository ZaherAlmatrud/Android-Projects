package e.administrator.project_2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {


    EditText  editTextFirstNameJava , editTextSecondNameJava , editTextEmailJava , editTextPasswordJava ;
    String    stringFirstName , stringSecondName , stringEmail , stringPassword ;
    Button    saveInfoAccountButtonJava , toMenuPageJava , appExitJava;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        saveInfoAccountButtonJava = (Button)this.findViewById(R.id.saveInfoAccountButton_Xml);
        saveInfoAccountButtonJava.setOnClickListener(this);
        toMenuPageJava = (Button)this.findViewById(R.id.toMenuPage_Xml);
        toMenuPageJava.setOnClickListener(this);
        appExitJava = (Button)this.findViewById(R.id.appExitXml);
        appExitJava.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Resources resources =  getResources();
        String    message   = resources.getString(R.string.SaveNewAccount);


        if( R.id.saveInfoAccountButton_Xml == v.getId() ){

            stringFirstName = editTextFirstNameJava.getText().toString();
            stringSecondName = editTextSecondNameJava.getText().toString();
            stringEmail = editTextEmailJava.getText().toString();
            stringPassword = editTextPasswordJava.getText().toString();

            if(true){

                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            }

            else {

                
            }


        }

       else if( R.id.toMenuPage_Xml == v.getId()){

            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);

       }

       else if( R.id.appExitXml == v.getId() ){

            Toast.makeText(this, " شكرا لك لاستخدامك تطبيقنا و أهلا وسهلا بك ", Toast.LENGTH_SHORT).show();
            ActivityCompat.finishAffinity(this);

        }

    }



}
