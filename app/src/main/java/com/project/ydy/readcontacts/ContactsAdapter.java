package com.project.ydy.readcontacts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * **************************************************
 * 文件名称 : ContactsAdapter
 * 作    者 : Created by ydy
 * 创建时间 : 2018/6/19 15:06
 * 文件描述 : 联系人列表适配器
 * 注意事项 :
 * 修改历史 : 2018/6/19 1.00 初始版本
 * **************************************************
 */
public class ContactsAdapter extends BaseAdapter {

    private List<ContactsBean> contactsList;
    private LayoutInflater inflater;

    ContactsAdapter(Context context, List<ContactsBean> contactsList) {
        this.contactsList = contactsList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contactsList == null ? 0 : contactsList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_contact_info, parent, false);
            holder = new ViewHolder();
            holder.displayName = (TextView) convertView.findViewById(R.id.display_name);
            holder.phoneNumber = (TextView) convertView.findViewById(R.id.phone_number);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //填值
        ContactsBean contactsInfo = contactsList.get(position);
        holder.displayName.setText(contactsInfo.getDisplayName());
        holder.phoneNumber.setText(contactsInfo.getPhoneNumber());

        return convertView;
    }

    private class ViewHolder {
        TextView displayName;
        TextView phoneNumber;
    }
}