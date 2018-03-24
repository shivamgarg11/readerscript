package com.example.shivam.readerscript;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by shivam on 24/03/18.
 */

public class adaptors extends BaseAdapter {

    ArrayList<products> arrayList;
    Context context;

    public adaptors(ArrayList<products> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public products getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null) {
            LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(R.layout.layout, parent, false);
        }

        products products=arrayList.get(position);



        final String EVENT_DATE_TIME = products.getDiscounttimer();
         final String DATE_FORMAT = "yyyy-MM-dd ";
         final LinearLayout linear_layout_1, linear_layout_2;
         final TextView tv_days, tv_hour, tv_minute, tv_second;
         final Handler handler = new Handler();
         Runnable runnable = null;
        linear_layout_1 = (LinearLayout) convertView.findViewById(R.id.linear_layout_1);
        linear_layout_2 = (LinearLayout) convertView.findViewById(R.id.linear_layout_2);
        tv_days = (TextView) convertView.findViewById(R.id.tv_days);
        tv_hour = (TextView) convertView.findViewById(R.id.tv_hour);
        tv_minute = (TextView) convertView.findViewById(R.id.tv_minute);
        tv_second = (TextView) convertView.findViewById(R.id.tv_second);
        final Runnable finalRunnable = runnable;
        runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    handler.postDelayed(this, 1000);
                    SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                    Date event_date = dateFormat.parse(EVENT_DATE_TIME);
                    Date current_date = new Date();
                    if (!current_date.after(event_date)) {
                        long diff = event_date.getTime() - current_date.getTime();
                        long Days = diff / (24 * 60 * 60 * 1000);
                        long Hours = diff / (60 * 60 * 1000) % 24;
                        long Minutes = diff / (60 * 1000) % 60;
                        long Seconds = diff / 1000 % 60;
                        //
                        tv_days.setText(String.format("%02d", Days));
                        tv_hour.setText(String.format("%02d", Hours));
                        tv_minute.setText(String.format("%02d", Minutes));
                        tv_second.setText(String.format("%02d", Seconds));
                    } else {
                        linear_layout_1.setVisibility(View.VISIBLE);
                        linear_layout_2.setVisibility(View.GONE);
                        handler.removeCallbacks(finalRunnable);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        handler.postDelayed(runnable, 0);

        TextView name=convertView.findViewById(R.id.name);
        TextView discount=convertView.findViewById(R.id.discount);
        TextView quantity=convertView.findViewById(R.id.quantity);

        ImageView imageView=convertView.findViewById(R.id.image);
        Picasso.get().load(products.getImageurl()).into(imageView);

        name.setText(products.getName());
        discount.setText(products.getDiscountpercentage());
        quantity.setText(products.getQuantity());




        return convertView;
        }
    }

