package freezer.famiglia;

import android.content.Context;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IlTuoFreezer extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.il_tuo_freezer);
        ScrollView freezerscroll = findViewById(R.id.ScrollViewIlTuoFreezer);
        //Prendere gli elementi e metterli in una label che si aggiunge alla ScrollView
    }
}

