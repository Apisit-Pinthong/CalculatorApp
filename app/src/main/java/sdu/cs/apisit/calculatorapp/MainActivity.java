package sdu.cs.apisit.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ผูกตัวแปร JAVA กับ อิลิเมนต์บน XML
        final EditText numberEditText1 = findViewById(R.id.edt_Number1);
        final EditText numberEditText2 = findViewById(R.id.edt_Number2);
        Button addButton = findViewById(R.id.btnAdd);
        Button addButton2 = findViewById(R.id.btnAdd2);
        Button addButton3 = findViewById(R.id.btnAdd3);
        Button addButton4 = findViewById(R.id.btnAdd4);
        final TextView resultTextView = findViewById(R.id.tvResult);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numberEditText2.getText().toString());
                int result = num1 + num2;
                resultTextView.setText(result+"");
            }
        });
        addButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numberEditText1.getText().toString());
                int num2 = Integer.parseInt(numberEditText2.getText().toString());
                int result = num1 - num2;
               resultTextView.setText(result+"");
            }
        });
addButton3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int num1 = Integer.parseInt(numberEditText1.getText().toString());
        int num2 = Integer.parseInt(numberEditText2.getText().toString());
        int result = num1 * num2;
        resultTextView.setText(result+"");
    }
});
addButton4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        int num1 = Integer.parseInt(numberEditText1.getText().toString());
        int num2 = Integer.parseInt(numberEditText2.getText().toString());
        int result = num1 / num2;
        resultTextView.setText(result+"");
    }
});
    }//end onCreate() Method
}//end class
