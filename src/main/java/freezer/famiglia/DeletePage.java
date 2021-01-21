package freezer.famiglia;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeletePage extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete_page);

        ScrollView deletingscroll = findViewById(R.id.scrollViewdeletePage);
        Button delete = findViewById(R.id.buttondeleteelement);


        Intent main = new Intent(this, MainActivity.class);

        MediaPlayer eliminato = MediaPlayer.create(this, R.raw.eliminato);

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eliminato.start();
                startActivity(main);
            }
        });
    }
}
