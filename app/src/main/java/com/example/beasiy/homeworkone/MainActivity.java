package com.example.beasiy.homeworkone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private double billLocal = 1;

    public void saveBill(View view) {
        EditText bill = (EditText)findViewById(R.id.bill);
        String billString = bill.getText().toString();
        billLocal = Double.parseDouble(billString);
    }

    public void calculateTip(View view) {
        int id = view.getId();
        TextView tip = (TextView)findViewById(R.id.tip);
        double tipValue = billLocal;
        if (id == R.id.ten) { //ten
            tipValue *= 0.1;
        } else if (id == R.id.fifteen) { //fifteen
            tipValue *= 0.15;
        } else { //twenty
            tipValue *= 0.2;
        }
        tip.setText("HI YOUR TIP IS: $" + tipValue);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
