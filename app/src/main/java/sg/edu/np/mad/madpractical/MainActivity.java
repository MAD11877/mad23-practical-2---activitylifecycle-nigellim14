package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user newUser = new user(false);
        Button followbtn = findViewById(R.id.followbutton);
        followbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = followbtn.getText().toString();
                if (text == "FOLLOW") {
                    followbtn.setText("UNFOLLOW");
                } else {
                    followbtn.setText("FOLLOW");
                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("debug", "start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("debug", "stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("debug", "destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("debug", "paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("debug", "resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("debug", "restart");
    }
}