package umn.ac.id.dwiparifiroosb_65054_if570_a_uts_mobile_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public EditText username, password;
    public Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnLogin){

            String ambilUsername = username.getText().toString().trim();
            String ambilPassword = password.getText().toString().trim();

            if (ambilUsername.equals("myumn") && ambilPassword.equals("myumn")){
                Toast.makeText(this, "Selamat anda Berhasil login", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "anda salah password dan username", Toast.LENGTH_SHORT).show();
            }
        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}