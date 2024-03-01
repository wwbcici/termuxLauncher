package ww.start.termux;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class TermuxLauncher extends Activity {
  @Override
  protected void onCreate(Bundle b) {
    super.onCreate(b);

      startActivity(new Intent().setClassName("com.termux", "com.termux.app.TermuxActivity"));
      //finishAndRemoveTask();
  }

    @Override
    protected void onResume() {
        super.onResume();

        startActivity(new Intent().setClassName("com.termux", "com.termux.app.TermuxActivity"));
    }
}
