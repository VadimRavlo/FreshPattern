package ua.com.wadyan.viewholder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by << Wad + >>.
 */

public class DataAdapter extends BaseAdapter {
    private Context context;
    private String[] objects;

    public DataAdapter(Context context, String[] objects) {
        this.context = context;
        this.objects = objects;
    }

    static class ViewHolder{
        TextView tvItem;
    }

    @Override
    public int getCount() {
        return objects.length;
    }

    @Override
    public String getItem(int position) {
        return objects[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvItem = (TextView) convertView.findViewById(R.id.tv_item);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvItem.setText(getItem(position));

        return convertView;
    }
}
