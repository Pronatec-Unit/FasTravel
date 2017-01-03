package es.esy.fastravel.fastravel;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag_Contato extends Fragment {


    public Frag_Contato() {
        // Required empty public constructor




    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // obter a view do fragmento
        final View view = inflater.inflate(R.layout.fragment_frag__contato, container, false);
// linkar com o componente da view


                final CheckBox receber = (CheckBox) view.findViewById(R.id.resposta);

                receber.setOnClickListener(new View.OnClickListener(){

                    public void onClick(View arg0){

                        if(receber.isChecked()) {

                            Button Enviar = (Button) view.findViewById(R.id.btn_Enviar);

                            Enviar.setOnClickListener(new View.OnClickListener(){

                                public void onClick(View arg0) {

                            EditText edt_Mensagem = (EditText) view.findViewById(R.id.edt_Mensagem);
                            String Mensagem = edt_Mensagem.getText().toString();
                            sendEmail(Mensagem + "\n" + "\n" + "   - Desejo receber resposta por Email.");

                                }
                            });

                        }

                        else {

                            Button Enviar = (Button) view.findViewById(R.id.btn_Enviar);

                            Enviar.setOnClickListener(new View.OnClickListener(){

                                public void onClick(View arg0) {

                                    EditText edt_Mensagem = (EditText) view.findViewById(R.id.edt_Mensagem);
                                    String Mensagem = edt_Mensagem.getText().toString();
                                    sendEmail(Mensagem+ "\n" + "\n" + "   - Não Desejo receber resposta por Email.");

                                }
                            });


                        }



        }
    });

        return view;
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
}
