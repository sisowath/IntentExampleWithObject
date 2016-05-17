package www.suonsamnang.com.intentexamplewithobject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import www.suonsamnang.com.intentexamplewithobject.Models.Personne;

public class ObjectReceivedActivity extends AppCompatActivity {

    public static Personne personne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_received);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        EditText txtInformationsPersonne = (EditText) findViewById(R.id.txtInformationsPersonne);
        if(getIntent().hasExtra(String.valueOf(personne))) {
            personne = (Personne) getIntent().getSerializableExtra(String.valueOf(personne));
            txtInformationsPersonne.setText(personne.toString());
        } else {
            txtInformationsPersonne.setText("Aucune informations reçues...");
        }
        Button btnRetourner = (Button) findViewById(R.id.btnRetourner);
        btnRetourner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
