package fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import e.wolfsoft1.alerts_cryptostar.R;


public class FragmentOne extends android.support.v4.app.Fragment {


    private View view;
    Button next;






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment, container, false);


        return view;
    }


}
