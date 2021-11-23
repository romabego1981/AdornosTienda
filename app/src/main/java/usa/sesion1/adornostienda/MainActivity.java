/**
 *
 * @author Grupo6
 * @description Este módulo se creó para manejar el backen de la App de adornos en su pantalla principal
 */
package usa.sesion1.adornostienda;

//Sección de importación de componentes
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 *
 * @description Clase principal para manipular la pantalla inicial de la app
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText txtUsuario;
    private EditText txtClave;
    private Button btnLogin;
    private ImageView imgIngreso;
    private TextView txtIngreso;
    private MenuItem opcProductos;
    private MenuItem opcServicios;
    private MenuItem opcContacto;

    /**
     *
     * @description Sobreescritura del método onCreate para realizar actividades cuando se crea la activity
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("AppDORNOS");
        getSupportActionBar().setSubtitle("Materializamos ideas de diseño");
        getSupportActionBar().setLogo(R.mipmap.ic_icon_adorno);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtClave = (EditText) findViewById(R.id.txtClave);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);

        imgIngreso = (ImageView)findViewById(R.id.imgIngreso);
        txtIngreso = (TextView)findViewById(R.id.txtIngreso);
        imgIngreso.setVisibility(View.INVISIBLE);
        txtIngreso.setVisibility(View.INVISIBLE);

        opcProductos = (MenuItem)findViewById(R.id.opcProductos);
        opcServicios = (MenuItem)findViewById(R.id.opcServicios);
        opcContacto = (MenuItem)findViewById(R.id.opcContacto);

    }

    /**
     *
     * @description Sobreescritura del método onClick para realizar actividades cuando el usuario
     * haga click
     */
    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Presionó el botón Login", Toast.LENGTH_LONG).show();
        imgIngreso.setVisibility(View.VISIBLE);
        txtIngreso.setVisibility(View.VISIBLE);
        btnLogin.setText("Volver");
    }

    /**
     *
     * @description Sobreescritura del método onCreateOptionsMenu para realizar actividades cuando
     * se crean las opciones del menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuprincipal, menu);

        return true;
    }

    /**
     *
     * @description Sobreescritura del método onOptionsItemSelected para realizar actividades cuando el usuario seleccione una opción del menu
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opcProductos){
            Toast.makeText(getApplicationContext(),"Ingresa a Productos...",Toast.LENGTH_LONG).show();
            Intent pantallaProductos = new Intent(this, Productos.class);
            startActivity(pantallaProductos);
        }
        if (id == R.id.opcContacto){
            Toast.makeText(getApplicationContext(),"Ingresa a Contactos...",Toast.LENGTH_LONG).show();
            Intent pantallaContacto = new Intent(this, Contacto.class);
            startActivity(pantallaContacto);

        }
        if (id == R.id.opcServicios){
            Toast.makeText(getApplicationContext(),"Ingresa a Servicios...",Toast.LENGTH_LONG).show();
            Intent pantallaServicios = new Intent(this, Servicios.class);
            startActivity(pantallaServicios);
        }
        return super.onOptionsItemSelected(item);
    }

} //Fin de la clase