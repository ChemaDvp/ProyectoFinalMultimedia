package com.vedruna.proyectofinalmultimedia.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.vedruna.proyectofinalmultimedia.R;
import com.vedruna.proyectofinalmultimedia.model.Player;

import java.util.List;

public class PlayerAdapter extends BaseAdapter {
    private List<Player> playerList;
    private Context context;

    public PlayerAdapter(Context context, List<Player> playerList) {
        this.context = context;
        this.playerList = playerList;
    }

    @Override
    public int getCount() {
        return playerList.size();
    }

    @Override
    public Object getItem(int position) {
        return playerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return playerList.get(position).getIdPlayer();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.player_list, parent, false);

            viewHolder = new ViewHolder();
            viewHolder.idLabel = convertView.findViewById(R.id.idLabel);
            viewHolder.idText = convertView.findViewById(R.id.idText);
            viewHolder.nameLabel = convertView.findViewById(R.id.nameLabel);
            viewHolder.nameText = convertView.findViewById(R.id.nameText);
            viewHolder.positionLabel = convertView.findViewById(R.id.positionLabel);
            viewHolder.positionText = convertView.findViewById(R.id.positionText);
            viewHolder.equipoLabel = convertView.findViewById(R.id.equipoLabel);
            viewHolder.equipoText = convertView.findViewById(R.id.equipoText);
            viewHolder.imageView = convertView.findViewById(R.id.imageView);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // Obtén el producto actual
        Player player = (Player) getItem(position);

        // Asignar los valores del producto a las vistas
        viewHolder.idLabel.setText("Id: ");
        viewHolder.idText.setText(String.valueOf(player.getIdPlayer()));
        viewHolder.nameLabel.setText("Nombre: ");
        viewHolder.nameText.setText(player.getName());
        viewHolder.positionLabel.setText("Posicion: ");
        viewHolder.positionText.setText(String.valueOf(player.getPosition()));
        viewHolder.equipoLabel.setText("Equipo: ");
        viewHolder.equipoText.setText(String.valueOf(player.getClubName()));
        Picasso.get().load(player.getImageURL()).into(viewHolder.imageView);

        return convertView;
    }

    static class ViewHolder {
        TextView idLabel;
        TextView idText;
        TextView nameLabel;
        TextView nameText;
        TextView positionLabel;
        TextView positionText;
        TextView equipoLabel;
        TextView equipoText;
        ImageView imageView;
    }
}
