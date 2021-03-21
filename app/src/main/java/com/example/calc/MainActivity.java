package com.example.calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonplus;
    private Button buttonminus;
    private Button buttonmult;
    private Button buttondiv;
    private Button buttonequals;
    private Button buttonclear;
    private EditText op1;
    private EditText op2;
    private EditText res;
    private TextView operand;
    private String val;
    private String b;
    private Double x;
    private Double y;
    private Double ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
        button0=(Button) findViewById(R.id.button11);
        buttonplus=(Button) findViewById(R.id.button10);
        buttonminus=(Button) findViewById(R.id.button12);
        buttonmult=(Button) findViewById(R.id.button13);
        buttondiv=(Button) findViewById(R.id.button14);
        buttonequals=(Button) findViewById(R.id.button15);
        buttonclear=(Button) findViewById(R.id.button16);
        op1=(EditText) findViewById(R.id.editTextNumberSigned) ;
        op2=(EditText) findViewById(R.id.editTextNumberSigned2);
        res=(EditText) findViewById(R.id.editTextNumberSigned3);
        operand=(TextView) findViewById(R.id.textView) ;

        operand.setText("");
        View.OnClickListener ky=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;
                val = b.getText().toString();
                if (operand.length()==0) {
                    op1.append(val);
                } else {
                    op2.append(val);
                }
            }
        };
        button1.setOnClickListener(ky);
        button2.setOnClickListener(ky);
        button3.setOnClickListener(ky);
        button4.setOnClickListener(ky);
        button5.setOnClickListener(ky);
        button6.setOnClickListener(ky);
        button7.setOnClickListener(ky);
        button8.setOnClickListener(ky);
        button9.setOnClickListener(ky);
        button0.setOnClickListener(ky);


        View.OnClickListener ob=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand.setText("");
                Button b=(Button) v;
                val=b.getText().toString();
                operand.append(val);
            }
        };
        buttonplus.setOnClickListener(ob);
        buttonmult.setOnClickListener(ob);
        buttonminus.setOnClickListener(ob);
        buttondiv.setOnClickListener(ob);

        View.OnClickListener u=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val= operand.getText().toString();
                String g=op1.getText().toString();
                String s=op2.getText().toString();
                x=Double.valueOf(g);
                y=Double.valueOf(s);
                switch(val)
                {
                    case "+":
                    {
                       ans=x+y;
                       break;
                    }
                    case "-":
                    {
                        ans=x-y;
                        break;
                    }
                    case "*":
                    {
                        ans=x*y;
                        break;
                    }
                    case "/":
                    {
                        if(y==0.0)
                        {
                            ans=0.0;
                        }
                        ans=x/y;
                        break;
                    }
                }
                String fin=Double.toString(ans);
                res.setText(fin);
            }
        };
     buttonequals.setOnClickListener(u);

        View.OnClickListener q=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               op1.setText("");
               op2.setText("");
               res.setText("");
               operand.setText("");
            }
        };
        buttonclear.setOnClickListener(q);
    }
}