package org.kasapbasi.week0402services2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // use this to start and trigger a service
                Intent i= new Intent( MainActivity.this, MyService.class);
// potentially add data to the intent
                i.putExtra("KEY1", "Value to be used by the service");
                MainActivity.this.startService(i);
            }
        });

    }
public void MyClick(View v){
    Intent i= new Intent( MainActivity.this, MyService.class);

    this.stopService(i);
}

}
