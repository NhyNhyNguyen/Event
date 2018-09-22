package demo.nhi.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;
public class AnonymousListener extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button calculate = (Button) findViewById(R.id.calculate);
    }
    public void btn_cal(View v)
    {
        EditText edita = (EditText) findViewById(R.id.et_numa);
        int a = Integer.parseInt(edita.getText() + "");
        EditText editb = (EditText) findViewById(R.id.et_numb);
        int b = Integer.parseInt(editb.getText() + "");
        TextView kq = (TextView)findViewById(R.id.tv_result);
        kq.setText((a+b) + "");
    }
}

