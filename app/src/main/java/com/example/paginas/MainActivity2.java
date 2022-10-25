package com.example.paginas;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    static final String TEXTO = "TEXTOA2";
    static final String CODIGO_TEXTO = "10";
    static final String CODIGO_NUEVO = "15";
    TextView resultadoA2;
    EditText textoA2;
    Button enivarA1,salir, nuevoA1;

    static String MESSAGE_NOMBRE = ".";
    @Override
    ActivityResultLauncher <intent> activityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.activity_main);
                        resultadoA2=findViewById(R.id.resultadoA2);
                        textoA2=findViewById(R.id.textoA2);
                        enivarA1=findViewById(R.id.enivarA1);
                        salir=findViewById(R.id.salir);
                        nuevoA1=findViewById(R.id.nuevoA1);
                        Intent intent =getIntent();
                    }
                    nuevoA1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                    });
                })
            }
    public void volver(){
        MainActivity2.super.onBackPressed();
    }
    public void enviarTextoA1(){
        Intent intent = new Intent(this,MainActivity.class);
        String message = TEXTO,textoA2.getText().toString();
        intent.putExtra(CODIGO_TEXTO, intent);
        MainActivity2.super.onBackPressed();
    }
    public void nuevaActividad1(){
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra(TEXTO, );
    }
}