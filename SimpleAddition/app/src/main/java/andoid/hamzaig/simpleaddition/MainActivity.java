package andoid.hamzaig.simpleaddition;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText number1;
    EditText number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);
    }

    public void addition(View view) {
        int numberOne = Integer.parseInt(number1.getText().toString());
        int numberTwo = Integer.parseInt(number2.getText().toString());
        result.setText("Your Result is " + (numberOne + numberTwo));
        Toast.makeText(this, "Your Result is " + (numberOne + numberTwo), Toast.LENGTH_SHORT).show();
        number1.setText("");
        number2.setText("");
    }
}