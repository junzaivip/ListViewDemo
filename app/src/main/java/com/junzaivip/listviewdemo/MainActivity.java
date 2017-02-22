package com.junzaivip.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //private String[] data = {"爸爸","妈妈","姐姐","妹妹","二姑","三姑","四舅","五伯","哥哥","嫂嫂","爷爷","奶奶","姥姥","姥爷"};

    private List<Family> familyList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFamilys();// 初始化家庭数据
        FamilyAdapter adapter = new FamilyAdapter(MainActivity.this,R.layout.family_item,familyList);
        ListView listView = (ListView)findViewById(R.id.list_view_demo);
        listView.setAdapter(adapter);

//        //android.R.layout.simple_list_item_1 作为ListView子项布局的id, 这是一个android内置的布局文件, 里面只有一个textview
//        //可用于简单的显示一段文本.
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
//        ListView listView = (ListView)findViewById(R.id.list_view_demo);
//        listView.setAdapter(adapter);

    }

    private void initFamilys() {
        for(int i= 0; i<2; i++){
            Family family1  = new Family("爸爸", R.mipmap.family_1, "13813813888");
            familyList.add(family1);
            Family family2  = new Family("妈妈", R.mipmap.family_2, "13813813888");
            familyList.add(family2);
            Family family3  = new Family("姐姐", R.mipmap.family_1, "13813813888");
            familyList.add(family3);
            Family family4  = new Family("三姑", R.mipmap.family_2, "13813813888");
            familyList.add(family4);
            Family family5  = new Family("妹妹", R.mipmap.family_1, "13813813888");
            familyList.add(family5);
            Family family6  = new Family("二姑", R.mipmap.family_1, "13813813888");
            familyList.add(family6);
            Family family7  = new Family("三姑", R.mipmap.family_2, "13813813888");
            familyList.add(family7);
            Family family8  = new Family("四舅", R.mipmap.family_1, "13813813888");
            familyList.add(family8);
            Family family9  = new Family("三姑", R.mipmap.family_2, "13813813888");
            familyList.add(family9);
            Family family10  = new Family("哥哥", R.mipmap.family_1, "13813813888");
            familyList.add(family10);

            Family family11  = new Family("嫂嫂", R.mipmap.family_1, "13813813888");
            familyList.add(family11);
            Family family12  = new Family("爷爷", R.mipmap.family_2, "13813813888");
            familyList.add(family12);
            Family family13  = new Family("奶奶", R.mipmap.family_1, "13813813888");
            familyList.add(family13);
            Family family14  = new Family("姥姥", R.mipmap.family_2, "13813813888");
            familyList.add(family14);
            Family family15  = new Family("姥爷", R.mipmap.family_1, "13813813888");
            familyList.add(family15);

        }


    }
}
