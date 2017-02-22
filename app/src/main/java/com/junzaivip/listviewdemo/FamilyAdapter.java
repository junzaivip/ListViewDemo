package com.junzaivip.listviewdemo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by Administrator on 2017-2-22.
 */

public class FamilyAdapter  extends ArrayAdapter<Family>{

    private  int resourceID;
    public FamilyAdapter(Context context, int resource, List<Family> objects) {
        super(context, resource, objects);
        resourceID = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Family family = getItem(position); // 获取当前项的Family实例
        View view = LayoutInflater.from(getContext()).inflate(resourceID, parent, false);
        ImageView  familyImage = (ImageView) view.findViewById(R.id.family_image);
        TextView familyName = (TextView) view.findViewById(R.id.family_name);
        TextView familyPhone = (TextView) view.findViewById(R.id.family_phone_num);

        familyImage.setImageResource(family.getImageID());
        familyName.setText(family.getName());
        familyPhone.setText(family.getPhoneNum());
        return view;
    }
}
