package usa.sesion1.adornostienda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Productos extends AppCompatActivity  implements View.OnClickListener {

    private Button btnProducto1;
    private Button btnProducto2;
    private Button btnProducto3;
    private Button btnProducto4;
    private TextView txtProducto1;
    private TextView txtProducto2;
    private TextView txtProducto3;
    private TextView txtProducto4;
    private Toolbar mytoolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //getSupportActionBar().setTitle("AppDORNOS");
        //getSupportActionBar().setSubtitle("Materializamos ideas de diseño");
        getSupportActionBar().setLogo(R.mipmap.ic_icon_adorno);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        txtProducto1 = (TextView) findViewById(R.id.txtProducto1);
        txtProducto2 = (TextView) findViewById(R.id.txtProducto2);
        txtProducto3 = (TextView) findViewById(R.id.txtProducto3);
        txtProducto4 = (TextView) findViewById(R.id.txtProducto4);

        btnProducto1 = (Button) findViewById(R.id.btnProducto1);
        btnProducto2 = (Button) findViewById(R.id.btnProducto2);
        btnProducto3 = (Button) findViewById(R.id.btnProducto3);
        btnProducto4 = (Button) findViewById(R.id.btnProducto4);

        btnProducto1.setOnClickListener(this);
        btnProducto2.setOnClickListener(this);
        btnProducto3.setOnClickListener(this);
        btnProducto4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String msg="Se añadió el producto ";
        switch(v.getId()) {
            case R.id.btnProducto1:
                msg = msg + txtProducto1.getText() + " al carrito";
                break;
            case R.id.btnProducto2:
                msg = msg + txtProducto2.getText() + " al carrito";
                break;
            case R.id.btnProducto3:
                msg = msg + txtProducto3.getText() + " al carrito";
                break;
            case R.id.btnProducto4:
                msg = msg + txtProducto4.getText() + " al carrito";
                break;
        }
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

}