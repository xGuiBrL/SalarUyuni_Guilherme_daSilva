package com.example.salaruyuni.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.salaruyuni.R;
import com.example.salaruyuni.models.Usuario;
import java.util.List;


public class UsuarioAdapterListView extends ArrayAdapter<Usuario> {

    private Context context;
    private List<Usuario> listaUsuario;

    public UsuarioAdapterListView(@NonNull Context context, List<Usuario> listaUsuario) {
        super(context, 0, listaUsuario);
        this.context = context;
        this.listaUsuario = listaUsuario;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false);
        }

        Usuario usuario = listaUsuario.get(position);

        TextView tvNombre = convertView.findViewById(R.id.tvNombre);

        tvNombre.setText(usuario.getNombre());

        return convertView;
    }
}
