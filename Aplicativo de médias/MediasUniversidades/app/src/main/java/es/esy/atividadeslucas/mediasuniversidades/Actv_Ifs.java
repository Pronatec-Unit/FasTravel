package es.esy.atividadeslucas.mediasuniversidades;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Actv_Ifs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv__ifs);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        final EditText nota1 = (EditText) findViewById(R.id.ednota1);
        final EditText nota2 = (EditText) findViewById(R.id.ednota2);
        final TextView resultado = (TextView) findViewById(R.id.Txt_Resultado);

        ImageButton Calcular = (ImageButton) findViewById(R.id.btCalcular);
        ImageButton Limpar = (ImageButton) findViewById(R.id.btLimpar);

        Button contato = (Button) findViewById(R.id.Btn_Contato);



        Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nota1.setText(String.valueOf(""));
                nota2.setText(String.valueOf(""));
                resultado.setText(String.valueOf(""));


            }
        });


        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nota1.length() == 0 && nota2.length() == 0) {


                    AlertDialog.Builder dialogo = new
                            AlertDialog.Builder(Actv_Ifs.this);
                    dialogo.setTitle("Erro!");
                    dialogo.setMessage("Digite sua nota para calcularmos a sua média. ");
                    dialogo.setNeutralButton("OK", null);
                    dialogo.show();


                }

                else if (nota1.length() == 0 ) {


                    float segunda = Float.parseFloat(
                            nota2.getText().toString());

                    float n1 = 0 * 5;
                    float n2 = segunda * 5;

                    float res = (n1 + n2) / 10;

                    resultado.setText(String.valueOf(res));


                    if (res > 5) {

                        float mensagem = res - 10;


                        AlertDialog.Builder dialogo = new
                                AlertDialog.Builder(Actv_Ifs.this);
                        dialogo.setTitle("Parabéns!");
                        dialogo.setMessage(" A sua média foi maior que a média obrigatória da instituição.");
                        dialogo.setNeutralButton("OK", null);
                        dialogo.show();
                    }
                    if (res <= 5) {


                        AlertDialog.Builder dialogo = new
                                AlertDialog.Builder(Actv_Ifs.this);
                        dialogo.setTitle("Que pena!");
                        dialogo.setMessage(" A sua média foi menor que a média obrigatória da instituição. ");
                        dialogo.setNeutralButton("OK", null);
                        dialogo.show();

                    }



                }
                else if (nota2.length() == 0 ) {

                    float primeira = Float.parseFloat(
                            nota1.getText().toString());

                    float n1 = primeira * 5;
                    float n2 = 0 * 5;

                    float res = (n1 + n2) / 10;

                    resultado.setText(String.valueOf(res));


                    if (res > 5) {

                        float mensagem = res - 10;


                        AlertDialog.Builder dialogo = new
                                AlertDialog.Builder(Actv_Ifs.this);
                        dialogo.setTitle("Parabéns!");
                        dialogo.setMessage(" A sua média foi maior que a média obrigatória da instituição.");
                        dialogo.setNeutralButton("OK", null);
                        dialogo.show();
                    }
                    if (res <= 5) {


                        AlertDialog.Builder dialogo = new
                                AlertDialog.Builder(Actv_Ifs.this);
                        dialogo.setTitle("Que pena!");
                        dialogo.setMessage(" A sua média foi menor que a média obrigatória da instituição. ");
                        dialogo.setNeutralButton("OK", null);
                        dialogo.show();

                    }



                }

                else {

                    float primeira = Float.parseFloat(
                            nota1.getText().toString());

                    float segunda = Float.parseFloat(
                            nota2.getText().toString());

                    float n1 = primeira * 5;
                    float n2 = segunda * 5;

                    float res = (n1 + n2) / 10;

                    resultado.setText(String.valueOf(res));


                    if (res > 5) {

                        float mensagem = res - 10;


                        AlertDialog.Builder dialogo = new
                                AlertDialog.Builder(Actv_Ifs.this);
                        dialogo.setTitle("Parabéns!");
                        dialogo.setMessage(" A sua média foi maior que a média obrigatória da instituição.");
                        dialogo.setNeutralButton("OK", null);
                        dialogo.show();
                    }
                    if (res <= 5) {


                        AlertDialog.Builder dialogo = new
                                AlertDialog.Builder(Actv_Ifs.this);
                        dialogo.setTitle("Que pena!");
                        dialogo.setMessage(" A sua média foi menor que a média obrigatória da instituição. ");
                        dialogo.setNeutralButton("OK", null);
                        dialogo.show();

                    }

                }
            }

        });



    }
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntente = new Intent(getApplicationContext(), ACTV_Instituicoes.class);
        startActivityForResult(myIntente, 0);
        return true;

    }


    public void contato (View view){

        Intent intent = new Intent(getApplicationContext(), ACTV_Contato.class);
        startActivity(intent);
        finish();
    }

    public void instituicao (View view){

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.ifs.edu.br/"));
        startActivity(i);
    }
}
