package com.example.checkbox;

import java.io.ObjectOutputStream.PutField;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Check extends Activity {
	private CheckBox check1;
	private CheckBox check2;
	private CheckBox check3;
	private Button btExibir;
	private Button btProxima;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check);

		check1 = (CheckBox) findViewById(R.id.checkBox1);
		check2 = (CheckBox) findViewById(R.id.checkBox2);
		check3 = (CheckBox) findViewById(R.id.checkBox3);

		btExibir = (Button) findViewById(R.id.btExibir);
		
		//Colacando o metodo on Click no botao Proxima Tela
		btProxima = (Button) findViewById(R.id.btProxima);
		
		btProxima.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//Criar instancia de locomocao para or de uma classe para outra
				
				Intent it = new Intent(Check.this,OutraActivity.class);
				//Simulando que esta na variavel
				
				String comentario ="Pedro viado";
				Bundle parametros = new Bundle();
				//Ira passar o CON para a outra tela
				parametros.putString("CON",comentario);
				
				it.putExtras(parametros);
				
				
				startActivity(it);
				//Fechando a classe, para nao ficar na memoria
				Check.this.finish();
			}
		});
		
		
		
				

		check1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (check1.isChecked()) {
					StringBuffer sb = new StringBuffer();// Diferenca
					String texto1 = "Voce clicou na 1ª Opcao";
					sb.append(texto1);

					//Toast.makeText(Check.this, sb.toString(), Toast.LENGTH_LONG)
						//	.show();

				}

			}
		});

		check2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (check1.isChecked()) {
					StringBuffer sb = new StringBuffer();// Diferenca
					String texto1 = "Voce clicou na 2ª Opcao";
					sb.append(texto1);

					//Toast.makeText(Check.this, sb.toString(), Toast.LENGTH_LONG)
							//.show();

				}

			}
		});

		check3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (check1.isChecked()) {
					StringBuffer sb = new StringBuffer();// Diferenca
					String texto1 = "Voce clicou na 3ª Opcao";
					sb.append(texto1);

					//Toast.makeText(Check.this, sb.toString(), Toast.LENGTH_LONG)
						//	.show();

				}

			}
		});

		// set Image Resorce (R.drawable.);

		btExibir.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				StringBuffer sb = new StringBuffer();
				int num = 0;
				sb.append("Caixas Marcadas: ");
				if (check1.isChecked()) {
					sb.append(check1.getText());
					num++;
				}
				if (check2.isChecked()) {
					if (num > 0) {
						sb.append(", ");
					}
					sb.append(check2.getText());
					num++;
				}
				if (check3.isChecked()) {
					if (num > 0) {
						sb.append(", ");
					}
					sb.append(check3.getText());
					num++;
				}

				if (num == 0) {
					sb.append("Nenhuma !");
				}

				Toast.makeText(Check.this, sb.toString(), Toast.LENGTH_LONG)
						.show();
			}
		});

	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_check, menu);
		return true;
	}

}
