package com.barcenas.ciclovidaactividad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"Metodo OnStart(): la actividad esta a punto de ser visible",Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"Metodo OnResume(): la actividad va a empezar a interactuar con el usuario",Toast.LENGTH_LONG).show();
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"Metodo OnRestart(): la acttividad se va a reanudar y va a llamar a onStart",Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"Metodo OnPause(): la actividad va a estar en segundo plano",Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"Metodo OnStop(): la actividad ya no es visible",Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"Metodo OnDestroy(): la actividad se destruye",Toast.LENGTH_LONG).show();
    }


}