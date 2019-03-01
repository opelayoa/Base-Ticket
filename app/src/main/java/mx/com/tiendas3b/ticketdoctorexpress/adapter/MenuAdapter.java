package mx.com.tiendas3b.ticketdoctorexpress.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import mx.com.tiendas3b.ticketdoctorexpress.R;
import mx.com.tiendas3b.ticketdoctorexpress.model.Menu;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {


    List<Menu> menus;

    public MenuAdapter(List<Menu> menus) {
        this.menus = menus;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_grid_element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Menu menu = menus.get(position);
        holder.description.setText(menu.getDescription());
        holder.button.setText(menu.getIcon());
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView description;
        public Button button;

        public ViewHolder(@NonNull View view) {
            super(view);
            description = view.findViewById(R.id.description);
            button = view.findViewById(R.id.button);
        }
    }
}
