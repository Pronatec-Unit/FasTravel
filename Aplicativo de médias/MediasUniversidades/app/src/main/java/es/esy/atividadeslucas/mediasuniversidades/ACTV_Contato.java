package es.esy.atividadeslucas.mediasuniversidades;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ACTV_Contato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv__contato);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button Enviar = (Button) findViewById(R.id.btn_Enviar);
        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                EditText edt_Mensagem = (EditText) findViewById(R.id.edt_Mensagem);
                String Mensagem = edt_Mensagem.getText().toString();
                sendEmail(Mensagem);

            }
        });
    }

    private void sendEmail(String mensagem) {

        String[] to = new String[]{"lucasnascdesign@gmail.com"};
        String subject = ("Mensagem de usuário do aplicativo Média Universidade");
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, to);
        email.putExtra(Intent.EXTRA_SUBJECT, subject);
        email.putExtra(Intent.EXTRA_TEXT, mensagem);
        email.setType("mensagem/utf-8");
        startActivity(Intent.createChooser(email, "Email"));
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntente = new Intent(getApplicationContext(), ACTV_inicio.class);
        startActivityForResult(myIntente, 0);
        return true;

    }

    public void Cancelar(View view) {

        Intent intentufs = new Intent(getApplicationContext(), ACTV_inicio.class);
        startActivity(intentufs);
        finish();
    }

}


