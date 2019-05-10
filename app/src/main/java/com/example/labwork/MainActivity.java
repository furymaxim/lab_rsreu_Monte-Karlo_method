package com.example.labwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mR;
    Button mButton;
    LinearLayout mLinearLayout;
    TextView mTextView;
    String RValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mR = findViewById(R.id.R);
        mButton = findViewById(R.id.Solve);
        mLinearLayout = findViewById(R.id.layout);
        mTextView = findViewById(R.id.answer);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RValue = mR.getText().toString();
                if (RValue.equals("")) {
                    Toast.makeText(getApplicationContext(),"Введите значение R",Toast.LENGTH_SHORT).show();
                    mTextView.setText("");
                    mLinearLayout.setVisibility(View.INVISIBLE);
                } else {
                    Solution I = new Solution(RValue);
                    mLinearLayout.setVisibility(View.VISIBLE);
                    mTextView.setText(Double.toString(I.GetSolution()));
                }
            }
        });

    }
}
