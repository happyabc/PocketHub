package com.github.android.app;


import android.os.Bundle;
import android.util.Log;
import com.github.android.app.sync.AccountAuthenticatorService;
import roboguice.activity.RoboActivity;

import static com.github.android.app.sync.AccountAuthenticatorService.addAccount;

public class DashboardActivity extends RoboActivity {
    private static final String TAG = "DA";

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

		try {
            addAccount(this);
        } catch (Exception e) {
            Log.w(TAG, "Unable to add account for syncing", e);
        }
    }

}
