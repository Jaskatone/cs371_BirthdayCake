package cs301.birthdaycake;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    private CakeView cakeView;
    private CakeController cakeController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        cakeView = findViewById(R.id.cakeview);
        cakeController = new CakeController(cakeView);

        View button = findViewById(R.id.blowout_button);
        button.setOnClickListener(cakeController);

        CompoundButton sw = findViewById(R.id.candle_switch);
        sw.setOnClickListener(cakeController);
    }

    public void goodbye(View button){
        Log.i("button","Goodbye");
    }
}
