package com.example.student.clctcau1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView ketqua;
    EditText soa,sob,soc;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connect();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a,b,c;
                String kq="";
                a= Float.parseFloat(soa.getText().toString());
                b= Float.parseFloat(sob.getText().toString());
                c= Float.parseFloat(soc.getText().toString());
                if(a == 0){
                    Toast.makeText(MainActivity.this, "so a không được bằng 0", Toast.LENGTH_SHORT).show();
                }
                else{
                    Float delta;
                    delta=b*b-4*a*c;
                    if(delta<0){
                        kq="Phương Trình vô nghiệm";
                    }
                    else if(delta==0){
                        kq="Phương Trình có nghiệm kép";
                    }
                    else if(delta==0){
                        kq="Phương Trình có 2 nghiệm phân biệt x1="+(-b+Math.sqrt(delta))/2*a + ",x2=" +(-b-Math.sqrt(delta))/2*a;
                    }

                }
                ketqua.setText(kq);
            }
        });
    }
    private void connect(){
        bt=(Button) findViewById(R.id.bt);
        ketqua=(TextView) findViewById(R.id.kq);
        soa=(EditText) findViewById(R.id.soa);
        sob=(EditText) findViewById(R.id.sob);
        soc=(EditText) findViewById(R.id.soc);
    }
}
