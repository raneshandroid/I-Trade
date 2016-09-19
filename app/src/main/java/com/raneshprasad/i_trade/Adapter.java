package com.raneshprasad.i_trade;

import android.widget.ArrayAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by anubhaprasad on 8/6/16.
 */
public class Adapter extends ArrayAdapter<String> {
    int[] imgs = {};
    String[] names = {};
    String desc[] = {};
    Context c;
    LayoutInflater inflater;
    public Adapter(Context context, String[] names, int[] imgs, String[] desc){
        super(context, R.layout.custom, names);
        this.c = context;
        this.names = names;
        this.desc = desc;
        this.imgs = imgs;
    }

    public class ViewHolder{
        TextView nameTV;
        TextView desTV;
        ImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if (convertView == null){
            inflater= (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.custom, null);
        }
        final ViewHolder holder = new ViewHolder();
        holder.nameTV = (TextView) convertView.findViewById(R.id.textView_nameTV);
        holder.desTV = (TextView) convertView.findViewById(R.id.textView_smallTV);
        holder.img = (ImageView) convertView.findViewById(R.id.imageView);
        holder.img.setImageResource(imgs[position]);
        holder.nameTV.setText(names[position]);
        holder.desTV.setText(desc[position]);
        return convertView;
    }
}
