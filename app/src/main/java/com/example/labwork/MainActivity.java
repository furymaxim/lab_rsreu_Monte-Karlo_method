package com.example.labwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText mR;
    Button mButton;
    LinearLayout mLinearLayout;
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Double RValue;

        mR = findViewById(R.id.R);
        mButton = findViewById(R.id.Solve);
        mLinearLayout = findViewById(R.id.layout);
        mTextView = findViewById(R.id.answer);

        RValue = Double.valueOf(mR.getText().toString());

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Solution I = new Solution(RValue);
                mLinearLayout.setVisibility(View.VISIBLE);
                mTextView.setText(Double.toString(I.GetSolution()));
            }
        });

    }
}
