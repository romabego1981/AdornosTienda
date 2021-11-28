package usa.sesion1.adornostienda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class Contacto extends AppCompatActivity {

    private ImageView imgContacto;
    private Toolbar mytoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setTitle("AppDORNOS");
        //getSupportActionBar().setSubtitle("Materializamos ideas de diseño");
        getSupportActionBar().setLogo(R.mipmap.ic_icon_adorno);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        imgContacto = (ImageView)findViewById(R.id.imgContacto);
    }

    /**@Override
    public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menuprincipal, menu);

    return true;
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

}