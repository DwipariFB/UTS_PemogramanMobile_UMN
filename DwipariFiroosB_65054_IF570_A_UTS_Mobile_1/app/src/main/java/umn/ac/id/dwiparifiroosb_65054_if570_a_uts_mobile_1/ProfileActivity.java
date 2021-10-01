package umn.ac.id.dwiparifiroosb_65054_if570_a_uts_mobile_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveWithDataActivity = findViewById(R.id.btn_biodata);
        btnMoveWithDataActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_move_activity) {
            Intent moveIntent = new Intent(ProfileActivity.this, MoveActivity.class);
            startActivity(moveIntent);
        } else if (v.getId() == R.id.btn_biodata) {
            Intent moveIntent = new Intent(ProfileActivity.this, BiodataActivity.class);
            startActivity(moveIntent);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}