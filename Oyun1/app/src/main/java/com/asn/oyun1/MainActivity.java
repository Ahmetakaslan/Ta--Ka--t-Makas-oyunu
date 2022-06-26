package com.asn.oyun1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button taş, kağıt, makas;
    TextView seninSkorun, bilgisayarınSkoru, kazanan, bilgisayarınseçimi, seninSeçimin;
    int SeninSkorun;
    int BilgisayarınSkoru;
    int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        taş =findViewById(R.id.taş);
        kağıt = findViewById(R.id.kağıt);
        makas = findViewById(R.id.makas);
        bilgisayarınseçimi = findViewById(R.id.BilgisayarınSeçimi);
        seninSeçimin = findViewById(R.id.seninSeçimin);
        seninSkorun = findViewById(R.id.seninSkorun);
        bilgisayarınSkoru = findViewById(R.id.bilgisayarınSkoru);
        kazanan = findViewById(R.id.kazanan);

    }

    public void choice(View view) {

        a = (int) (Math.random() * 3);
        bilgisayarınseçimi.setVisibility(View.VISIBLE);
        if (a == 0) bilgisayarınseçimi.setText("bilgisayarın seçimi : Taş");
        else if (a == 1) bilgisayarınseçimi.setText("bilgisayarın seçimi : kağıt");
        else bilgisayarınseçimi.setText("bilgisayarın seçimi : makas");
        switch (view.getId()) {
            case R.id.taş: seninSeçimin.setText("Senin seçimin : taş");    skor(0);
                break;
            case R.id.kağıt:seninSeçimin.setText("Senin seçimin :kağıt");  skor(1);
                break;
            case R.id.makas:seninSeçimin.setText("Senin seçimin :makas");  skor(2);
                break;

        }
    }
    public void skor(int b){
         if(b==a){ kazanan.setText("berabere");
        }else if((b==0 && a==2)||(b==1&& a==0) ||(b==2&& a==1)){
            kazanan.setText("sen kazandın");
            SeninSkorun++;
            seninSkorun.setText(String.valueOf("your Score : "+SeninSkorun));
        }else {
             kazanan.setText("bilgisayar kazandı");
             BilgisayarınSkoru++;
             bilgisayarınSkoru.setText(String.valueOf("Pc Score : "+BilgisayarınSkoru));
         }
    }

}