package com.sonacollegeotechnology.departmentadapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class DepartmentAdapter extends RecyclerView.Adapter<DepartmentAdapter.ViewHolder> {

    private List<ModelItem> modelItems;
    private Context context;
    public DepartmentAdapter(Context context, List<ModelItem> modelItems)
    {
        this.context = context;
        this.modelItems = modelItems;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_ind,viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final ModelItem modelItem = modelItems.get(i);

        viewHolder.deptName.setText(modelItem.getDeptname());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DepartmentInfo.class);
                intent.putExtra("deptname",modelItem.getDeptname());
                intent.putExtra("hodname",modelItem.getHodname());
                intent.putExtra("contactname",modelItem.getContactname());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }


    @Override
    public int getItemCount() {
        return modelItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView deptName;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            deptName = itemView.findViewById(R.id.deptName);
        }
    }
}
