package com.science.app.sciencelab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
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

            myDbHelper.addItem("الباروميتر المعدني",
                    "عبارة عن علبة معدنية مستديرة من النيكل والفضة مفرغة تماما من الهواء فإذا زاد الضغط يضغط على السطح المموج للعلبة المفرغة فتنخفض سطح العلبة وينخفض معه الساق والرافعة فيتحرك المحور والمؤشر المتصل به حركة دائرية أمام الدائرة المدرجة ليعطى قيمة الضغط, وإذا قل الضغط يرتفع سطح العلبة فيرتفع معه الساق والرافعة فيتحرك المحور والمؤشر حركة دائرية فى عكس الاتجاه السابق.\n" +
                            "- وظيفته الرئيسية  تسجيل الضغط الجوي عند مستوى \n" +
                            "البحر.\n"
                   , R.drawable.photo1, 1);
            myDbHelper.addItem("الباروميتر الزئبقي",
                    "يتكون من أنبوب زجاجي من الزئبق له مستودع عند القاع، وتسبب التغيرات في ضغط الهواء ارتفاع أو انخفاض الزئبق في الأنبوب. \n" +
                            "ولكي نحصل على قراءة دقيقة يتعين تعديل المقياس حيث تكون نقطة الصفر في مستوى سطح الزئبق نفسه الموجود في المستودع، وهذا التعديل ضروري لأن هذا السطح يرتفع حينما ينخفض الزئبق \n" +
                            "في الأنبوب، وينخفض عندما يرتفع الزئبق في الأنبوب."
                    , R.drawable.photo2, 1);
            myDbHelper.addItem("جهاز هوك",
                    "مكونات الجهاز : القاعدة  – الحامل –  مرآة مدرجة –  نابض –  مجموعة أوزان مع خطاف.\n" +
                            "استخدامات الجهاز : يستخدم هذا الجهاز في تجربة إثبات قانون هوك وحساب ثابت المرونة لنابض حلزوني.\n"

                    , R.drawable.photo3, 1);
            myDbHelper.addItem("ميزان ذو كفتين",
                    "يتألف الميزان الميكانيكي مبدئياً من عاتق (عارضة) صلب يتأرجح على شفرة أفقية كحد السكين عند مركزه تدعى نقطة الارتكاز ، وعلى طرفي العاتق وعلى مسافة متساوية من المركز توجد شفرتان متوازيتان وكفتان تتدليان من حاملين، أو ترتكزان عليهما. يُوضع على إحداهما الكتلة المراد روزها، وعلى الثانية ثقل معلوم. \n" +
                            "مبدأ عمل الميزان :إن أسهل طريقة لاستعمال الميزان هي الوزن المباشر،فعند وضع كتلة ما (عينة) مجهولة الوزن في إحدى الكفتين يميل العاتق بزاوية معينة تتناسب مع وزن الكتلة.\n"
                    , R.drawable.photo4, 1);
            myDbHelper.addItem("الميكروميتر",
                    "هو عبارة عن جهاز مصمم لقياس البعد بين نقطتين للعديد من الأسطح ذات الأبعاد والأشكال المختلفة (كالطول والعرض والسمك والقطر والعمق) والتى تتطلب دقة عالية في القياس .\n" +
                            "يتكون جهاز ميكرومتر القياس الخارجي من جزئين أساسين:\n" +
                            "الجزء الثابت : ويحتوي على إطار أو هيكل الجهاز (Frame )على شكل حرف ((U لحمل بقية مكونات الجهاز الثابتة والمتحركة منها.\n" +
                            "الجزء المتحرك : الجزء الأساسي المتحرك هو جلبة القياس Sleeve) )التي إذا قمنا بتحريكها حركة دورانية عن طريق المسمار الجاس Ratchet Knob) ) فيتحرك عمود القياس لتثبيت الشيء المراد قياسه.\n"
                    , R.drawable.photo5, 1);
            myDbHelper.addItem("القدمة ذات الورنية",
                    "و هي أداة قياس تستعمل لقياس البعد (السُمك ) بين سطحين متوازيين، و قطر الاسطوانات ذات القطر الصغير)، كما تقيس أيضأ القطر الداخلي للاسطوانات، و عمق الثقوب و هي دقيقة جدًا\n" +
                            "\n" +
                            "-الورنيّة هي مقياس إضافي متحرك يلحق بمسطرة \n" +
                            "بمقياس ثابت ليتيح قراءة المسافة  بطريقة أكثر \n" +
                            "دقة عن طريق الحصول على كسور وحدات \n" +
                            "المقياس الثابت.\n" +
                            "\n"
                    , R.drawable.photo6, 1);
            myDbHelper.addItem("الميزان النابضي",
                    "يقاس وزن الجسم باستخدام أداة تسمى الميزان النابضي.\n" +
                            "يتكون الميزان النابضي من نابضٍ متصلٍ بمؤشر، وفي نهاية النابض خطّاف يُعلّق به الجسم المُراد وزنه.\n" +
                            "وبزيادة وزن الجسم المعلّق بالخطاف، \n" +
                            "زادت استطالة النابض.\n" +
                            "- يقاس الوزن بوحدة نيوتن .\n" +
                            "\n"
                    , R.drawable.photo7, 1);
            myDbHelper.addItem("طاولة القوى",
                    "تتكون هذه المجموعة بشكل أساسي من قرص معدني دائري الشكل مدرج من مركزه بزوايا من (صفر – °360 ) مثبت على حامل يرتكز على قاعدة معدنية ، يزود مع هذا الجهاز مجموعة من البكرات والخيوط والحلقات المعدنية ومجموعة من الأوزان المتغيرة القابلة للتعليق (Slotted masses).\n" +
                            "التجارب التي يمكن تنفيذها باستخدام هذا الجهاز :\n" +
                            "1. إيجاد محصلة قوتين مستويتين متلاقيتين .\n" +
                            "2. إيجاد محصلة ثلاث قوى مستوية ومتلاقية .\n" +
                            "3. تطبيق قاعدة الجيوب ( قاعدة لامي).\n" +
                            "4. تحليل قوة في اتجاهين متعامدين.\n" +
                            " \n" +
                            "\n"
                    , R.drawable.photo8, 1);
            myDbHelper.addItem("السكة الهوائية",
                    "مبدأ عمل السكة الهوائية:\n" +
                            "تعتمد السكة الهوائية في عملها على مبدأ الوسادة الهوائية لدراسة حركة الأجسام بمعزل عن قوة الاحتكاك.\n" +
                            "الأجزاء التي تتكون منها مجموعة السكة الهوائية:\n" +
                            "1. المجرى الهوائي .\n" +
                            "2.المضخة .\n" +
                            "3.العداد الزمني .\n" +
                            "4. البوابات الكهروضوئية .\n" +
                            "5. العربات .\n" +
                            "6. مجموعة الكتل .\n" +
                            "7 .الحلقات المرنة .\n" +
                            "8. النوابض .\n" +
                            "9.اللاصق التشابكي.\n" +
                            "10.الأقراص البلاستيكية .\n" +
                            "11. براغي التثبيت .\n" +
                            "12. براغي ضبط الاستواء .\n" +
                            "13. البكرات .\n" +
                            "14. الحواجز الضوئية .\n" +
                            "مجالات استخدام السكة الهوائية:\n" +
                            "1.تطبيق قانون نيوتن الأول .\n" +
                            "2.دراسة السرعة المتوسطة والسرعة اللحظية.\n" +
                            "3. حساب التسارع لجسم يتحرك على سط مائل .\n" +
                            "4.تطبيق قانون نيوتن الثاني .\n" +
                            "5. تطبيق قانون نيوتن الثالث .\n" +
                            "6. دراسة قانون حفظ الطاقة الميكانيكية .\n" +
                            "7. تطبيق تجارب التصادم المرن وعديم المرونة.\n" +
                            "8. دراسة الحركة التوافقية البسيطة .\n" +
                            "\n" +
                            "\n" +
                            "\n"
                    , R.drawable.photo9, 1);
            myDbHelper.addItem("جهاز السقوط الحر",
                    "جهاز السقوط الحر يستخدم في إثبات قوانين نيوتن ،ويتكون من: \n" +
                            " - مسطرة مدرّجة.\n" +
                            " - حامل للكرة المعدنية.\n" +
                            "- ساعة إيقاف كهربائية.\n" +
                            "تثبت الكرة المعدنية في الحامل بالمسمار الضاغط عند الإرتفاع المطلوب \n" +
                            "وبذلك تكون الدائرة الكهربائية متصلة من خلال الكرة المعدنية \n" +
                            "عندما تُفلت الكرة تنفصل الدائرة الكهربائية ويبدأ المؤقت بالعد. \n" +
                            "وعندما تهبط الكرة على الكفة تضغطها للأسفل\n" +
                            "فتتصل الدائرة الكهربائية مرة أخرى ويتوقف العد.\n"
                    , R.drawable.photo10, 1);
            myDbHelper.addItem("الأواني المستطرقة",
                    "هي أداة اختبارية توضح أن ضغط السائل عند قاع الإناء لا يعتمد على شكل أو حجم الإناء و إنما يعتمد على ارتفاع السائل في الإناء .\n" +
                            "جهاز الأواني المستطرقة هو مجموعة من الأواني مختلفة الشكل إلا إن ارتفاع السائل فيها متساوي وهذا يعني أن الضغط فيها متساوي.\n"
                    , R.drawable.photo11, 1);
            myDbHelper.addItem("مخلخلة الهواء",
                    "جهاز يقوم بتفريغ الهواء في التجارب العلمية، وهناك نوعان من الأجهزة: ميكانيكي وكهربائي.          ويتكون الجهاز من عدة أجزاء رئيسية : \n" +
                            " صمام سحب الهواء، قصبة التفريغ، ذراع المفرغة، مقبض الذراع ، القاعدة والمحرك .\n" +
                            "استخدامات الجهاز:\n" +
                            "   يستخدم في التجارب العملية مثل تجارب الصوت وتجارب الغليان.\n"
                    , R.drawable.photo12, 1);

            prefs.edit().putBoolean("isFirstTime", false).apply();

            myDbHelper.addItem("راسم الذبذبات",
                    "- تعريفه :هو جهاز يستخدم لتعيين تردد جهد مجهول و لدراسة التغيرات للتيارات الكهربائية والجهود والنبضات الكهربائية.\n" +
                            " - تركيبه : يتركب من أنبوبه أشعة الكاثود ( المجموعة الحارفة ) فيها عبارة عن زوجين من الألواح المعدنية    (س1, س2,ص1,ص2 ) يولدان مجالين كهربائيين متعامدين على بعضهما البعض وعلى مسار الشعاع الالكتروني \n" +
                            " - استخداماته: 1ـ يستخدم في الكشف عن تردد مجهول بمعلومية تردد جهد معلوم.\n" +
                            "2ـ دراسة خصائص التيارات المترددة .\n"
                    ,R.drawable.photo2_1,2);
            myDbHelper.addItem("وحدة جهد مستمر ومتردد",
                    "جهاز يقوم بتوفير جهد مستمر ومتردد منخفض الجهد يتراوح بين 0 و 30 فولت، ويتكون من: \n" +
                            "مفتاح التشغيل، مفتاح التحكم في الجهد، مخارج الجهد، برغي تصفير الجهاز، مفتاح اختيار الجهد المستمر أو المتردد ومفتاح إعادة التشغيل.\n" +
                            "استخدامات الجهاز:\n" +
                            "يستخدم في التجارب العملية لإمداد الدوائر الكهربائية والمغناطيسية والإلكترونية بالجهد الكهربائي المنخفض.\n"
                    ,R.drawable.photo2_2,2);
            myDbHelper.addItem("وحدة جهد عالي الفولتية",
                    "جهاز يقوم بتوفير جهد مستمر عالي الجهد (الفولتية ) يتراوح بين 0 و 6 آلاف فولت مع شدة تيار منخفضة (مللي أمبير) كما يحتوي على وحدة جهد متردد ثابت الفولتية (3-6)فولت.\n" +
                            " ويتكون من: مفتاح التشغيل، مفتاح التحكم في الجهد، مخارج الجهد، برغي ( مسمار) تصفير الجهاز، مفتاح اختيار الجهد المستمر ومفتاح إعادة التشغيل.\n" +
                            "استخدامات الجهاز:\n" +
                            " يُستخدم في التجارب العملية لإمداد الدوائر الكهربائية والمغناطيسية والإلكترونية بالجهد الكهربائي.\n"
                    ,R.drawable.photo2_3,2);
            myDbHelper.addItem("ملف رومكوف",
                    "يتكون الجهاز بصورة أساسية من ملفين:\n" +
                            "الملف الأول يتكون من سلك نحاسي معزول غليظ يتراوح عدد لفاته بين 150و300لفة تقريبا .\n" +
                            "الملف الثانوي يتكون من سلك نحاسي رفيع معزول يتراوح عدد لفاته من40000الى100000لفة تقريبا .\n" +
                            "يستخدم الملف لتوليد شحنة تفريغ عالية الجهد قادرة على تأيين الغازات مخلخلة الضغط  في أنابيب التفريغ (أجهزة أشعة المهبط).\n" +
                            "وكذلك يستخدم في تمرير شرارة كهربائية في أجهزة الاحتراق الداخلي.\n"
                    ,R.drawable.photo2_4,2);
            myDbHelper.addItem("ساعة القياس الرقمية",
                    "جمع هذا الجهاز بين أكثر الأجهزة أهمية (الأميتر، الأفوميتر, الأوميتر  )ويحتوي هذا الجهاز على مفتاح اختيار يمكنك من خلاله اختيار نوع الكمية  المراد قياسها والتدريج المناسب.\n" +
                            "يقيس جهاز الملتيميتر:\n" +
                            "الأمبير ِA        .الفولت V           .الأوم          والأجهزة الحديثة منها تقيس المكثفات والترانزستور .\n" +
                            "وظيفة وطريقة عمله : تستخدم مثل هذا النوع من الأجهزة  الشائعة في أعمال الصيانة والإصلاح حيث يمكن بنفس الجهاز قياس فرق الجهد  وشدة التيار بمدى \n" +
                            "قياسات مختلفة .\n"
                    ,R.drawable.photo2_5,2);
            myDbHelper.addItem("جهاز قياس فرق الجهد الفولتميتر",
                    "يستخدم هذا الجهاز لقياس فرق الجهد المطبق بين طرفي حمل كهربائي ما أو لقياس جهد المصدر يوصل هذا الجهاز على التوازي مع المصدر أو الحمل  الكهربائي مع شرط سريان التيار الكهربائي أي يجب أن تكون الدارة الكهربائية  المراد قياس فولتيتها مغلقة، ويحتوي هذا الجهاز على مفتاح اختيار لتحديد  نوع الجهد المراد قياسه هل هو متردد ام ثابت.\n"
                    ,R.drawable.photo2_6,2);
            myDbHelper.addItem("الأميتر",
                    "يستخدم هذا الجهاز لقياس التيار الكهربائي المار في حمل كهربائي ما ،  يوصل هذا الجهاز مع الحمل المراد قياس تياره على التوالي مع مراعاة أن تكون  الدارة الكهربائية مغلقة، ويحتوي هذا الجهاز على مفتاح اختيار لتحديد نوع  التيار المراد قياسه هل هو متردد أم ثابت.\n"
                    ,R.drawable.photo2_7,2);
            myDbHelper.addItem("الجلفانوميتر",
                    "جهاز حساس يستخدم  لقياس شدة التيار الصغيرة جداً في الدارات الكهربائية.\n"
                    ,R.drawable.photo2_8,2);
            myDbHelper.addItem("الملف الكهربائي",
                    "هو سلك ملفوف حلزونيا ذو عدد لفات كبير بحيث تشكل شكلا أسطوانيا. يستخدم في الفيزياء وفي الهندسة الكهربائية ويكون عادة ملفوفا حول أسطوانة (أو قلب) حديدية. \n" +
                            "عندما يمر تيار كهربائي في الملف ينشأ مجالا مغناطيسيا داخل الملف اللولبي وخارجه.\n"
                    ,R.drawable.photo2_9,2);
            myDbHelper.addItem("المقاومات المنغيرة",
                    "تستخدم المقاومات المتغيرة في تجزئة الجهد في الدوائر الكهربائية ،وتصنع المقاومة المتغيرة لتحمل تيارات عالية عن طريق المقاومة السلكية ، أو تيارات منخفضة المقاومة مثل المقاومات الكربونية."
                    ,R.drawable.photo2_10,2);
            myDbHelper.addItem("الوصلة الثنائية (الدايود)",
                    "تصنع الوصلة الثنائية (الدايود) من السيليكون أو الجرمانيوم وهو عبارة عن وصلة مكونة من طبقتين مختلفتين من المادة شبه الموصلة إحداهما مادة شبه موصلة من النوع الموجبP)  ) والأخرى مادة شبه موصلة من النوع السالب (N) .\n" +
                            "تستخدم الوصلات الثنائية في الدوائر الإلكترونية بكثرة، ومن استخداماتها تقويم التيار الكهربائي المتردد لتحويله إلى تيار مستمر ."
                    ,R.drawable.photo2_11,2);

            myDbHelper.addItem("الكشاف الكهربائي",
                    " هو جهاز يستخدم لدراسة الكهرباء الساكنة ، والكشف عن الشحنات الموجودة على الجسم ونوعها وأبسط أنواع الكشافات الكهربائية هو الكشاف الكهربائي ذو الورقة الذهبية.\n" +
                            "تركيبه :  قرص مصنوع من عنصر فلزي ـ ساق فلزية ـ ورقتان فلزيتان رقيقتان ـ سداد ـ وعاء زجاجي أو من فلز وله وجهان من الزجاج .\n" +
                            "يمكن شحن الكشاف الكهربائي بعدة طرق ،\n" +
                            " منها طريقة اللمس .\n"
                    ,R.drawable.photo3_1,3);
            myDbHelper.addItem("مولد فاندي غراف",
                    "أسماء أخرى: مولد الكهرباء الساكنة ،فان دي غراف هو عبارة عن مُولد كهربائي يقوم بتوليد الكهرباء الساكنة.\n" +
                            "طريقة عمل الجهاز :\n" +
                            "يقوم جهاز فاني دي غراف بتوليد جهد كهربائي  عالي جدًّا علما أن تأثير هذا الجهاز يكون بسيط جدا قد لا يتعدى (لسعة بسيطة) لأن التيار  الكهربائي المتولد يكون معدوم.\n" +
                            "و يتكون الجهاز من كرة (قُبة) معدنية مجوفة محمولة على قضيبين عازلين و حزام عازل من الحرير أو المطاط تدور بكرتين متباعدتين إحداهما في الأسفل تديرها محرك كهربائي والأخرى في الأعلى تدور بتأثير الحزام و يمر الحزام أثناء دورانه بقطبين أحدهما في الأعلى و الآخر في الأسفل وهما عبارة عن مشطين كل واحد منهما ذو أسنان مدببة باتجاه الحزام حيث تعمل البطارية على تجهيز القطب الأسفل بفرق جهد\n" +
                            " (10000)فولت بالمقارنة مع الأرض فيقوم المجال الكهربائي العالي المتكون حول أسنان القطب الأسفل بتأيين الهواء القريب منها ثم تتكون شحنات موجبة تسحب بواسطة الحزام الذي يحملها إلى داخل الكرة المعدنية.\n"
                    ,R.drawable.photo3_2,3);

            myDbHelper.addItem("البوصلة",
                    "من أبسط الأدوات المعملية المستخدمة في تجارب المغناطيسية وتتركب من إبرة مغناطيسية صغيرة معينة الشكل محمولة على سن عمودي مدبب وموضوعة داخل علبة بلاستيكية ذات وجه زجاجي, وتسمى بوصلة الجيب , أما البوصلة البحرية فهي أكبر وغالباُ توضع داخل صندوق خشبي. \n" +
                            "تستخدم البوصلة في تجارب المجال المغناطيسي \n" +
                            "وتحديد الاتجاهات.\n"
                    ,R.drawable.photo4_1,4);
            myDbHelper.addItem("المغانط",
                    "تكون على أشكال متنوعة منها المستطيل ومنها الإسطواني ومنها على شكل حذوة الفرس والغرض منها التجارب المغناطيسية .\n"
                    ,R.drawable.photo4_2,4);
            myDbHelper.addItem("إبرة الميل",
                    "عبارة عن إبرة مغناطيسية حرة الحركة مركبة على منقلة مدرجة والغرض منها قياس زاوية الانحراف.\n"
                    ,R.drawable.photo4_3,4);

            myDbHelper.addItem("المسعر الحراري",
                    "جهاز يستخدم لتقدير وقياس كمية الحرارة المصاحبة للتفاعل الكيميائي باستـخدام جهـاز المسعر الحراري (الكالورميتر calorimeter ) .\n" +
                            "يتكوّن من صندوق معزول مملوء بالماء ويوضع به وعاء التفاعل بالإضافة إلى ترمومتر ومحرك وتتلخص الفكرة التي يعتمد عليها عمل المسعر ببساطة في أن التغير في درجة حرارة كتلة معينة من الماء تعتمد على كمية الحرارة المضافة إليها أو المأخوذة منها.\n"

                    ,R.drawable.photo5_1,5);
            myDbHelper.addItem("مقياس الرطوبة (هيجروميتر)",
                    "مقياس الرطوبة\n" +
                            "يتكون من تيرمومترين أحدهما يبلل مستودعه \n" +
                            "بالماء.\n" +
                            "والفرق بين قراءة التيرمومترين عبارة عن \n" +
                            "نسبة الرطوبة في الجو.\n" +
                            "\n"
                    ,R.drawable.photo5_2,5);
            myDbHelper.addItem("التيرموميتر الزئبقي",
                    "يتألف من انتفاخ يحوي كمية من الزئبق السائل الذي يمكنه التمدد والتحرك خلال أنبوبة شعرية وحجم الانبوبة الشعرية أقل بكثير من حجم الانتفاخ بحيث يؤدي تمدد بسيط للزئبق إلى حركة كبيرة للخيط الزئبقي . وحول هذه الانبوبة الشعرية يوجد أنبوب زجاجي مدرج ، وأحد تداريج درجات الحرارة شائعة الاستعمال هو التدرج المئوي ( السليسيوسي ) الذي يتم الحصول عليه بوضع الترمومتر في ثلج ينصهر وحفر علامة ( صفر مئوي) عند النقطة التي يقف عندها الخيط الزئبقي ثم يوضع في ماء يغلي حيث يتحرك الزئبق إلى موضع جديد تحفر عنده الدرجة (100) درجة مئوي، ثم تقسم المسافة بين هاتين النقطتين إلى (100) جزء متساوي .\n" +
                            "\n"
                    ,R.drawable.photo5_3,5);
            myDbHelper.addItem("جهاز هوب",
                    "جهاز يستخدم لدراسة شذوذ الماء يتكون من:\n" +
                            "إناء اسطواني .\n" +
                            "حوض خارجي .\n" +
                            "فتحتان جانبيتان لميزان الحرارة.\n"
                    ,R.drawable.photo5_4,5);
            myDbHelper.addItem("ثنائي الفلز",
                    "ثنائي المعدن بالإنجليزية: Bi-metal) ) هو عبارة عن معدنين مختلفين متصلين ببعضهما البعض على شكل طبقتين. وهو خلاف السبيكة التي يتم فيها خلط المعادن المختلفة ببعضها. \n" +
                            "تستخدم فكرة ثنائي المعدن في استغلال التغير في درجات الحرارة لتحويلها إلى حركة ميكانيكية. حيث أن المعدنين المختلفين يكون لهما معامل تمدد حراري مختلف، عند ارتفاع درجة الحرارة يبدأ المعدن ذو معامل التمدد الحراري الأقل في التمدد ولكن نطاق تمدده محدود لارتباطه بالمعدن ذي معامل التمدد الحراري الأعلى فيبدأ بالانحناء، وعند عودة درجة الحرارة إلى الوضع الطبيعي يعود إلى وضعه الأصلي.\n"
                    ,R.drawable.photo5_5,5);
            myDbHelper.addItem("جهاز اختلاف توصٌيل المعادن للحرارة",
                    "لهذا الجهاز أشكال مختلفة ،إلا أنها تؤدي الغرض نفسه، كما تشترك جميعها في الأجزاء الرئيسية، وأهمها القضبان المعدنية.\n" +
                            "استخدامات الجهاز:\n" +
                            "يستخدم الجهاز لإثبات أن المواد المختلفة تتفاوت في ناقليتها \n" +
                            "     وتوصيلها للحرارة.\n"
                    ,R.drawable.photo5_6,5);

            myDbHelper.addItem("المجموعة الضوئية – قرص هارتل",
                            "المكونات: تتكون المجموعة من :\n" +
                            " 1- لوح معدني مستطيل يثبت بشكل قائم بواسطة حامل معدني وقاعدة .\n" +
                            "2- قرص معدني مدرج قابل للدوران حول محور يمكن تثبيته على لوح العرض \n" +
                            "المستطيل أو إزالته حسب التجربة المراد تنفيذها .\n" +
                            "3- مصدر ضوئي يعمل على جهد منخفض 6-12 فولت .\n" +
                            "4- مجموعة من الحواجز الضوئية مزودة بشقوق للحصول على حزم ضوئية\n" +
                            " لتمثيل الشعاع الضوئي ،كما يحتوي على مرشحات بألوان مختلفة للحصول \n" +
                            "على حزم ضوئية ملونة .\n" +
                            "5- مجموعة من العناصر الضوئية تتضمن مقاطع لعدسات لامة ومفرقة \n" +
                            "للأشعة (محدبة ومقعرة) ومجموعة من المناشير المختلفة الأشكال لدراسة انكسار الاشعة فيها إضافة الى مرايا مستوية ومقعرة ومحدبة وكل هذه العناصر الضوئية يمكن تثبيتها على اللوح المستطيل القائم بواسطة مغانط صغيرة مثبتة فيها \n" +
                            "6- تحتاج هذه المجموعة الى مصدر جهد منخفض لا يكون عادة ضمن المجموعة .\n" +
                            "استخدامات المجموعة : يمكن باستخدام هذه المجموعة تنفيذ معظم التجارب المتعلقة بالضوء الهندسي (Geometrical Optics) من حيث الانعكاس والانكسار والتداخل والحيود .\n"
                    ,R.drawable.photo6_1,6);
            myDbHelper.addItem("العدسات المحدبة والمقعرة",
                    "العدسة هي قطعة من الزجاج (أو من أية مادة شفافة أخرى) ذات تكور أو تحدب في أحد سطحيها أو كليهما تحدث انكسارا في الأشعة الضوئية الساقطة على أحد وجهيها ، وتستخدم العدسة المحدبة لتجميع الأشعة الضوئية بينما تستخدم العدسة المقعرة لتفريق الأشعة.\n" +
                            "استعمال العدسات:\n" +
                            "تستخدم العدسة المحدبة كعدسة مكبرة.\n" +
                            "أما في حالة العدسة المقعرة ،تستخدم لتصغير الصورة."
                    ,R.drawable.photo6_2,6);
            myDbHelper.addItem("المرشح الضوئي",
                    "مرشح ضوئي في الفيزياء والفلك بالإنجليزية: (Optical filters)  ، يوجد نوعان من المرشحات الضوئية: أبسطها هي التي تمتص أشعة كهرومغناطيسية ، والنوع الثاني يعمل بطريقة التداخل dichroic filters  وقد تكون معقدة جدا.\n" +
                            "المرشح الضوئي يسمح بمرور الضوء الذي له طول موجة معينة ، مثل الأحمر أو الأخضر ويحجز الألوان الأخرى ، تستخدم في التصوير وفي بعض الأجهزة الضوئية وللإضاءة.\n"
                    ,R.drawable.photo6_3,6);
            myDbHelper.addItem("حوض الأمواج",
                    "جهاز يقوم بتوليد موجات مستقيمة ودائرية.\n" +
                            " يتم إسقاط صورة الأمواج على لوح أسفل الجهاز أو على شاشة الجهاز من خلال مصدر ضوئي يكون في أعلاه.\n" +
                            "يتكون الجهاز من: حوض مربع الشكل، حوامل الحوض، حامل لوح التذبذب، اللوح المتذبذب، النوابض (مولدات الأمواج) ، المحرك والمصباح.\n" +
                            "استخدامات الجهاز:\n" +
                            "يستخدم في دراسة خواص الحركة الموجية وانعكاسها وانكسارها ، كذلك التداخل والحيود الذي يحصل ما\n" +
                            "     بين الأمواج المتولدة من المتذبذب.\n"
                    ,R.drawable.photo6_4,6);


            myDbHelper.addItem("الميزان الإلكتروني",
                    "يستخدم ھذا الميزان لوزن العينات بسرعة ودقة \n" +
                            "ويستخدم الميزان حسب الطريقة التالية :\n" +
                            "١) يصفر الجھاز بعد تشغيله .\n" +
                            "2) وضع المادة المراد قياس كتلتھا على الكفة.\n" +
                            "٣) قراءة الرقم الظاھر \"كتلة المادة\".\n"
                    ,R.drawable.photo7_1,7);
            myDbHelper.addItem("خزانة طرد الغازات",
                    "تستخدم ھذه الخزانة في تحضير جميع الغازات وخاصة غازات الكلور والبروم لما لها من سمية عالية\n" +
                            "تركيبها:  تصنع ھذه الخزانة من الخشب شريطة تغطية سطوحها وجميع جوانبها بمواد مقاومة لتأثير \n" +
                            "المواد الكيميائية ، وتكون ذات وجه بلوري ينزلق الى الأسفل بسهولة  ، مزودة من الداخل بمحبس ماء\n" +
                            "وصنبور غاز ومقبس للتيار الكهربائي ، ومروحة شفط تكون مثبتة\n" +
                            "في الأعلى أو في أسفلها على أن تكون متصلة بالخارج .\n"
                    ,R.drawable.photo7_2,7);
            myDbHelper.addItem("هيدروميتر كثافة",
                    "هو جهاز لقياس كثافة السوائل ،والأساس العلمي له هو طفو الجسم الصلب على سطح سائل .\n" +
                            "وهو يتركب من مستودع زجاجي يوجد فيه كرات من الرصاص تساعد على الإتزان الرئيسي ويتصل مستودعه بساق زجاجي طويل ذي قطر صغير مدرج بوحدات الكثافة بحيث يشير التدريج السفلي إلى أعلى كثافة يقيسها الهيدروميتر ويشير التدريج الأعلى إلى أدنى كثافة يقيسها .\n"
                    ,R.drawable.photo7_3,7);
            myDbHelper.addItem("مقياس الأس الهيدروجيني",
                    " هي أداة إلكترونية تستعمل لقياس الأسّ الهيدروجيني (درجة الحموضة أو القاعديّة) لسائل معيّن. عادة ما يتكون من قطب خاص (قطب زجاجي) متصل بمقياس إلكتروني يقيس ويعرض رقم الأس الهيدروجيني.\n" +
                            "معايرة الجهاز واستعماله :تتمّ المعايرة عن طريق على الأقلّ محلولين منظمين ولكن من الأفضل استعمال ثلاث محاليل منظّمة. "
                    ,R.drawable.photo7_4,7);
            myDbHelper.addItem("جهاز هوفمان",
                    "هو جهاز لإجراء عملية التحليل الكهربائي للماء \n" +
                            "وصف الجهاز :يتألف الجهاز من ثلاث أسطوانات قائمة ومتصلة ببعضها البعض، والتي غالباً ما تكون مصنوعة من الزجاج. تكون الأسطوانة الوسطى مفتوحة من الأعلى لإضافة المزيد من الماء أو أي مركب أيوني من أجل زيادة الموصلية الكهربائية.\n" +
                            "يستخدم قطبان من البلاتين في قاعدة الأسطوانتين الطرفيتين واللذان يوصلان بمصدر كهربائي.\n" +
                            " عند مرور التيار تحدث عملية تحليل كهربائي بحيث يتشكل غاز الأكسجين على المصعد، وغاز الهيدروجين على المهبط.\n"
                    ,R.drawable.photo7_5,7);
            myDbHelper.addItem("المكثف",
                    "هو قطعة من الأدوات الزجاجية المختبرية ويستخدم في تبريد البخار أو الموائع الساخنة. يتكون المكثف من أنبوب زجاجي كبير يحتوي على أنبوب زجاجي أصغر من سابقه يمتد على كامل طوله حيث يمر ضمنه المائع الساخن.\n" +
                            "تكيف نهاية الأنبوب الزجاجي الداخلي عادة وفق وصلات زجاجية مصقولة بحيث يسهل تثبيتها مع الأدوات الزجاجية الأخرى. تترك النهاية العليا عادة مفتوحة للضغط الجوي، أو تهوّى باستخدام صنبور أو أنبوب تجفيف .\n" +
                            "ويكون الأنبوب الزجاجي الخارجي عادة مزود بفتحتين جانبيتين يمكن وصلهما لتمرير سائل تبريد، و يستعمل ماء الصنبور العادي. وتوجد أنواع مختلفة من المكثفات ."
                    ,R.drawable.photo7_6,7);
            myDbHelper.addItem("أقماع بوخنر",
                    "وتستخدم في أغراض الترشيح تحت ضغط منخفض وخاصة عندما تكون المادة الصلبة المراد ترشيحها  2غم أو أكثر.\n" +
                            "ويستخدم هذا القمع في جهاز بوخنر توجد على رأس القمع اسطوانة بها لوحة مثقوبة تفصلها عن القمع، \n" +
                            "وتوضع ورقة الترشيح المبللة بالمذيب على اللوحة وذلك لتقليل الفاقد\n" +
                            " توضع المادة المراد ترشيحها في الاسطوانة، وتمر عن طريق ثقب\n" +
                            "اللوحة إلى الدورق المخروطي عن طريق الشفط. \n" +
                            "والميزة الرئيسية في استخدام هذا النوع من الترشيح هي أن عملية \n" +
                            "الترشيح تكون أسرع (وعادة أكبر في الحجم) من الطرق العادية\n" +
                            " التي تعتمد على الجاذبية.\n"
                    ,R.drawable.photo7_7,7);
            myDbHelper.addItem("قنطرة ملحيٌة",
                    "هي أنبوب زجاجية أو بلاستيكية على شكل حرف U تستعمل عند تصميم الخلايا الجلفانية حيث تملأ بملح مشبع مثل كلوريد البوتاسيوم (KCl)، وتسد فتحاتها بسدادة قطنية ثم تعكس ويوضع أحد أذرعتها في محلول المصعد والذراع الآخر في محلول المهبط .\n"
                    ,R.drawable.photo7_8,7);
            myDbHelper.addItem("أنابيب الطيف",
                    "أنبوب تفريغ الغاز عبارة عن ترتيب من الأقطاب الكهربائية موجودة داخل أنبوب زجاجي يحتوي على غاز، بحيث أنه عند تطبيق حد أدنى معين من الجهد الكهربائي فإن ذلك يؤدي إلى حدوث تفريغ كهربائي في الغاز ينتج عنه ضوء مميز حسب نوع الغاز المستخدم. \n"
                    ,R.drawable.photo7_9,7);
            myDbHelper.addItem("جهاز كب",
                    "يصنع من الزجاج، يتكون من انتفاخين مرتبيْن فوق بعضهما البعض، يتخللهما أنبوب زجاجي، يوجد في أعلاه فتحة، وفي أسفله انتفاخ يضم فتحة لها سدادة، يخرج منها أنبوب زجاجي صغير وذلك حتى تخرج الغازات منه، وعادة ما يستخدم في تجهيز بعض الغازات مثل الهيدروجين."
                    ,R.drawable.photo7_10,7);

            myDbHelper.addItem("جهاز الطرد المركزي",
                    "يستخدم هذا الجهاز لفصل المواد عن بعضها ،معتمداً في ذلك على قوة الطرد المركزية الناتجة عن الحركة الدائرية التي يدور فيها.\n" +
                            "استخداماته:\n" +
                            "1-فصل مكونات الدم عن بعضها البعض.\n" +
                            "2-فصل الخلايا العالقة في البول ؛كالخلايا الطلائية وخلايا الدم. \n" +
                            "3-فصل الأملاح عن البول.\n" +
                            "4-فصل بعض المواد والأحياء.\n" +
                            "أنواعه:  يدوي – كهربائي."
                    ,R.drawable.photo8_1,8);
            myDbHelper.addItem("الشريحة المجهرية",
                    "هي قطعة رقيقة من الزجاج المسطح يتراوح طولها وعرضها بـين 75 و 25 ملم وسمكها 1 ملم. \n" +
                            "تصنع الشريحة المجهرية من الزجاج ،تستخدم في دراسة تركيب الأجزاء الصغيرة بدقة مثل التركيب الدقيق للأنسجة والخلايا \n" +
                            "وفحص الأشياء والعينات والتعرف عليها .\n" +
                            "\n"
                    ,R.drawable.photo8_2,8);
            myDbHelper.addItem("طبق بتري",
                    "علبة بتري أو طبق بتري بالإنجليزية Petri dish) ) : هي وعاء مسطح دائري الشكل وشفاف مع غطاء، يصنع من الزجاج أو من اللدائن، ويستعمل من قبل علماء الأحياء لزراعة الخلايا , ويستعمله علماء الكيمياء لحفظ بعض المركبات .\n" +
                            "علبة بتري المصنوعة من الزجاج يمكن إعادة استخدامها بعد تعقيمها أما المصنوعة من اللدائن فيجب رميها بعد الاستعمال.\n"
                    ,R.drawable.photo8_3,8);
            myDbHelper.addItem("المجهر الضوئي",
                    "\n" +
                            "يتكون المجهر الضوئي من حامل وجسم ويتكون الحامل من قاعدة تعرف بالقدم وترتكز عليها جميع \n" +
                            "أجزاء المجهر، ومن ذراع يصل القدم بالجسم. أما الجسم فيتكون من أنبوب مجوف تعلوه العدستان \n" +
                            "العينيتان وينتهي من الأسفل بقرص معدني متحرك يسمى القطعة الأنفية وتثبت بها 4 عدسات وهي \n" +
                            "قوة ( (x4,x10,40x,100x يتصل بذراع المجهر المسرح يتخلله فتحة دائرية تسمح بمرور الضوء \n" +
                            "من المصدر الضوئي إلى العينة المثبتة في الشريحة الزجاجية ,\n" +
                            "يحرك المسرح إلى الإمام والخلف ويمين ويسار بواسطة الضابط \n" +
                            "الجانبي ، كما يتم تحريك المسرح إلى الأعلى أو إلى الأسفل \n" +
                            "بالضابط الدقيق .\n" +
                            "يوجد تحت المسرح مكثف تحت مسرحي فيعمل على تركيز الضوء\n" +
                            " الصادر من المصدر الضوئي ويتصل به ما يسمي بالحاجب القزحي \n" +
                            "وظيفته التحكم في كمية الضوء المار خلال المجهر.\n" +
                            "لهذا المجهر عدسة أو عدستان عينيتان وعدسات شيئية مختلفة العدد، وهو يختلف عن المجهر المركب في :\n" +
                            "1- المنضدة: وهي مستقلة في المجهر المركب \n" +
                            "2- مصدر الضوء: يتوافر مصدر ضوئي واحد في المجهر المركب تحت المنضدة، بينما في التشريحي يستخدم مصدران أحدهما تحت الجسم المراد فحصه ،ويكون الآخر محمولاً تحت الرأس  \n" +
                            "ويستعمل هذا المجهر لفحص الحيوانات والنباتات الصغيرة وأجزائها،\n" +
                            " والتي لا نستطيع مشاهدتها بوضوح بالعين المجردة ،ويتراوح مدى تكبيره من 6 ـ 50 مرة ، وقد تصل في بعض أنواعه \n" +
                            "الحديثة إلى 80 مرة .\n"
                    ,R.drawable.photo8_4,8);
            myDbHelper.addItem("المجهر التشرٌيحًي",
                    ""
                    ,R.drawable.photo8_5,8);

            myDbHelper.addItem("الماصة",
                    "هي عبارة عن أنبوب زجاجي به انتفاخ في الوسط. بها علامة توضح الحد الذي تملأ به ليعطي الحجم المطلوب. تملأ بوساطة مطاطية معينة تسمى مالئة الماصة\n" +
                            "وعلى مالئة الماصة ثلاث حروف، (A) وتستخدم لتفريغ الهواء داخل الكرة، (S) لعملية سحب المحلول إلى داخل الماصة وحرف (E) لتفريغ المحلول خارج الماصة.\n" +
                            "وظيفتها :\n" +
                            "تستخدم لنقل حجم معين من المحلول من الاناء الذي يحفظ فيه المحلول إلى إناء التفاعل. "
                    ,R.drawable.photo9_1,9);
            myDbHelper.addItem("الدورق القياسي",
                    "دورق زجاجي شبه كروي مسطح من أسفله ذو عنق طويل يستخدم في المعامل الكيميائية والكيمياء التحليلية لتحضير تراكيز المحاليل. \n" +
                            "ذو أحجام مختلفة، ذو عنق محفور عليـه \n" +
                            "علامة (__ ) على هيئة خط دائري يبين \n" +
                            "الحد الذي يجب أن يصل إليه سطح السائل.\n"
                    ,R.drawable.photo9_2,9);
            myDbHelper.addItem("السحاحة",
                    " أنبوبة زجاجية مدرجة، ذات فتحتين احداهما لملء السحاحة بالمحلول  ويوجد بطرفها الأسفل صنبور زجاجي بمكبس. معدة لتؤخذ منها أحجام مختلفة بالإزاحة التنقيطية ومدرجة إلى سنتمترات مكعبة وكل سنتمتر مكعب مدرج إلى عشر 10/1سنتمتر مكعب.\n" +
                            " وظيفتها :تستعمل لإضافة أحجام دقيقة من السوائل أثناء المعايرة.\n"
                    ,R.drawable.photo9_3,9);
            myDbHelper.addItem("الدورق",
                    "\n" +
                            "ينقل إليه المحلول من الماصة ويستخدم في المعايرة(الدورق المخروطي) يسهل تحريكه، ويصنع من الزجاج أو البلاستيك. \n" +
                            "يستخدم في تحضير وحفظ وقياس المواد الكيميائية والمحاليل، وله عدة أشكال.\n" +
                            "ومن انواعه :\n" +
                            "1) دورق مخروطي.\n" +
                            "2)دورق كروي القاعدة.\n" +
                            "3)دورق كروي مستوي القاعدة.\n"
                    ,R.drawable.photo9_4,9);
            myDbHelper.addItem("المخبار المدرج",
                    "تستخدم لقياس حجوم السوائل بدقة جيدة نسبياً من أجل التطبيقات الكيميائية المختلفة، حيث أنها تعد أكثر دقة من الدوارق المختلفة، لكنها ليست بدقة الماصة، ولها أحجام مختلفة.\n"
                    ,R.drawable.photo9_5,9);
            myDbHelper.addItem("كأس زجاجًي",
                    "هو وعاء يصنع غالباً من الزجاج ويستخدم لتحريك ،خلط ،مزج وحفظ السوائل في المختبرات الكيميائية. \n" +
                            "وهو يصنع بأحجام مختلفة تبدأ من 10مل إلى 1000مل، وفي معظم الأحيان تكون مدرجة.\n"
                    ,R.drawable.photo9_6,9);
            myDbHelper.addItem("المعوجة الزجاجٌية",
                    "عبارة عن معدة أو أداة زجاجية تستخدم في التقطير أو في التقطير الجاف للمواد، وهي تتكون من وعاء كروي متصل بعنق طويل متدني لأسفل. \n" +
                            "تقوم العنق بدور المكثف مما يسمح للأبخرة المتصاعدة بأن تتكثف وتتدفق على طول العنق لكي تدخل في \n" +
                            "وعاء تجميعي  وضع بالأسفل.\n"
                    ,R.drawable.photo9_7,9);
            myDbHelper.addItem("زجاجة ساعة",
                    "هي قطعة دائرية، مقعرة قليلا تستخدم عند الكيميائيين كسطح لتبخير السوائل ولوضع المواد الصلبة فيها لوزن هذه العناصر وتستخدم أيضاً كغلاف للأكواب في المختبرات، و تدعى زجاجة الساعة بهذا الاسم لأن شكلها\n" +
                            "مطابق لشكل الزجاج الأمامي للساعات القديمة.\n"
                    ,R.drawable.photo9_8,9);
            myDbHelper.addItem("أنبوب اختبار",
                    "هي أداة مخبرية زجاجية ذات فتحة من الأعلى يتم إستخدامها لصب أو نقل أو خلط المحاليل والمواد الكيميائية والسوائل.. "
                    ,R.drawable.photo9_9,9);
            myDbHelper.addItem("الأقماع الزجاجٌية",
                    "أ- الأقماع العادية أو المألوفة (Ordinary Funnels): \n" +
                            "وهي تلك المستخدمة في عمليات ترشيح الجانبية ونقل السوائل \n" +
                            "من وعاء لآخر.\n" +
                            "ب-أقماع الفصلSeparator  Funnels) : \n)" +
                            "وهذه تكون كروية الشكل أو أسطوانية الشكل \n" +
                            "وتستخدم في عمليات الاستخلاص  بالمذيبات \n" +
                            "و عند إضافة سائل أو محلول بالتدريج\n" +
                            "إلى خليط التفاعل.\n" +
                            "\n" +
                            "\n"
                    ,R.drawable.photo9_10,9);

            myDbHelper.addItem("ثاقب الفلين",
                    "ثاقب الفلين هو عبارة عن أنابيب معدنية ذات أقطار مختلفة، تستخدم في تحضير السدادات للدوارق \n" +
                            "     التي تستخدم خلال تحضير الدروس العلمية.\n"
                    ,R.drawable.photo10_1,10);
            myDbHelper.addItem(" لهب بنسن",
                    "هو عبارةٌ عن موقدٍ صغيرٍ يُستخدم لتسخينِ المحاليل، ويتكون من جزأين هما قاعدةٌ مملوءةٌ بالغاز يخرج منها أنبوبٌ طويلٌ ذو حامل لتثبيت إناء التفاعل فوقه ، فيه ثقب هوائي للتعجيل تضبط بواسطته حرارة اللهب.\n"
                    ,R.drawable.photo10_2,10);
            myDbHelper.addItem("ورق الترشيح",
                    "عبارة عن ورق نصف نفوذ يستخدم لفصل المواد الصلبة الدقيقة الموجودة في الطور السائل من خلال عملية الترشيح. \n"
                    ,R.drawable.photo10_3,10);
            myDbHelper.addItem("سباتيولا_ ملعقة الاحتراق",
                    "أداة معدنية (وأحياناً بلاستيكية) تستخدم لنقل المواد الكيميائية الصلبة من إناء التفاعل بعد الإنتهاء منه ، أو لنقل المواد الأولية إلى وعاء الوزن، والغرض من استخدامها تفادي لمس المواد باليد إذ لا يخلو هذا في كثير من الأحيان من أخطار بالغة.\n"
                    ,R.drawable.photo10_4,10);
            myDbHelper.addItem("قارورة بلاستيكية",
                    "أداة بلاستيكية تملأ بمواد الغسيل مثل الماء المقطر الذي يمكن ضخه منھا بالضغط على الأنبوبة باليد وأحيانا أخرى بمذيبات عضوية مثل الأسيتون لغرض إزالة أي آثار لمواد كيميائية متبقية في إناء التفاعل. \n"
                    ,R.drawable.photo10_5,10);
            myDbHelper.addItem("ماسك",
                    "أداة تستخدم لحمل أو نقل الأدوات الساخنة ، ويوجد منها أنواع عدة فمثلا هناك ما يستخدم لنقل الأدوات الساخنة جدا كالبوتقة وهذه مجهزة بعوازل حرارية تمنع وصول أثر الحرارة لليد ، وأخرى صغيرة الحجم تستخدم لحمل أنابيب الاختبار.\n"
                    ,R.drawable.photo10_6,10);
            myDbHelper.addItem("البوتقة",
                    "تستعمل لحمل كميات صغيرة من مواد صلبة يراد تسخينها بشدة إما في الفرن أو فوق موقد بنسن ، وهي تصنع من البورسلان أو السيليكا أو النيكل أو الفولاذ.\n"
                    ,R.drawable.photo10_7,10);


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
