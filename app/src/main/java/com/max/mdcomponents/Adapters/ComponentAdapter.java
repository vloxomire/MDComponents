package com.max.mdcomponents.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.max.mdcomponents.R;
import com.max.mdcomponents.Utils.Component;
import com.max.mdcomponents.Utils.OnClickListener;

import java.util.List;

import butterknife.BindView;

public class ComponentAdapter extends RecyclerView.Adapter<ComponentAdapter.ViewHolder>
{

    private List<Component> mComponents;
    private OnClickListener mListener;

    public ComponentAdapter(List<Component> mComponents, OnClickListener mListener) {
        this.mComponents = mComponents;
        this.mListener = mListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_component, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mComponents.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.imgPhoto)
        AppCompatImageView imPhoto;
        @BindView(R.id.tvName)
        TextView tvName;

        View view;
        public ViewHolder(View itemView) {
            super(itemView);
        }

        void setClickListener(OnClickListener listener, Component component)
        {
            view.setOnClickListener(view1 -> listener.onClick(component));
        }
    }
}
