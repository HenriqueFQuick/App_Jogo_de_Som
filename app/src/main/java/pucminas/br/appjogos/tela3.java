package pucminas.br.appjogos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class tela3 extends AppCompatActivity implements View.OnClickListener {

    private Button btn_chute;
    private EditText edt_chute;
    private TextView txt_chute;
    private int numero = 0;
    private int chute = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        btn_chute = findViewById(R.id.btn_Chute);
        edt_chute = findViewById(R.id.edt_chute);
        txt_chute = findViewById(R.id.txt_Tentativas);

        btn_chute.setOnClickListener(this);

        Random random = new Random();
        numero = random.nextInt(100);
        //Toast.makeText(getApplicationContext(), numero+"", Toast.LENGTH_SHORT).show();

    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_Chute) {
            if (Integer.parseInt(edt_chute.getText().toString()) == numero) {
                Toast.makeText(getApplicationContext(), "Acertou depois de "+chute+"tentativas", Toast.LENGTH_LONG).show();
                chute = 0;
                txt_chute.setText(chute+"");
                Random random = new Random();
                numero = random.nextInt(100);
            } else {
                Toast.makeText(getApplicationContext(),"Errou", Toast.LENGTH_SHORT).show();
                chute++;
                txt_chute.setText(chute+"");
            }
        }
    }
}
