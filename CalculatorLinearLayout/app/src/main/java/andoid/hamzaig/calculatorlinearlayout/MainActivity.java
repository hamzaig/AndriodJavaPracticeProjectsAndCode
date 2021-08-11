package andoid.hamzaig.calculatorlinearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView result;
    boolean cal = false;
    private double firstValue;
    private double secondValue;
    private String type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.result);
    }

    public void calc(View v) {
        switch (v.getId()) {
            case (R.id.buttonC):
                result.setText("0");
                break;
            case (R.id.button0):
                val(0);
                break;
            case (R.id.button1):
                val(1);
                break;
            case (R.id.button2):
                val(2);
                break;
            case (R.id.button3):
                val(3);
                break;
            case (R.id.button4):
                val(4);
                break;
            case (R.id.button5):
                val(5);
                break;
            case (R.id.button6):
                val(6);
                break;
            case (R.id.button7):
                val(7);
                break;
            case (R.id.button8):
                val(8);
                break;
            case (R.id.button9):
                val(9);
                break;
            case (R.id.buttonPower):
                firstValue = Double.parseDouble( result.getText().toString());
                type = "^";
                cal = true;
                break;
            case (R.id.buttonPercent):
                firstValue = Double.parseDouble( result.getText().toString());
                double ans = firstValue / 100 ;
                result.setText(String.valueOf(ans));
                break;
            case (R.id.buttonDivide):
                firstValue = Double.parseDouble( result.getText().toString());
                type = "/";
                cal = true;
                break;
            case (R.id.buttonMultiply):
                firstValue = Double.parseDouble( result.getText().toString());
                type = "*";
                cal = true;
                break;
            case (R.id.buttonMinus):
                firstValue = Double.parseDouble( result.getText().toString());
                type = "-";
                cal = true;
                break;
            case (R.id.buttonPlus):
                firstValue = Double.parseDouble( result.getText().toString());
                type = "+";
                cal = true;
                break;
            case (R.id.buttonEqual):
                secondValue = Double.parseDouble( result.getText().toString());
                switch (type){
                    case "+":
                        ans = firstValue + secondValue;
                        result.setText(String.valueOf(ans));
                        break;
                    case "-":
                        ans = firstValue - secondValue;
                        result.setText(String.valueOf(ans));
                        break;
                    case "*":
                        ans = firstValue * secondValue;
                        result.setText(String.valueOf(ans));
                        break;
                    case "/":
                        ans = firstValue / secondValue;
                        result.setText(String.valueOf(ans));
                        break;
                    case "^":
                        ans = Math.pow(firstValue, secondValue);
                        result.setText(String.valueOf(ans));
                        break;
                }
                cal = true;
                break;

        }
    }


    void val(int t)
    {
        if (result.getText().equals("0") || cal == true)
            result.setText(String.valueOf(t));
        else
            result.setText(result.getText() + String.valueOf(t));
        cal = false;
    }
}