package uk.jumpingmouse.applauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    /**
     * This method is called when the activity is created.
     * It sets the activity layout to the main layout.
     * @param savedInstanceState the saved state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the menu is created.
     * It would normally inflate the menu but this is currently not required.
     * @param menu the menu
     * @return true if successful, false otherwise
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // For now, there is no menu
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * This method is called when a menu item is clicked.
     * @param item the menu item
     * @return true if successful, false otherwise
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        // The action bar will automatically handle clicks on the Home/Up button,
        // so long as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * This method handles the clicking of an app button.
     * @param view the app button which was clicked
     */
    public void appButtonClick(View view) {
        int appNameResource;
        switch (view.getId()) {
            case R.id.btnBuildItBigger:
                appNameResource = R.string.build_it_bigger_appname;
                break;
            case R.id.btnCapstone:
                appNameResource = R.string.capstone_appname;
                break;
            case R.id.btnLibrary:
                appNameResource = R.string.library_appname;
                break;
            case R.id.btnScores:
                appNameResource = R.string.scores_appname;
                break;
            case R.id.btnSpotifyStreamer:
                appNameResource = R.string.spotify_streamer_appname;
                break;
            case R.id.btnXyzReader:
                appNameResource = R.string.xyz_reader_appname;
                break;
            default:
                displayToast(getString(R.string.error_unhandled_button) + view.getId());
                return;
        }
        displayToast(String.format(getString(R.string.app_launch_message), getString(appNameResource)));
    }

    /**
     * Displays a short Toast message.
     * @param message the message to display
     */
    private void displayToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
