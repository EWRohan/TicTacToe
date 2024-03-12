package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1 ,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,res;
int flag=0;
int count=0;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });
    }
    private void init()
    {
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        res=findViewById(R.id.btnReset);
    }
    public void Check(View v)
    {
        Button btnCur=(Button)v;

        if(btnCur.getText().toString().equals("")) {

            count++;

            if (flag==0) {
                btnCur.setText("X");
                flag = 1;
            }
            else {
                btnCur.setText("O");
                flag = 0;
            }
            //condition
            if (count >= 5) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {

                    Toast.makeText(this, "Winner is :" + b1, Toast.LENGTH_SHORT).show();

                    setColor(btn1,btn2,btn3);

                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {

                    Toast.makeText(this, "Winner is :" + b4, Toast.LENGTH_SHORT).show();

                    setColor(btn4,btn5,btn6);

                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {

                    Toast.makeText(this, "Winner is :" + b8, Toast.LENGTH_SHORT).show();

                    setColor(btn7,btn8,btn9);

                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {

                    Toast.makeText(this, "Winner is :" + b1, Toast.LENGTH_SHORT).show();

                    setColor(btn1,btn4,btn7);

                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {

                    Toast.makeText(this, "Winner is :" + b2, Toast.LENGTH_SHORT).show();

                    setColor(btn2,btn5,btn8);
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {

                    Toast.makeText(this, "Winner is :" + b3, Toast.LENGTH_SHORT).show();

                    setColor(btn3,btn6,btn9);

                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {

                    Toast.makeText(this, "Winner is :" + b1, Toast.LENGTH_SHORT).show();

                    setColor(btn1,btn5,btn9);

                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {

                    Toast.makeText(this, "Winner is :" + b3, Toast.LENGTH_SHORT).show();

                    setColor(btn3,btn5,btn7);

                } else if (count == 9) {
                    Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();

                }
            }
        }
    }
    public void reset()
    {
        flag=0;
        count=0;
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        btn1.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn2.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn3.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn4.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn5.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn6.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn7.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn8.setBackgroundColor(getResources().getColor(R.color.btnColor));
        btn9.setBackgroundColor(getResources().getColor(R.color.btnColor));
    }
    public void setColor(Button A,Button B,Button C)
    {
        A.setBackgroundColor(getResources().getColor(R.color.green));
        B.setBackgroundColor(getResources().getColor(R.color.green));
        C.setBackgroundColor(getResources().getColor(R.color.green));
    }
}