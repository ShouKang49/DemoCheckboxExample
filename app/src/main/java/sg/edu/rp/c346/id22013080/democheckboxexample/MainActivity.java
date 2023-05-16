package sg.edu.rp.c346.id22013080.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox btnEnabled;
    Button btnCheck;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnabled = findViewById(R.id.checkBox);
        btnCheck = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button Click",Toast.LENGTH_LONG).show();
                if(btnEnabled.isChecked()){
                    tvDisplay.setText("The discount is given");
                }
                else{
                    tvDisplay.setText("The discount is not given");
                }
                Log.i("MyActivity", "Inside onClick()");
            }
        });
    }
}