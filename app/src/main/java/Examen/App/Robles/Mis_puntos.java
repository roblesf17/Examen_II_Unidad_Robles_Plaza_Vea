package Examen.App.Robles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Mis_puntos extends AppCompatActivity {

    TextView nombrem ;
    TextView titulom;
    TextView descripcionm;
    EditText celularm;


    public static String celular_mis_puntos_temporal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_mis_puntos );

        if (Login.registrar_numero==0)
        {
            titulom = (TextView) findViewById(  R.id.titulo_mis_puntos );
            titulom.setText( "¡EN HORA BUENA!" );

            descripcionm = (TextView) findViewById( R.id.descripcion_puntos );
            descripcionm . setText( "Plaza vea te regala \n" + Login.puntos_principal_temporal + " Vea Coins \n puedes canjearlos por estupendos premios ... \n ▼▼▼▼▼▼▼▼▼▼▼▼" );

            celularm = (EditText) findViewById( R.id.telefono_mis_puntos );
            celularm.setInputType(InputType.TYPE_CLASS_NUMBER);
        }
        if ( Login.registrar_numero==1)
        {
            titulom = (TextView) findViewById(  R.id.titulo_mis_puntos );
            titulom.setText( "¡ Wowwwww Estimado usuario  !" );

            descripcionm = (TextView) findViewById( R.id.descripcion_puntos );
            descripcionm . setText( "Tienes :  \n" + Login.puntos_principal_temporal + " Vea Coins listos para ser canjeados" );

            celularm = (EditText) findViewById( R.id.telefono_mis_puntos );
            celularm.setEnabled(false);
            celularm.setText( celular_mis_puntos_temporal );


            Login.registrar_numero = 1 ;
        }



    }


    public void onclick_registra_numero (View view)
    {
        if (Login.registrar_numero == 0 )
        {

            String celular = celularm.getText().toString();
            if (!celular.equals(""))
            {
                Login.puntos_principal_temporal = Login.puntos_principal_temporal + 20 ;

                titulom.setText( "¡ Wowwwww Estimado usuario  !" );

                descripcionm . setText( "Tienes :  \n" + Login.puntos_principal_temporal + " Vea Coins listos para ser canjeados" );

                celularm.setEnabled(false);

                Toast.makeText( this,"Registro exitoso ..",  Toast.LENGTH_LONG ).show();

                Login.registrar_numero = 1 ;

                celular_mis_puntos_temporal = celularm.getText().toString();
            }
        }
        else
        {

            Toast.makeText( this,"su numero ya fue registrado",  Toast.LENGTH_LONG ).show();
        }


    }









}
