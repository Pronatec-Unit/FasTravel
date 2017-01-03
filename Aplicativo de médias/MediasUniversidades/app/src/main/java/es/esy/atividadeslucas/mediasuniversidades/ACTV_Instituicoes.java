package es.esy.atividadeslucas.mediasuniversidades;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class ACTV_Instituicoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv__instituicoes);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntente = new Intent(getApplicationContext(), ACTV_inicio.class);
        startActivityForResult(myIntente, 0);
        return true;

    }
    public void Entrar_UFS (View view){

        Intent intentufs = new Intent(getApplicationContext(), Actv_Ufs.class);
        startActivity(intentufs);
        finish();
    }

    public void Entrar_Fanese (View view){

        Intent intentfanese = new Intent(getApplicationContext(), Actv_Fanese.class);
        startActivity(intentfanese);
        finish();
    }

    public void Entrar_Unit (View view){

        Intent intentunit = new Intent(getApplicationContext(), Actv_Unit.class);
        startActivity(intentunit);
        finish();
    }

    public void Entrar_Fama (View view){

        Intent intentfama = new Intent(getApplicationContext(), Actv_Fama.class);
        startActivity(intentfama);
        finish();
    }
    public void Entrar_Estacio (View view){

        Intent intentEstacio = new Intent(getApplicationContext(), Actv_Estacio.class);
        startActivity(intentEstacio);
        finish();
    }

    public void Entrar_Ifs (View view){

        Intent intentifs = new Intent(getApplicationContext(), Actv_Ifs.class);
        startActivity(intentifs);
        finish();
    }
    public void Entrar_Nassau (View view){

        Intent intentifs = new Intent(getApplicationContext(), Actv_Nassau.class);
        startActivity(intentifs);
        finish();
    }
    public void Entrar_pio (View view){

        Intent intentpio = new Intent(getApplicationContext(), Actv_Pio.class);
        startActivity(intentpio);
        finish();
    }
    public void Entrar_Novo (View view){

        Intent intentnovo = new Intent(getApplicationContext(), Actv_Novo.class);
        startActivity(intentnovo);
        finish();
    }


}

