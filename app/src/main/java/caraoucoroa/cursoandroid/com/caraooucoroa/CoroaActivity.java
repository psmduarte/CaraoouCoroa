package caraoucoroa.cursoandroid.com.caraooucoroa;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CoroaActivity extends AppCompatActivity {

    private ImageView botaoVoltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coroa);

        botaoVoltar2 = findViewById(R.id.btnVotarCoroaId);
        botaoVoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CoroaActivity.this,MainActivity.class));
            }
        });

    }
}
