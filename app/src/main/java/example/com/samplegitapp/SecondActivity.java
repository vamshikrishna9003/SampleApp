package example.com.samplegitapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Android Studio.
 * Author : Vamshi Krishna.
 * Email : vamshi@khoslalabs.com
 * Date : 24th Sep,2018.
 * Time : 12:02 PM.
 * Place : Khosla Labs, Bangalore.
 **/
public class SecondActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
