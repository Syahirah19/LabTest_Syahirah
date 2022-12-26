package workshop.mobile.labtestsyahirah;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

//    ActivityRegistrationBinding binding;
    EditText editText, edtCurrMonth, edtPrevMonth, edtFirstUsage, edtAfterUsage, edtTotal;
    Button btnCalc;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalc= findViewById(R.id.btnCalc);
        edtCurrMonth = findViewById(R.id.edtCurrMonth);
        edtPrevMonth = findViewById(R.id.edtPrevMonth);
        edtTotal = findViewById(R.id.edtTotal);

        edtFirstUsage.setText("0.862");
        edtFirstUsage.setText("0.123");


//        binding = ActivityRegistrationBinding.inflate(getLayoutInflater());
    }

    public void calculate(View view) {

        float prev=Float.parseFloat(String.valueOf(edtPrevMonth.getText()));
        float cur=Float.parseFloat(String.valueOf(edtCurrMonth.getText()));
        float first=Float.parseFloat(String.valueOf(edtFirstUsage.getText()));
        float after=Float.parseFloat(String.valueOf(edtFirstUsage.getText()));
        double industry= 0.0862;
        double resident= 0.123;
        double totalkwh=cur-prev;
        float price=0;
        float subtotal = 0.0f;
        float VAT = 0.0f;
        float total = 0.0f;
        if(totalkwh>=200) {
            price = (float) ((200 * industry) + ((totalkwh - 200) * resident));
        }
        else
        {
            price = (float) (totalkwh*industry);
        }
        String x= Float.toString(price);
        VAT = 0.21f * subtotal;
        //total = Float.parseFloat(\);
    }

}