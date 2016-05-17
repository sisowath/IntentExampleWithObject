package www.suonsamnang.com.intentexamplewithobject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import www.suonsamnang.com.intentexamplewithobject.Models.Personne;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnEnvoyer = (Button) findViewById(R.id.btnEnvoyer);
        btnEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtNom = (EditText) findViewById(R.id.txtNom);
                EditText txtPrenom = (EditText) findViewById(R.id.txtPrenom);
                EditText txtAge = (EditText) findViewById(R.id.txtAge);
                Personne personne = new Personne();
                personne.setNom(txtNom.getText().toString());
                personne.setPrenom(txtPrenom.getText().toString());
                personne.setAge(Integer.parseInt( txtAge.getText().toString() ) );
                Intent intent = new Intent(MainActivity.this, ObjectReceivedActivity.class);
                intent.putExtra(String.valueOf(ObjectReceivedActivity.personne), personne);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
/*
    Sources :
    http://stackoverflow.com/questions/2736389/how-to-pass-an-object-from-one-activity-to-another-on-android
*/