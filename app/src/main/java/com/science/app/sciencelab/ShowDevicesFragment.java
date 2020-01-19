package com.science.app.sciencelab;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShowDevicesFragment extends Fragment {
    private ArrayList<Item> deviceItems;
    DevicesAdapter adapter;
    LinearLayoutManager lm;
    int id;

    public ShowDevicesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_show_devices, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle bundle = getArguments();

        assert bundle != null;
        deviceItems = new MyDbHelper(getContext()).getAllItemForDepartment(bundle.getInt("num"));

//        MyDbHelper helper = new MyDbHelper(getContext());

        //helper.getAllItemForDepartment();


        /*deviceItems.add(new Item(2,"راسم الذبذبات", "",2,R.drawable.ic_mec));
        deviceItems.add(new Item(2,"وحدة جهد مستمر", "",2,R.drawable.ic_electr));
        deviceItems.add(new Item(2,"وحدة جهد عالي", "",2,R.drawable.ic_biology));*/



        /*MyDbHelper myDbHelper = new MyDbHelper(getContext());

        myDbHelper.addItem("راسم الذبذبات","",R.drawable.ic_electr,2);
        myDbHelper.addItem("وحدة جهد مستمر","",R.drawable.ic_electr,2);
        myDbHelper.addItem("وحدة جهد عالي","",R.drawable.ic_electr,2);
        myDbHelper.addItem("ملف رومكوف","",R.drawable.ic_electr,2);
        myDbHelper.addItem("الملتٌميٌتر","",R.drawable.ic_electr,2);
        myDbHelper.addItem("الفولتميٌتر","",R.drawable.ic_electr,2);
        myDbHelper.addItem("الأميتر","",R.drawable.ic_electr,2);
        myDbHelper.addItem("جلفانومٌيتر","",R.drawable.ic_electr,2);
        myDbHelper.addItem("ملف كهربائي","",R.drawable.ic_electr,2);
        myDbHelper.addItem("مقاومة منغيرة","",R.drawable.ic_electr,2);
        myDbHelper.addItem("الدايود","",R.drawable.ic_electr,2);*/


/*
        myDbHelper.addItem("الكشاف الكهربائي","",R.drawable.ic_electr,3);
        myDbHelper.addItem("وحدة جهد مستمر","",R.drawable.ic_electr,3);



        myDbHelper.addItem("البوصلة","",R.drawable.ic_electr,4);
        myDbHelper.addItem("وحدة جهد مستمر","",R.drawable.ic_electr,4);
        myDbHelper.addItem("وحدة جهد عالي","",R.drawable.ic_electr,4);


        myDbHelper.addItem("المسعر الحراري","",R.drawable.ic_electr,5);
        myDbHelper.addItem("وحدة جهد مستمر","",R.drawable.ic_electr,5);
        myDbHelper.addItem("وحدة جهد عالي","",R.drawable.ic_electr,5);
        myDbHelper.addItem("ملف رومكوف","",R.drawable.ic_electr,5);
        myDbHelper.addItem("الملتٌميٌتر","",R.drawable.ic_electr,5);
        myDbHelper.addItem("الفولتميٌتر","",R.drawable.ic_electr,5);
        myDbHelper.addItem("الأميتر","",R.drawable.ic_electr,5);
        myDbHelper.addItem("جلفانومٌيتر","",R.drawable.ic_electr,5);
        myDbHelper.addItem("ملف كهربائي","",R.drawable.ic_electr,5);
        myDbHelper.addItem("مقاومة منغيرة","",R.drawable.ic_electr,5);
        myDbHelper.addItem("الدايود","",R.drawable.ic_electr,5);


        myDbHelper.addItem("المجموعة الضوئيٌة – قرص هارتل","",R.drawable.ic_electr,6);
        myDbHelper.addItem("وحدة جهد مستمر","",R.drawable.ic_electr,6);
        myDbHelper.addItem("وحدة جهد عالي","",R.drawable.ic_electr,6);
        myDbHelper.addItem("ملف رومكوف","",R.drawable.ic_electr,6);
        myDbHelper.addItem("الملتٌميٌتر","",R.drawable.ic_electr,6);
        myDbHelper.addItem("الفولتميٌتر","",R.drawable.ic_electr,6);
        myDbHelper.addItem("الأميتر","",R.drawable.ic_electr,6);
        myDbHelper.addItem("جلفانومٌيتر","",R.drawable.ic_electr,6);
        myDbHelper.addItem("ملف كهربائي","",R.drawable.ic_electr,6);
        myDbHelper.addItem("مقاومة منغيرة","",R.drawable.ic_electr,6);
        myDbHelper.addItem("الدايود","",R.drawable.ic_electr,6);

        myDbHelper.addItem("ميٌزان الكترونيً","",R.drawable.ic_electr,7);
        myDbHelper.addItem("وحدة جهد مستمر","",R.drawable.ic_electr,7);
        myDbHelper.addItem("وحدة جهد عالي","",R.drawable.ic_electr,7);
        myDbHelper.addItem("ملف رومكوف","",R.drawable.ic_electr,7);
        myDbHelper.addItem("الملتٌميٌتر","",R.drawable.ic_electr,7);
        myDbHelper.addItem("الفولتميٌتر","",R.drawable.ic_electr,7);
        myDbHelper.addItem("الأميتر","",R.drawable.ic_electr,7);
        myDbHelper.addItem("جلفانومٌيتر","",R.drawable.ic_electr,7);
        myDbHelper.addItem("ملف كهربائي","",R.drawable.ic_electr,7);
        myDbHelper.addItem("مقاومة منغيرة","",R.drawable.ic_electr,7);
        myDbHelper.addItem("الدايود","",R.drawable.ic_electr,7);

        myDbHelper.addItem("جهاز الطرد المركزي","",R.drawable.ic_electr,8);
        myDbHelper.addItem("وحدة جهد مستمر","",R.drawable.ic_electr,8);
        myDbHelper.addItem("وحدة جهد عالي","",R.drawable.ic_electr,8);
        myDbHelper.addItem("ملف رومكوف","",R.drawable.ic_electr,8);
        myDbHelper.addItem("الملتٌميٌتر","",R.drawable.ic_electr,8);
        myDbHelper.addItem("الفولتميٌتر","",R.drawable.ic_electr,8);
        myDbHelper.addItem("الأميتر","",R.drawable.ic_electr,8);
        myDbHelper.addItem("جلفانومٌيتر","",R.drawable.ic_electr,8);
        myDbHelper.addItem("ملف كهربائي","",R.drawable.ic_electr,8);
        myDbHelper.addItem("مقاومة منغيرة","",R.drawable.ic_electr,8);
        myDbHelper.addItem("الدايود","",R.drawable.ic_electr,8);

        myDbHelper.addItem("الماصة","",R.drawable.ic_electr,9);
        myDbHelper.addItem("وحدة جهد مستمر","",R.drawable.ic_electr,9);
        myDbHelper.addItem("وحدة جهد عالي","",R.drawable.ic_electr,9);
        myDbHelper.addItem("ملف رومكوف","",R.drawable.ic_electr,9);
        myDbHelper.addItem("الملتٌميٌتر","",R.drawable.ic_electr,9);
        myDbHelper.addItem("الفولتميٌتر","",R.drawable.ic_electr,9);
        myDbHelper.addItem("الأميتر","",R.drawable.ic_electr,9);
        myDbHelper.addItem("جلفانومٌيتر","",R.drawable.ic_electr,9);
        myDbHelper.addItem("ملف كهربائي","",R.drawable.ic_electr,9);
        myDbHelper.addItem("مقاومة منغيرة","",R.drawable.ic_electr,9);
        myDbHelper.addItem("الدايود","",R.drawable.ic_electr,9);

        myDbHelper.addItem("أدوات مساعدة","",R.drawable.ic_electr,10);
*/




        /*myDbHelper.addItem("الكهربـــــاء الساكنــة","",R.drawable.ic_static,3);
        myDbHelper.addItem("المغنــاطٌيســـٌــــة","",R.drawable.ic_magnetic,4);
        myDbHelper.addItem("الحـــــــــــــــــرارة","",R.drawable.ic_temp,5);
        myDbHelper.addItem("الضــــــــــــــوء","",R.drawable.ic_light,6);
        myDbHelper.addItem("أجهزة كيٌمٌــــــــــاء","",R.drawable.ic_chem,7);
        myDbHelper.addItem("أحٌيـــــــــــــــــاء","",R.drawable.ic_biology,8);
        myDbHelper.addItem("زجاجيات","",R.drawable.ic_glass,9);
        myDbHelper.addItem("أدوات مساعدة","",R.drawable.ic_helper,10);*/

        /*deviceItems.add(new Item(2,"الكهربــــــــــاء","",2,R.drawable.ic_electr));
        deviceItems.add(new Item(3,"الكهربـــــاء الساكنــة","",3,R.drawable.ic_static));
        deviceItems.add(new Item(4,"المغنــاطٌيســـٌــــة","",4,R.drawable.ic_magnetic));
        deviceItems.add(new Item(5,"الحـــــــــــــــــرارة","",5,R.drawable.ic_temp));
        deviceItems.add(new Item(6,"الضــــــــــــــوء","",6,R.drawable.ic_light));
        deviceItems.add(new Item(7,"أجهزة كيٌمٌــــــــــاء","",7,R.drawable.ic_chem));
        deviceItems.add(new Item(8,"أحٌيـــــــــــــــــاء","",8,R.drawable.ic_biology));
        deviceItems.add(new Item(9,"زجاجيات","",9,R.drawable.ic_glass));
        deviceItems.add(new Item(10,"أدوات مساعدة","",10,R.drawable.ic_helper));*/

        //new MyDbHelper(getContext());
        //getArguments();




        RecyclerView rc = getView().findViewById(R.id.recyclerView);
        adapter = new DevicesAdapter(getContext(),deviceItems);

        lm= new LinearLayoutManager(getContext());
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        rc.setLayoutManager(lm);
        rc.setAdapter(adapter);


    }

    public void refresh(int i){
        lm.scrollToPosition(0);
        deviceItems = new MyDbHelper(getContext()).getAllItemForDepartment(i);
        adapter.refresh(deviceItems);
    }
}
