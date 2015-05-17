package appewtc.masterung.ishihara16may15;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class ShowScoreActivity extends ActionBarActivity {

    //Explicit
    private TextView showScoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_score);

        //Show Score
        showScore();

    }   // onCreate

    public void clickPlay(View view) {

    }

    public void clickExit(View view) {
        
    }



    private void showScore() {

        showScoreTextView = (TextView) findViewById(R.id.txtShowScore);
        int intMyScore = getIntent().getExtras().getInt("Score");
        showScoreTextView.setText(Integer.toString(intMyScore) + "/10");

    }   // showScore

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_show_score, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}   // Main Class
