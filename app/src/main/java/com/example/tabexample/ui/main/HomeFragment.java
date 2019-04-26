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
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;

import com.example.tabexample.MainActivity;
import com.example.tabexample.R;
import com.example.tabexample.home.Contact;
import com.example.tabexample.home.ContactListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class HomeFragment extends Fragment {
    MainActivity main;
    Context context = null;
    @Override
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

        View layout =  inflater.inflate(R.layout.tab_home, container, false);
        List<Contact> listContact = new ArrayList<Contact>();
        listContact.add(new Contact(R.drawable.caller1,"0345678129", "HN"));
        listContact.add(new Contact(R.drawable.caller1,"0345678129", "HN"));
        listContact.add(new Contact(R.drawable.caller2,"0345678129", "HN"));
        listContact.add(new Contact(R.drawable.caller1,"0345678129", "HN"));


        ListView listView = (ListView) layout.findViewById(R.id.list_view);

        ContactListAdapter adapter = new ContactListAdapter(context, listContact);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LinearLayout child = (LinearLayout) parent.getChildAt(position).findViewById(R.id.item);
                Log.e("log", child.toString());
                child.setEnabled(false);
            }
        });

        return layout;
    }
}