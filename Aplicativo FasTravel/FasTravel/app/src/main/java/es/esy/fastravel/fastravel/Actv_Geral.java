package es.esy.fastravel.fastravel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Actv_Geral extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv__geral);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        if (savedInstanceState == null) {
            // adicionar o fragmento inicial
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.frame_container, new Frag_Apresentacao())
                    .commit();
        }



        final Button btn_contato = (Button) findViewById(R.id.btn_contato);
        final Button btn_inicio = (Button) findViewById(R.id.btn_inicio);
        final Button btn_web = (Button) findViewById(R.id.btn_web);
        final Button btn_sobre = (Button) findViewById(R.id.btn_sobre);
        final Button btn_parceiros = (Button) findViewById(R.id.btn_parceiros);

        //FRAG INICIO

        btn_inicio.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                //Cor do botão
                btn_inicio.setBackgroundResource(R.color.clicado);
                btn_contato.setBackgroundResource(R.color.naoclicado);
                btn_sobre.setBackgroundResource(R.color.naoclicado);
                btn_web.setBackgroundResource(R.color.naoclicado);
                btn_parceiros.setBackgroundResource(R.color.naoclicado);

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new Frag_Inicio()).commit();
            }
        });

        //FRAG CONTATO
        btn_contato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Cor do botão
                btn_inicio.setBackgroundResource(R.color.naoclicado);
                btn_contato.setBackgroundResource(R.color.clicado);
                btn_sobre.setBackgroundResource(R.color.naoclicado);
                btn_web.setBackgroundResource(R.color.naoclicado);
                btn_parceiros.setBackgroundResource(R.color.naoclicado);
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new Frag_Contato()).commit();
            }
        });

        //FRAG WEB
        btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //cor do botão
                btn_inicio.setBackgroundResource(R.color.naoclicado);
                btn_contato.setBackgroundResource(R.color.naoclicado);
                btn_sobre.setBackgroundResource(R.color.naoclicado);
                btn_web.setBackgroundResource(R.color.clicado);
                btn_parceiros.setBackgroundResource(R.color.naoclicado);

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new Frag_Web()).commit();
            }
        });

        //FRAG PARCEIROS
        btn_parceiros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //cor do botão
                btn_inicio.setBackgroundResource(R.color.naoclicado);
                btn_contato.setBackgroundResource(R.color.naoclicado);
                btn_sobre.setBackgroundResource(R.color.naoclicado);
                btn_web.setBackgroundResource(R.color.naoclicado);
                btn_parceiros.setBackgroundResource(R.color.clicado);

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new Frag_Parceiros()).commit();
            }
        });


        //FRAG SOBRE
        btn_sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //cor do botão
                btn_inicio.setBackgroundResource(R.color.naoclicado);
                btn_contato.setBackgroundResource(R.color.naoclicado);
                btn_sobre.setBackgroundResource(R.color.clicado);
                btn_web.setBackgroundResource(R.color.naoclicado);
                btn_parceiros.setBackgroundResource(R.color.naoclicado);

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, new Frag_Sobre()).commit();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_actv__geral, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
