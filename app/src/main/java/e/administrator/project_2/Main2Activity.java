package e.administrator.project_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Main2Activity extends AppCompatActivity {

    ListView listViewJava ;

    String [] TitelsArrayJava , descrptionsArrayJava ;
    int [] imagesArray = { R.drawable.im2 , R.drawable.im2 ,R.drawable.im2 ,R.drawable.im2 ,R.drawable.im2 ,R.drawable.im2 ,R.drawable.im2 ,R.drawable.im2 ,R.drawable.im2 ,R.drawable.im2 };


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listViewJava = (ListView)findViewById(R.id.listViewXml) ;
        TitelsArrayJava = getResources().getStringArray(R.array.titels);
        ArrayAdapter adapter  = new ArrayAdapter<String>(getBaseContext() , R.layout.support_simple_spinner_dropdown_item , TitelsArrayJava);
        listViewJava.setAdapter(adapter);

    }

}


