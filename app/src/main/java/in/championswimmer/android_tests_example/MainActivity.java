package in.championswimmer.android_tests_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText km;
    Button calc;
    TextView fare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        km = (EditText) findViewById(R.id.editText);
        calc = (Button) findViewById(R.id.button);
        fare = (TextView) findViewById(R.id.textView);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double dist = Double.valueOf(km.getText().toString());
                String rupees = formatFare(fareFromKm(dist));
                fare.setText(rupees);

            }
        });

    }

    public static String formatFare (double fare) {
        DecimalFormat precision = new DecimalFormat("0.00");
        return precision.format(fare);
    }

    public static Double fareFromKm (double km) {
        double fare = (25) + ((km - 2) * 9);
        return fare;
    }
}
