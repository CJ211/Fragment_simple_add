package com.example.jay.fragment_simple_add;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class first extends Fragment {

    EditText mMessage;
    Button msubmitbtn;
    TextView mSentmsg;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        mMessage = (EditText) view.findViewById(R.id.editext);
        msubmitbtn = (Button) view.findViewById(R.id.button1);
        mSentmsg = (TextView) view.findViewById(R.id.fragtxt);

        msubmitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    String mAdd = mMessage.getText().toString();
                    mSentmsg.setText(mAdd);
            }
        });


        return view;//return view
    }
}
