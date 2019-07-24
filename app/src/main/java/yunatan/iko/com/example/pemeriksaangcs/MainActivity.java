package yunatan.iko.com.example.pemeriksaangcs;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg1, rg2, rg3;
    RadioButton rbE1, rbE2, rbE3, rbE4, rbV1, rbV2, rbV3, rbV4, rbV5, rbM1, rbM2, rbM3, rbM4, rbM5, rbM6;
    TextView tvE, tvV, tvM, tvT;
    int skor1 = 0;
    int skor2 = 0;
    int skor3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg1 = findViewById(R.id.rg_eye);
        rbE1 = findViewById(R.id.rb_mata1);
        rbE2 = findViewById(R.id.rb_mata2);
        rbE3 = findViewById(R.id.rb_mata3);
        rbE4 = findViewById(R.id.rb_mata4);
        tvE = findViewById(R.id.tv_E);

        rg2 = findViewById(R.id.rg_verbal);
        rbV1 = findViewById(R.id.rb_verbal1);
        rbV2 = findViewById(R.id.rb_verbal2);
        rbV3 = findViewById(R.id.rb_verbal3);
        rbV4 = findViewById(R.id.rb_verbal4);
        rbV5 = findViewById(R.id.rb_verbal5);
        tvV = findViewById(R.id.tv_V);

        rg3 = findViewById(R.id.rg_motorik);
        rbM1 = findViewById(R.id.rb_motorik1);
        rbM2 = findViewById(R.id.rb_motorik2);
        rbM3 = findViewById(R.id.rb_motorik3);
        rbM4 = findViewById(R.id.rb_motorik4);
        rbM5 = findViewById(R.id.rb_motorik5);
        rbM6 = findViewById(R.id.rb_motorik6);

        tvM = findViewById(R.id.tv_M);
        tvT = findViewById(R.id.tv_t);

        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ichecked) {
                if (rbE1.isChecked()) {
                    skor1 = 4;
                    tampilkanSkor(skor1);
                    tampilkanTotal(skor1 + skor2 + skor3);

                } else if (rbE2.isChecked()) {
                    skor1 = 3;
                    tampilkanSkor(skor1);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbE3.isChecked()) {
                    skor1 = 2;
                    tampilkanSkor(skor1);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbE4.isChecked()) {
                    skor1 = 1;
                    tampilkanSkor(skor1);
                    tampilkanTotal(skor1 + skor2 + skor3);
                }
            }

        });
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ichecked) {
                if (rbV1.isChecked()) {
                    skor2 = 5;
                    tampilkanSkor2(skor2);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbV2.isChecked()) {
                    skor2 = 4;
                    tampilkanSkor2(skor2);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbV3.isChecked()) {
                    skor2 = 3;
                    tampilkanSkor2(skor2);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbV4.isChecked()) {
                    skor2 = 2;
                    tampilkanSkor2(skor2);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbV5.isChecked()) {
                    skor2 = 1;
                    tampilkanSkor2(skor2);
                    tampilkanTotal(skor1 + skor2 + skor3);
                }
            }

        });
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int ichecked) {
                if (rbM1.isChecked()) {
                    skor3 = 6;
                    tampilkanSkor3(skor3);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbM2.isChecked()) {
                    skor3 = 5;
                    tampilkanSkor3(skor3);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbM3.isChecked()) {
                    skor3 = 4;
                    tampilkanSkor3(skor3);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbM4.isChecked()) {
                    skor3 = 3;
                    tampilkanSkor3(skor3);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbM5.isChecked()) {
                    skor3 = 2;
                    tampilkanSkor3(skor3);
                    tampilkanTotal(skor1 + skor2 + skor3);
                } else if (rbM6.isChecked()) {
                    skor3 = 1;
                    tampilkanSkor3(skor3);
                    tampilkanTotal(skor1 + skor2 + skor3);
                }

            }

        });
    }

    public void tampilkanSkor(int skor1) {
        tvE.setText("E:" + skor1);

    }

    public void tampilkanSkor2(int skor2) {
        tvV.setText("V:" + skor2);
    }

    public void tampilkanSkor3(int skor3) {
        tvM.setText("M:" + skor3);
    }

    public void tampilkanTotal(int skorTot) {
        tvT.setText("Total:" + skorTot);
    }
}

