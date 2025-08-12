package com.example.salaruyuni.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.salaruyuni.models.User;
import java.util.List;

public class UserAdapter extends ArrayAdapter<User> {

    private Context context;
    private List<User> listUsers;

    public UserAdapter(@NonNull Context context, List<User> listUsers) {
        super(context, 0, listUsers);
        this.context = context;
        this.listUsers = listUsers;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
