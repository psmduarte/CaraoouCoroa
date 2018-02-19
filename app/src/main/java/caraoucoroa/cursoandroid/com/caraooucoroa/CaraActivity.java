package caraoucoroa.cursoandroid.com.caraooucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CaraActivity extends AppCompatActivity {

    private ImageView botaoVoltar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cara);

        botaoVoltar1 = findViewById(R.id.btnVoltarCaraId);
        botaoVoltar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CaraActivity.this,MainActivity.class));
            }
        });
    }
}
