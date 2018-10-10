package nhat.com.bt_tuan05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter{

    private Context context;
    private int layout;
    private List<FragmentRed> fragmentBlueList;

    public Adapter(Context context, int layout, List<FragmentRed> fragmentBlueList1) {
        this.context = context;
        this.layout = layout;
        this.fragmentBlueList = fragmentBlueList1;
    }


    @Override
    public int getCount() {
        return fragmentBlueList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView txt;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view==null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txt = (TextView) view.findViewById(R.id.textview);
            view.setTag(holder);
            }else {
            holder= (ViewHolder) view.getTag();
        }
        FragmentRed fragmentRed = fragmentBlueList.get(i);
        holder.txt.setText(fragmentRed.getMessage());
        return null;
    }
}


