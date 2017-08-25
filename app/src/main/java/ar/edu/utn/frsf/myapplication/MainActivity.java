package ar.edu.utn.frsf.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText imp;
    TextView rto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt = (Button) findViewById(R.id.button);
        imp = (EditText) findViewById(R.id.importe);
        rto = (TextView) findViewById(R.id.textView9);
        bt.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
              if(Double.parseDouble(imp.getText().toString())<0){
                  rto.setTextColor(getColor(R.color.mensaje_error));
                  rto.setText("Prueba");
                  //imp.setId(R.id.textView9);
              }
           }
        });

    }


}
