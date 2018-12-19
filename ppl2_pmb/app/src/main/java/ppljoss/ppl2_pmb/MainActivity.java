package ppljoss.ppl2_pmb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    public Button  btn_about, btn_fakultas, btn_berita;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_About();

    }



    public void init_About() {
        btn_about = (Button) findViewById(R.id.button_about);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent toabout = new Intent(MainActivity.this, About.class);

                startActivity(toabout);

            }
        });


    }




}

