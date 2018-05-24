package e.administrator.project_2;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);


        MyTimer timer = new MyTimer(1000, 1000);
        timer.start();


    }

    public class MyTimer extends CountDownTimer {


        long millis ;

        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public MyTimer(long millisInFuture, long countDownInterval) {

            super(millisInFuture, countDownInterval);

        }

        @Override
        public void onTick(long millisUntilFinished) {


        }

        @Override
        public void onFinish() {

            Intent intent = new Intent(Main4Activity.this,MainActivity.class);

            startActivity(intent);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        MyTimer timer = new MyTimer(1000, 1000);
        timer.start();
    }
}
