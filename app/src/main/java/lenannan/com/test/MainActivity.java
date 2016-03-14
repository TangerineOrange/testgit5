package lenannan.com.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String a = new String();

        if ("ok".equals(a)){
            Toast.makeText(MainActivity.this, "dfdfdf", Toast.LENGTH_SHORT).show();
        }
    }
}
