package es.esy.fastravel.fastravel;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_Web extends Fragment {


    public Frag_Web() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag__web, container, false);


        Button web = (Button) view.findViewById(R.id.btn_visitarWeb);

        web.setOnClickListener(new View.OnClickListener(){

            public void onClick(View arg0){

                Intent site = new Intent(Intent.ACTION_VIEW);
                site.setData(Uri.parse("http://www.fastravel.esy.es/"));
                startActivity(site);


            }
        });

        return view;
    }

}
