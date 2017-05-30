package apricot.dibuja;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by alexiscastro on 16/05/17.
 */

public class Practica1 extends AppCompatActivity {
    DrawView drawView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practica1);

        drawView = new DrawView(this);
        drawView.setBackgroundColor(Color.WHITE);
        setContentView(drawView);

    }
}

