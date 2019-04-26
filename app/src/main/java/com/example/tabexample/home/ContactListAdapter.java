package com.example.tabexample.home;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.tabexample.R;

import java.util.List;

public class ContactListAdapter  extends BaseAdapter {

    private List<Contact> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public ContactListAdapter(Context aContext,  List<Contact> listData) {
        this.context = aContext;
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.contact_item, null);
            holder = new ViewHolder();
            holder.avartar = (ImageView) convertView.findViewById(R.id.avartar);
            holder.number = (TextView) convertView.findViewById(R.id.number);
            holder.address = (TextView) convertView.findViewById(R.id.address);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Contact contact = this.listData.get(position);
        holder.number.setText(contact.getNumber());
        holder.address.setText(contact.getAddress());
        holder.avartar.setImageResource(contact.getAvartarId());

        return convertView;
    }

    // Tìm ID của Image ứng với tên của ảnh (Trong thư mục mipmap).
    public int getMipmapResIdByName(String resName)  {
        String pkgName = context.getPackageName();

        // Trả về 0 nếu không tìm thấy.
        int resID = context.getResources().getIdentifier(resName , "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }

    static class ViewHolder {
        ImageView avartar;
        TextView number;
        TextView address;
    }


}