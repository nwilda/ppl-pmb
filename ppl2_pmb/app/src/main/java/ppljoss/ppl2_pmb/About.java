package ppljoss.ppl2_pmb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class About extends AppCompatActivity {
    private TextView textViewsubb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewsubb = (TextView) findViewById(R.id.subb);
        textViewsubb.setText(R.string.article1);
    }



}

