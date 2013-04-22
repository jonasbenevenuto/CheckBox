package com.example.checkbox;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class OutraActivity extends Activity {
	private Button btVoltar;
	private TextView tela;	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_outra);
		
		tela = (TextView) findViewById(R.id.txtTela);
		
		Intent it = getIntent();
		String nome = it.getStringExtra("CON");
		tela.setText(nome);
	
		
		btVoltar = (Button) findViewById(R.id.btVoltar);
		
		btVoltar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent it = new Intent(OutraActivity.this,Check.class);
				startActivity(it);
				OutraActivity.this.finish();
				
			}
		});
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.outra, menu);
		return true;
	}

}
