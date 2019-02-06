package com.example.cardviewswiper;

import android.animation.ArgbEvaluator;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors=null;
    ArgbEvaluator argbEvaluator=new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        models=new ArrayList<>();
        models.add(new Model(R.drawable.brochure,
                "AMAZON ALEXA AI- Software Development Manager - Cambridge, MA","Alexa, the speech processing and personal assistant technology behind Amazon Echo, is seeking a Software Development Manager for our Machine Learning Data Platform within our state of the art Kendall Square/Cambridge, Massachusetts Development Center."));
        models.add(new Model(R.drawable.poster,
                "AMAZON ALEXA AI- Software Development Manager - Cambridge, MA","Alexa, the speech processing and personal assistant technology behind Amazon Echo, is seeking a Software Development Manager for our Machine Learning Data Platform within our state of the art Kendall Square/Cambridge, Massachusetts Development Center."));

        models.add(new Model(R.drawable.sticker,
                "AMAZON ALEXA AI- Software Development Manager - Cambridge, MA","Alexa, the speech processing and personal assistant technology behind Amazon Echo, is seeking a Software Development Manager for our Machine Learning Data Platform within our state of the art Kendall Square/Cambridge, Massachusetts Development Center."));

        models.add(new Model(R.drawable.namecard,
                "AMAZON ALEXA AI- Software Development Manager - Cambridge, MA","Alexa, the speech processing and personal assistant technology behind Amazon Echo, is seeking a Software Development Manager for our Machine Learning Data Platform within our state of the art Kendall Square/Cambridge, Massachusetts Development Center."));

        adapter=new Adapter(models,this);
        viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);


        Integer[] colors_temp={
        getResources().getColor(R.color.color1),
        getResources().getColor(R.color.color2),
        getResources().getColor(R.color.color3),
        getResources().getColor(R.color.color4)};

       colors=colors_temp;



       viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
    @Override
    public void onPageScrolled(int i, float v, int i1) {
        if(i<(adapter.getCount() -1) && i<(colors.length -1)){
            viewPager.setBackgroundColor((Integer) argbEvaluator.evaluate(v,colors[i],colors[i+1]));

        }else {
            viewPager.setBackgroundColor(colors[colors.length -1]);
        }
    }

    @Override
    public void onPageSelected(int i) {

    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
});
    }
}
