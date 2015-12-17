package net.eletron.sistemasesel;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ActMain extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btnEletricidade;
    private ImageButton btnArCondicionado;
    private ImageButton btnAutomacao;
    private ImageButton btnElevadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        btnArCondicionado   = (ImageButton)findViewById(R.id.btnArCondicionado);
        btnAutomacao        = (ImageButton)findViewById(R.id.btnAutomacao);
        btnEletricidade     = (ImageButton)findViewById(R.id.btnEletricidade);
        btnElevadores       = (ImageButton)findViewById(R.id.btnElevadores);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View v)
    {

    }

}
