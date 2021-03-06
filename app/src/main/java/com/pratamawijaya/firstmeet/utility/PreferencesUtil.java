package com.pratamawijaya.firstmeet.utility;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by pratama on 6/28/16.
 */
public class PreferencesUtil {
  private static final String PREF_NAME = "BekrafPref";

  public static final String KEY_USER_NAME = "name";
  public static final String KEY_USER_EMAIL = "email";

  private static SharedPreferences sharedPreferences;

  // method writing
  public static void writeStringData(Context context,
      String key, String value) {
    sharedPreferences =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

    SharedPreferences.Editor editor = sharedPreferences.edit();
    editor.putString(key, value);
    editor.commit();
  }
  // method reading

  public static String readStringData(Context context,
      String key, String defValue) {

    sharedPreferences =
        context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);

    return sharedPreferences.getString(key, defValue);
  }
}
