package com.example.cardviewswiper;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class Adapter extends PagerAdapter {
    List<Model> models;
    private Context context;
    private LayoutInflater layoutInflater;

    public Adapter(List<Model> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.item,container,false);
        ImageView imageView;
        TextView t1,t2;
        imageView=view.findViewById(R.id.imag1);
        t1=view.findViewById(R.id.t1);
        t2=view.findViewById(R.id.t2);

        Glide.with(context)
                .asBitmap()
                .load(models.get(position).getImage())
                .into(imageView);

        t1.setText(models.get(position).getT1());
        t2.setText(models.get(position).getT2());
        container.addView(view,0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
