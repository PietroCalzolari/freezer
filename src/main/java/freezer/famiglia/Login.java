package freezer.famiglia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button accedi = findViewById(R.id.buttonlogin);

        MediaPlayer benvenuto = MediaPlayer.create(this, R.raw.benvenuto);
        Intent main = new Intent(this, MainActivity.class);
        accedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                benvenuto.start();
                startActivity(main);
            }
        });
    }

}
