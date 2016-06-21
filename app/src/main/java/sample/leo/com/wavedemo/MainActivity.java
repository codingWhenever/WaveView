package sample.leo.com.wavedemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.animation.LinearOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private WaveView mWaveView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mWaveView = (WaveView) findViewById(R.id.waveview);

        mWaveView.setDuration(5000);
        mWaveView.setSpeed(400);
        mWaveView.setInitialRadius(150);
        mWaveView.setMaxRadius(350);
        mWaveView.setColor(Color.parseColor("#ff0000"));
        mWaveView.setInterpolator(new LinearOutSlowInInterpolator());
//        mWaveView.setInterpolator(new AccelerateInterpolator(1.2f));
//        mWaveView.start();
    }

    public void onButtonClick(View view){
        if(view.getId() == R.id.btn_start){
            mWaveView.start();
        }else if(view.getId() == R.id.btn_stop){
            mWaveView.stop();
        }
    }
}
