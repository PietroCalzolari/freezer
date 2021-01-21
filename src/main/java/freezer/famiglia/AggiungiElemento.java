package freezer.famiglia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AggiungiElemento extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aggiungi_elemento);


        Button aggiungi  = findViewById((R.id.buttonAggiungi));


        final EditText nome = findViewById(R.id.editTextBoxNome);
        final EditText genere = findViewById(R.id.editTextBoxGenere);
        final EditText data = findViewById(R.id.editTextBoxData);


        MediaPlayer youngforever = MediaPlayer.create(this,R.raw.youngforever);
        MediaPlayer aggiunto = MediaPlayer.create(this, R.raw.aggiunto);


        Intent main = new Intent(this, MainActivity.class);


        aggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nome.getText().toString();
                String genre = genere.getText().toString();
                String date = data.getText().toString();
                Toast.makeText(getApplicationContext(), "É stato aggiunto al freezer l'elemento " + name + " di tipo " + genre + " in data " + date, Toast.LENGTH_LONG).show();
                aggiunto.start();
                startActivity(main);
            }
        });
    }
}

