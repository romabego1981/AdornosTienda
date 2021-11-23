package usa.sesion1.adornostienda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Contacto extends AppCompatActivity {

    private ImageView imgContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("TIENDA DE ADORNOS");
        getSupportActionBar().setSubtitle("Un adorno para cada ocasión");
        getSupportActionBar().setLogo(R.mipmap.ic_icon_adorno);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        imgContacto = (ImageView)findViewById(R.id.imgContacto);
    }
}