package freezer.famiglia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.sql.ResultSet;
import java.sql.SQLException;

import static freezer.famiglia.R.layout.activity_login;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent login = new Intent(this, Login.class);
        //Mettere controllo per fare il login solo una volta
        //startActivity(login);
        Button buttonguardafreezer = findViewById(R.id.buttonguardafreezer);
        FloatingActionButton buttonAggiungiElemento = findViewById(R.id.buttonAggiungiElemento);
        FloatingActionButton buttondelete = findViewById(R.id.buttondelete);


        MediaPlayer aggiunto = MediaPlayer.create(this, R.raw.aggiunto);
        MediaPlayer youngforever = MediaPlayer.create(this, R.raw.youngforever);


        Intent aggiungielementi = new Intent(this, AggiungiElemento.class);
        Intent iltuofreezer = new Intent(this, IlTuoFreezer.class);
        Intent deletepage = new Intent(this, DeletePage.class);


        buttonguardafreezer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(iltuofreezer);
            }
        });


        buttonAggiungiElemento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(aggiungielementi);
            }
        });


        buttondelete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                startActivity(deletepage);
            }
        });
    }

}