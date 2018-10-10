package nhat.com.bt_tuan05;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentBlue  extends ListFragment {

    ArrayList<FragmentRed> arrayList;
    Adapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        arrayList = new ArrayList<>();
        AddString();
        adapter = new Adapter(getActivity(), R.layout.fragment_red,arrayList);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.fragment_list, container,false);
    }

    private void AddString(){
        arrayList.add(new FragmentRed("Minh Cuong",169));
        arrayList.add(new FragmentRed("Van Nhat",168));
        arrayList.add(new FragmentRed("Nhat Han",125));
        arrayList.add(new FragmentRed("Van Tu",159));
    }

}
