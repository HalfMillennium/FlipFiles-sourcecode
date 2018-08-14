package com.amaze.flipfiles.activities.superclasses;

import android.support.v7.app.AppCompatActivity;

import com.amaze.flipfiles.ui.colors.ColorPreferenceHelper;
import com.amaze.flipfiles.utils.application.AppConfig;
import com.amaze.flipfiles.ui.colors.ColorPreference;
import com.amaze.flipfiles.utils.provider.UtilitiesProvider;
import com.amaze.flipfiles.utils.theme.AppTheme;

/**
 * Created by rpiotaix on 17/10/16.
 */
public class BasicActivity extends AppCompatActivity {

    protected AppConfig getAppConfig() {
        return (AppConfig) getApplication();
    }

    public ColorPreferenceHelper getColorPreference() {
        return getAppConfig().getUtilsProvider().getColorPreference();
    }

    public AppTheme getAppTheme() {
        return getAppConfig().getUtilsProvider().getAppTheme();
    }

    public UtilitiesProvider getUtilsProvider() {
        return getAppConfig().getUtilsProvider();
    }
}
