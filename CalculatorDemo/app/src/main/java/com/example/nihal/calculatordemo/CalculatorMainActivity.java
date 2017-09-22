package com.example.nihal.calculatordemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorMainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq, del;
    TextView et;
    int val1,val2;
    boolean add,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_main);
        b1=(Button) findViewById(R.id.button1);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.button9);
        b0=(Button) findViewById(R.id.button0);
        bdot=(Button) findViewById(R.id.button_dot);
        badd=(Button) findViewById(R.id.button_add);
        bsub=(Button) findViewById(R.id.button_sub);
        bmul=(Button) findViewById(R.id.button_mul);
        bdiv=(Button) findViewById(R.id.button_div);
        beq=(Button) findViewById(R.id.button_eq);
        et=(TextView) findViewById(R.id.edit_text);
        del = (Button) findViewById(R.id.delete_text);
        //click button for 1 which displays one to edit text/
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"1");
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText("");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                add=true;
                et.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                sub=true;
                et.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                div=true;
                et.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val1=Integer.parseInt(et.getText()+"");
                mul=true;
                et.setText(null);
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                val2=Integer.parseInt(et.getText()+"");
                if (add==true) {
                    et.setText(val1+val2+"");
                    add=false;
                }
                if (sub==true) {
                    et.setText(val1-val2+"");
                    sub=false;
                }
                if (mul==true) {
                    et.setText(val1*val2+"");
                    mul=false;
                }
                if (div==true) {
                    et.setText(val1/val2+"");
                    div=false;
                }
            }

        });
    }


}
