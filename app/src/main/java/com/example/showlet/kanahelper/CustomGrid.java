package com.example.showlet.kanahelper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.common.data.DataHolder;

public class CustomGrid extends BaseAdapter {
    private Context mContext;
    private final String[] textValues;
    private final int[] Imageids;
    private boolean fuckoff = false;

    public CustomGrid(Context c, String[] txtVals, int[] imgIds) {
        mContext = c;
        this.Imageids = imgIds;
        this.textValues = txtVals;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return textValues.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    static class DataHolder {
        ImageView img;
        TextView txt;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        DataHolder holder = null;
        View grid = null;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (holder == null) {
            grid = inflater.inflate(R.layout.grid_single, null);
            holder = new DataHolder();

            holder.txt = (TextView) grid.findViewById(R.id.grid_text);
            holder.img = (ImageView) grid.findViewById(R.id.grid_image);

        } else {
            holder = (DataHolder) grid.getTag();
        }

        if (position < Imageids.length && holder.txt != null && holder.img != null) {
            holder.txt.setText(textValues[position]);
            holder.img.setImageResource(Imageids[position]);
        }
        return grid;
    }

}
