package e.administrator.project_2;

import android.content.Intent;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText emailJava , passowrdJava ;
    TextView registere_TextJava  ;
    Button log_ButtonJava ;
    String emailTxt , passowrdTxt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailJava = (EditText)this.findViewById(R.id.editTextEmailXml);
        passowrdJava = ( EditText) this.findViewById(R.id.editTextPassowrdXml);
        log_ButtonJava = (Button)this.findViewById(R.id.log_ButtonXml);
        registere_TextJava = (TextView)this.findViewById(R.id.registere_TextXml);
        log_ButtonJava.setOnClickListener(this);
        registere_TextJava.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        Resources resources = getResources() ;
        String mess = resources.getString(R.string.logError);

        if( R.id.log_ButtonXml == v.getId()){


       //     if( ( emailTxt == emailJava.getText().toString()) && ( passowrdTxt == passowrdJava.getText().toString())){

                Intent intent = new Intent(this,Main2Activity.class);
                startActivity(intent);
        //    }

        /*    else {

                Toast.makeText(this , mess , Toast.LENGTH_SHORT).show();
            }*/

        }

        else if( R.id.registere_TextXml  == v.getId()){

            Intent intent = new Intent(this,Main3Activity.class);
            startActivity(intent);
        }
    }


}
