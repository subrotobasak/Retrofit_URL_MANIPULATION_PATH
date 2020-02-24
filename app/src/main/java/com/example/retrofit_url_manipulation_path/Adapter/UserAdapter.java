package com.example.retrofit_url_manipulation_path.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.retrofit_url_manipulation_path.Model.Model;
import com.example.retrofit_url_manipulation_path.R;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private List<Model> models;

    public UserAdapter(List<Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_user_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {

        Model model = models.get(position);
        holder.postIdTv.setText(String.valueOf(model.getPostId()));
        holder.IdTv.setText(String.valueOf(model.getId()));
        holder.nameTv.setText(model.getName());
        holder.emailTv.setText(model.getEmail());
        holder.bodyTv.setText(model.getBody());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView postIdTv, IdTv, nameTv, emailTv, bodyTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            postIdTv = itemView.findViewById(R.id.postIdTv);
            IdTv = itemView.findViewById(R.id.IdTv);
            nameTv = itemView.findViewById(R.id.nameIdTv);
            emailTv = itemView.findViewById(R.id.emailIdTv);
            bodyTv = itemView.findViewById(R.id.bodyIdTv);

        }
    }
}

