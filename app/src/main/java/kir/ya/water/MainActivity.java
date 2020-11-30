package kir.ya.water;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.imageButton2).setVisibility(View.INVISIBLE);
    }

    public void plusClick(View view) {
        findViewById(R.id.imageButton2).setVisibility(View.VISIBLE);
        TextView cnt = (TextView) findViewById(R.id.textCount);
        CharSequence zz = cnt.getText();
        int pz= Integer.valueOf(zz.toString());
        pz++;
        cnt.setText(Integer.toString(pz));
        ImageView imageView = findViewById(R.id.imageView);
        switch (pz) {
            case 2: imageView.setImageResource(R.drawable.ic_glass2); break;
            case 3: imageView.setImageResource(R.drawable.ic_glass3); break;
            case 4: imageView.setImageResource(R.drawable.ic_glass4); break;
            case 5: imageView.setImageResource(R.drawable.ic_glass5); break;
            case 6: imageView.setImageResource(R.drawable.ic_glass6); break;
            default:
                break;
        }
    }

    public void minusClick(View view) {
        TextView cnt=(TextView)findViewById(R.id.textCount);
        CharSequence zz = cnt.getText();
        int pz= Integer.valueOf(zz.toString());
        ImageView imageView = findViewById(R.id.imageView);
        switch (pz) {
            case 2: imageView.setImageResource(R.drawable.ic_glass2); break;
            case 3: imageView.setImageResource(R.drawable.ic_glass3); break;
            case 4: imageView.setImageResource(R.drawable.ic_glass4); break;
            case 5: imageView.setImageResource(R.drawable.ic_glass5); break;
            case 6: imageView.setImageResource(R.drawable.ic_glass6); break;
            default:
                break;
        }
        if (pz == 1)
            {findViewById(R.id.imageButton2).setVisibility(View.INVISIBLE);
            pz--;}
        else
        pz--;
        cnt.setText(Integer.toString(pz));
    }
}