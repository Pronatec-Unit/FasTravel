package es.esy.atividadeslucas.mediasuniversidades;

import android.content.Intent;
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

public class Actv_Novo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv__novo);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        final EditText nota1 = (EditText) findViewById(R.id.ednota1);
        final EditText nota2 = (EditText) findViewById(R.id.ednota2);
        final TextView resultado = (TextView) findViewById(R.id.Txt_Resultado);
        final EditText peso1 = (EditText) findViewById(R.id.edPeso1);
        final EditText peso2 = (EditText) findViewById(R.id.edPeso2);

        ImageButton Calcular = (ImageButton) findViewById(R.id.btCalcular);
        ImageButton Limpar = (ImageButton) findViewById(R.id.btLimpar);

        Button contato = (Button) findViewById(R.id.Btn_Contato);



        Limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nota1.setText(String.valueOf(""));
                nota2.setText(String.valueOf(""));
                peso1.setText(String.valueOf(""));
                peso2.setText(String.valueOf(""));
                resultado.setText(String.valueOf(""));



            }
        });

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (nota1.length() != 0 && nota2.length() != 0 && peso1.length() != 0 && peso2.length() != 0) {

                    float segunda = Float.parseFloat(
                            nota2.getText().toString());
                    float primeira = Float.parseFloat(
                            nota1.getText().toString());

                    float primeirapeso = Float.parseFloat(
                            peso1.getText().toString());

                    float segundapeso = Float.parseFloat(
                            peso2.getText().toString());

                    float n1 = primeira * primeirapeso;
                    float n2 = segunda * segundapeso;

                    float res = (n1 + n2) / (primeirapeso + segundapeso);

                    resultado.setText(String.valueOf(res));


                    if (res > 5) {


                        AlertDialog.Builder dialogo = new
                                AlertDialog.Builder(Actv_Novo.this);
                        dialogo.setTitle("Parabéns!");
                        dialogo.setMessage(" A sua média foi maior que Cinco.");
                        dialogo.setNeutralButton("OK", null);
                        dialogo.show();
                    }
                    if (res <= 5) {


                        AlertDialog.Builder dialogo = new
                                AlertDialog.Builder(Actv_Novo.this);
                        dialogo.setTitle("Que pena!");
                        dialogo.setMessage(" A sua média foi menor que Cinco. ");
                        dialogo.setNeutralButton("OK", null);
                        dialogo.show();

                    }
                }


                if (nota1.length() == 0 || nota2.length() == 0 || peso1.length() == 0 || peso2.length() == 0) {


                        AlertDialog.Builder dialogo = new
                                AlertDialog.Builder(Actv_Novo.this);
                        dialogo.setTitle("Erro!");
                        dialogo.setMessage("Digite todos valores para calcularmos sua média.");
                        dialogo.setNeutralButton("OK", null);
                        dialogo.show();

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

}
