package hritikaggarwal_samples.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private bgChange background = new bgChange();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        final TextView factLabel = (TextView) findViewById(R.id.main_fact);
        final Button showFactButton = (Button) findViewById(R.id.next_fact);

        final RelativeLayout layout = (RelativeLayout) findViewById(R.id.bg);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fact = mFactBook.getFact();
                String color = background.getColor();

                //changing text
                factLabel.setText(fact);
                showFactButton.setTextColor(Color.parseColor(color));
                layout.setBackgroundColor(Color.parseColor(color));
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}
