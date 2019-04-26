package com.example.tabexample.ui.main;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;

import com.example.tabexample.MainActivity;
import com.example.tabexample.R;
import com.example.tabexample.home.Contact;
import com.example.tabexample.home.ContactListAdapter;
import com.example.tabexample.setting.SettingItem;
import com.example.tabexample.setting.SettingListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class SettingFragment extends Fragment {

    MainActivity main;
    Context context = null;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            context = getActivity();
            main = (MainActivity) getActivity();
        } catch (IllegalStateException e) {

        }
    }
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        View layout =  inflater.inflate(R.layout.tab_setting, container, false);
        List<SettingItem> listSetting = new ArrayList<SettingItem>();
        listSetting.add(new SettingItem(R.drawable.profile, "My Profile"));
        listSetting.add(new SettingItem(R.drawable.msg, "Messages"));
        listSetting.add(new SettingItem(R.drawable.following, "Following"));
        listSetting.add(new SettingItem(R.drawable.album, "Albums"));
        listSetting.add(new SettingItem(R.drawable.post, "Saved Posts"));
        listSetting.add(new SettingItem(R.drawable.group, "Groups"));
        listSetting.add(new SettingItem(R.drawable.page, "Pages"));
        listSetting.add(new SettingItem(R.drawable.blog, "Blogs"));
        listSetting.add(new SettingItem(R.drawable.market, "Marketplace"));
        listSetting.add(new SettingItem(R.drawable.event, "Events"));


        ListView listView = (ListView) layout.findViewById(R.id.list_setting);

        SettingListAdapter adapter = new SettingListAdapter(context, listSetting);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        return layout;

    }
}