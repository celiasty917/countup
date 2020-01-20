package rakuten.countup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    private Button cubtn;
    int tv_num;

    public native int addcount(int num, int one);

    static {
        System.loadLibrary("countup");
    }

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        tv = (TextView) findViewById(R.id.num);
        cubtn = (Button) findViewById(R.id.cubtn);
        //String tv_str = tv.getText().toString();
        //int tv_num = Integer.parseInt(tv_str);



    }

    public void oncubtnClick(View view) {
        tv_num = addcount(tv_num, 1);
        tv.setText(""+tv_num);

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
