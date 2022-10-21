package mx.ipn.intentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanzarWeb(View view){
        Intent intent;
        Uri uri;
        uri = Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
        intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}