package id.sch.smktelkom_mlg.xiirpl2013.formulirpendaftaran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNama;
    Spinner spKelas;
    Button bOK;
    CheckBox cbTT, cbSE, cbJE, cbJA;
    RadioButton rbLK, rbPR;
    TextView tvHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        spKelas = (Spinner) findViewById(R.id.SpinnerKelas);

        rbLK = (RadioButton) findViewById(R.id.radioButtonLK);
        rbPR = (RadioButton) findViewById(R.id.radioButtonPR);

        cbTT = (CheckBox) findViewById(R.id.checkBox);
        cbSE = (CheckBox) findViewById(R.id.checkBox2);
        cbJE = (CheckBox) findViewById(R.id.checkBox3);
        cbJA = (CheckBox) findViewById(R.id.checkBox4);

        bOK = (Button) findViewById(R.id.button);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        bOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                doClick();


            }
        });

    }

    private void doClick() {

        String hasil = null;

        if (rbLK.isChecked()) {
            hasil = rbLK.getText().toString();
        } else if (rbPR.isChecked()) {
            hasil = rbPR.getText().toString();

        }


        String nama = etNama.getText().toString();
        tvHasil.setText(("Selamat bergabung " + nama) + ("\n Kelas " + spKelas.getSelectedItem().toString()) + ("\n Jenis kelamin " + hasil) + ("\n Pengalaman anda adalah " + hasilc));
    }


}


