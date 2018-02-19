package caraoucoroa.cursoandroid.com.caraooucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.botaoJogarId);
        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();

                int aleatorio = random.nextInt(2);

                if (aleatorio==0){
                    startActivity(new Intent(MainActivity.this, CaraActivity.class));
                }
                if (aleatorio==1){
                    startActivity(new Intent(MainActivity.this, CoroaActivity.class));
                }

            }
        });

    }
}
