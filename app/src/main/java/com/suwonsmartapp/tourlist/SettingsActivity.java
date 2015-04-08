
package com.suwonsmartapp.tourlist;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.Preference;
import android.preference.PreferenceActivity;

/**
 * Created by Shaein on 2015-04-08.
 */
public class SettingsActivity extends PreferenceActivity implements
        Preference.OnPreferenceClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_setting);

        CheckBoxPreference cheKey = (CheckBoxPreference) findPreference("useUpdate");
        Preference preKey1 = (Preference) findPreference("setting_action");
        Preference preKey2 = (Preference) findPreference("developer");

        cheKey.setOnPreferenceClickListener(this);
        preKey1.setOnPreferenceClickListener(this);
        preKey2.setOnPreferenceClickListener(this);

    }

    @Override
    public boolean onPreferenceClick(Preference preference) {

        // 백업
        if (preference.getKey().equals("useUpdate")) {
        }
        // 복원
        else if (preference.getKey().equals("setting_action")) {
        }
        // 개발자 정보
        else if (preference.getKey().equals("developer")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("신남교 sssn000@hanmail.net \n-액션바의 메뉴담당 \n\n전영일 askpc@hanmail.net \n-지도담당 \n\n손상문 irinssm@gmail.com \n-목록담당 \n\n유준택 juntaekryoo@gmail.com \n-수정,결과입력화면 담당 \n\n현기웅 \n-DB담당 \n\n 배꽃그리고솔 \n-리스트화면 구현담당");
            builder.setCancelable(false);
            builder.setNegativeButton("닫기", new DialogInterface.OnClickListener() {
                // 닫기 버튼 클릭시 설정
                public void onClick(DialogInterface dialog, int WhichButton) {
                    dialog.cancel();
                }
            });

            builder.show();

        }

        return true;
    }

}
