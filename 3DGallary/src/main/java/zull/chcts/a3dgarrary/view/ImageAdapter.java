package zull.chcts.a3dgarrary.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;

import java.util.ArrayList;

import zull.chcts.a3dgarrary.MainActivity;
import zull.chcts.a3dgarrary.R;

/**
 * Created by Zull on 2016/1/2.
 */
public class ImageAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Integer> list;
    private LayoutInflater inflater;


    public ImageAdapter(Context context, ArrayList<Integer> list) {
        this.context = context;
        this.list = list;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.pictures, null);
        }
        ImageView iv = (ImageView)convertView;
        Bitmap bitmap = ImageUtil.getImageBitmap(
                ((MainActivity) context).getResources(),
                list.get(position));
        bitmap = Bitmap.createScaledBitmap(bitmap, 600, 1000, true);
        iv.setImageBitmap(bitmap);
        LayoutParams params = new LayoutParams(240, 320);
        iv.setLayoutParams(params);
        return iv;
    }
}

