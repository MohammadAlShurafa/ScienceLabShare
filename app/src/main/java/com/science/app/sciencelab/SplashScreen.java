package com.science.app.sciencelab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    MyDbHelper myDbHelper;
    ImageView logoIm;
    TextView appNameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        SharedPreferences prefs = getSharedPreferences("science", MODE_PRIVATE);
        boolean isFirst = prefs.getBoolean("isFirstTime", true);
        if (isFirst) {
            myDbHelper   = new MyDbHelper(SplashScreen.this);

            myDbHelper.addItem("الباروميتر المعدني", "", R.drawable.photo1, 1);
            myDbHelper.addItem("الباروميتر الزئبقي", "", R.drawable.photo2, 1);
            myDbHelper.addItem("جهاز هوك", "", R.drawable.photo3, 1);
            myDbHelper.addItem("ميزان ذو كفتين", "", R.drawable.photo4, 1);
            myDbHelper.addItem("الميكروميتر", "", R.drawable.photo5, 1);
            myDbHelper.addItem("القدمة ذات الورنية", "", R.drawable.photo6, 1);
            myDbHelper.addItem("الميزان النابضي", "", R.drawable.photo7, 1);
            myDbHelper.addItem("طاولة القوى", "", R.drawable.photo8, 1);
            myDbHelper.addItem("السكة الهوائية", "", R.drawable.photo9, 1);
            myDbHelper.addItem("جهاز السقوط الحر", "", R.drawable.photo10, 1);
            myDbHelper.addItem("الأواني المستطرقة", "", R.drawable.photo11, 1);
            myDbHelper.addItem("مخلخلة الهواء", "", R.drawable.photo12, 1);

            prefs.edit().putBoolean("isFirstTime", false).apply();

            myDbHelper.addItem("راسم الذبذبات","",R.drawable.photo2_1,2);
            myDbHelper.addItem("وحدة جهد مستمر ومتردد","",R.drawable.photo2_2,2);
            myDbHelper.addItem("وحدة جهد عالي الفولتية","",R.drawable.photo2_3,2);
            myDbHelper.addItem("ملف رومكوف","",R.drawable.photo2_4,2);
            myDbHelper.addItem("ساعة القياس الرقمية","",R.drawable.photo2_5,2);
            myDbHelper.addItem("جهاز قياس فرق الجهد الفولتميتر","",R.drawable.photo2_6,2);
            myDbHelper.addItem("الأميتر","",R.drawable.photo2_7,2);
            myDbHelper.addItem("الجلفانوميتر","",R.drawable.photo2_8,2);
            myDbHelper.addItem("الملف الكهربائي","",R.drawable.photo2_9,2);
            myDbHelper.addItem("المقاومات المنغيرة","",R.drawable.photo2_10,2);
            myDbHelper.addItem("الوصلة الثنائية (الدايود)","",R.drawable.photo2_11,2);

            myDbHelper.addItem("الكشاف الكهربائي","",R.drawable.photo3_1,3);
            myDbHelper.addItem("مولد فاندي غراف","",R.drawable.photo3_2,3);

            myDbHelper.addItem("البوصلة","",R.drawable.photo4_1,4);
            myDbHelper.addItem("المغانط","",R.drawable.photo4_2,4);
            myDbHelper.addItem("إبرة الميل","",R.drawable.photo4_3,4);

            myDbHelper.addItem("المسعر الحراري","",R.drawable.photo5_1,5);
            myDbHelper.addItem("مقياس الرطوبة (هيجروميتر)","",R.drawable.photo5_2,5);
            myDbHelper.addItem("التيرموميتر الزئبقي","",R.drawable.photo5_3,5);
            myDbHelper.addItem("جهاز هوب","",R.drawable.photo5_4,5);
            myDbHelper.addItem("ثنائي الفلز","",R.drawable.photo5_5,5);
            myDbHelper.addItem("جهاز اختلاف توصٌيل المعادن للحرارة","",R.drawable.photo5_6,5);


            myDbHelper.addItem("المجموعة الضوئية – قرص هارتل","",R.drawable.photo6_1,6);
            myDbHelper.addItem("العدسات المحدبة والمقعرة","",R.drawable.photo6_2,6);
            myDbHelper.addItem("المرشح الضوئي","",R.drawable.photo6_3,6);
            myDbHelper.addItem("حوض الأمواج","",R.drawable.photo6_4,6);


            myDbHelper.addItem("الميزان الإلكتروني","",R.drawable.photo7_1,7);
            myDbHelper.addItem("خزانة طرد الغازات","",R.drawable.photo7_2,7);
            myDbHelper.addItem("هيدروميتر كثافة","",R.drawable.photo7_3,7);
            myDbHelper.addItem("مقياس الأس الهيدروجيني","",R.drawable.photo7_4,7);
            myDbHelper.addItem("جهاز هوفمان","",R.drawable.photo7_5,7);
            myDbHelper.addItem("المكثف","",R.drawable.photo7_6,7);
            myDbHelper.addItem("قمع بوخنر","",R.drawable.photo7_7,7);
            myDbHelper.addItem("قنطرة ملحيٌة","",R.drawable.photo7_8,7);
            myDbHelper.addItem("أنابيب الطيف","",R.drawable.photo7_9,7);
            myDbHelper.addItem("جهاز كب","",R.drawable.photo7_10,7);

            myDbHelper.addItem("جهاز الطرد المركزي","",R.drawable.photo8_1,8);
            myDbHelper.addItem("الشريحة المجهرية","",R.drawable.photo8_2,8);
            myDbHelper.addItem("طبق بتري","",R.drawable.photo8_3,8);
            myDbHelper.addItem("المجهر الضوئي","",R.drawable.photo8_4,8);
            myDbHelper.addItem("المجهر التشرٌيحًي","",R.drawable.photo8_5,8);

            myDbHelper.addItem("الماصة","",R.drawable.photo9_1,9);
            myDbHelper.addItem("الدورق القياسي","",R.drawable.photo9_2,9);
            myDbHelper.addItem("السحاحة","",R.drawable.photo9_3,9);
            myDbHelper.addItem("الدورق","",R.drawable.photo9_4,9);
            myDbHelper.addItem("المخبار المدرج","",R.drawable.photo9_5,9);
            myDbHelper.addItem("كأس زجاجًي","",R.drawable.photo9_6,9);
            myDbHelper.addItem("المعوجة الزجاجٌية","",R.drawable.photo9_7,9);
            myDbHelper.addItem("زجاجة ساعة","",R.drawable.photo9_8,9);
            myDbHelper.addItem("أنبوب اختبار","",R.drawable.photo9_9,9);
            myDbHelper.addItem("الأقماع الزجاجٌية","",R.drawable.photo9_10,9);

            //myDbHelper.addItem("أدوات مساعدة","",R.drawable.ic_electr,10);
            myDbHelper.addItem("ثاقب الفلين","",R.drawable.photo10_1,10);
            myDbHelper.addItem(" لهب بنسن","",R.drawable.photo10_2,10);
            myDbHelper.addItem("ورق الترشيح","",R.drawable.photo10_3,10);
            myDbHelper.addItem("سباتيولا_ ملعقة الاحتراق","",R.drawable.photo10_4,10);
            myDbHelper.addItem("قارورة بلاستيكية","",R.drawable.photo10_5,10);
            myDbHelper.addItem("ماسك","",R.drawable.photo10_6,10);
            myDbHelper.addItem("البوتقة","",R.drawable.photo10_7,10);


        }

       /* logoIm = findViewById(R.id.logoIm);
        Animation animationTop = AnimationUtils.loadAnimation(SplashScreen.this,R.anim.fromtop);
        logoIm.setAnimation(animationTop);

        appNameTv = findViewById(R.id.appNameTv);
        Animation animationBottom = AnimationUtils.loadAnimation(SplashScreen.this,R.anim.frombottom);
        appNameTv.setAnimation(animationBottom);*/


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }


}
