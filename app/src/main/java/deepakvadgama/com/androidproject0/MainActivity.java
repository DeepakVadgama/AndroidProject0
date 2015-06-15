package deepakvadgama.com.androidproject0;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void showToast(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Nanodegree project!";
        if (view instanceof Button) {
            Button b = (Button) view;
            int id = b.getId();
            String name = getResources().getResourceEntryName(id);
            String projectName = getProjectName(name);
            text = "This button will launch my " + projectName + " project!";
        }
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM | Gravity.FILL_HORIZONTAL, 10, 10);
        toast.show();

    }

    private String getProjectName(String id) {

        switch (id) {
            case "button0":
                return getString(R.string.app0_name_toast);
            case "button1":
                return getString(R.string.app1_name_toast);
            case "button2":
                return getString(R.string.app2_name_toast);
            case "button3":
                return getString(R.string.app3_name_toast);
            case "button4":
                return getString(R.string.app4_name_toast);
            case "button5":
                return getString(R.string.app5_name_toast);
            default:
                return "";
        }
    }
}
