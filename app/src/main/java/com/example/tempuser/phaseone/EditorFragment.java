package com.example.tempuser.phaseone;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by tempuser on 3/2/16.
 */
public class EditorFragment extends Fragment {

    static final String label = "EDITOR_FRAGMENT";
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] mDataSet = { "mon", "tue", "wed", "thu", "fri", "sat", "sun"};


    public static EditorFragment getInstance(){
        return  new EditorFragment();
    }

    /**
     * some initialization should go here
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    /**
     * Fragment UI is created here
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.editor_layout, container, false);
        // let's get a handle on the RecyclerView
        mRecyclerView = (RecyclerView) v.findViewById(R.id.editor_recycler_view);
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        if(mRecyclerView != null){
            mLayoutManager = new LinearLayoutManager(getContext());
            mRecyclerView.setLayoutManager(mLayoutManager);
            mAdapter = new Adapter(mDataSet);
            mRecyclerView.setAdapter(mAdapter);
        }

    }

    static public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

        private String[] mData;

        public Adapter(String[] data){
            mData = data;
        }

        /**
         * ViewHolder helper class used to hold references to created views
         */
        public static class ViewHolder extends RecyclerView.ViewHolder{
            public TextView comment;
            public TextView instruction;
            public TextView label;

            public ViewHolder(View view){
                super(view);
                this.label = (TextView) view.findViewById(R.id.label_text);
                this.instruction = (TextView) view.findViewById(R.id.instruction_text);
                this.comment = (TextView) view.findViewById(R.id.comment_text);
            }
        }

        @Override
        public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType){
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.editor_line_layout, parent, false);

            ViewHolder viewHolder = new ViewHolder(v);
            return  viewHolder;
        }


        @Override
        public void onBindViewHolder(ViewHolder holder, int position){
            // label and comment textviews hold nothing for the time being. This is just a test
            //holder.label;
            holder.instruction.setText(mData[position]);
            //holder.comment;

        }

        @Override
        public int getItemCount(){
            return mData.length;
        }
    }



}
