package cs262.calvin.edu.calvinintramurals;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyFragment extends Fragment {

    public static Fragment newInstance(MainActivity context, int pos,
                                       float scale)
    {
        Bundle b = new Bundle();
        b.putInt("pos", pos);
        b.putFloat("scale", scale);
        return Fragment.instantiate(context, MyFragment.class.getName(), b);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }

        LinearLayout l = (LinearLayout)
                inflater.inflate(R.layout.mf, container, false);

        int pos = this.getArguments().getInt("pos");
        TextView tv = (TextView) l.findViewById(R.id.text);
        ImageView iv = (ImageView) l.findViewById(R.id.content);

        if (pos == 0) {
            iv.setImageResource(R.drawable.cover3);
            tv.setText("Volleyball");}
        else if (pos == 1) {
            iv.setImageResource(R.drawable.cover4);
            tv.setText("Ping Pong");}
        else if (pos == 2) {
            iv.setImageResource(R.drawable.cover5);
            tv.setText("Football");}
        else if (pos == 3) {
            iv.setImageResource(R.drawable.cover1);
            tv.setText("Soccer");}
        else if (pos == 4) {
            iv.setImageResource(R.drawable.cover2);
        tv.setText("BasketBall");}

        MyLinearLayout root = (MyLinearLayout) l.findViewById(R.id.root);
        float scale = this.getArguments().getFloat("scale");
        root.setScaleBoth(scale);

        return l;
    }
}