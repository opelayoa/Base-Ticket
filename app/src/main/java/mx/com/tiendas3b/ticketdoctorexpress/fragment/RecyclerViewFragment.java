package mx.com.tiendas3b.ticketdoctorexpress.fragment;

import android.graphics.Canvas;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import mx.com.tiendas3b.ticketdoctorexpress.R;
import mx.com.tiendas3b.ticketdoctorexpress.adapter.MenuAdapter;
import mx.com.tiendas3b.ticketdoctorexpress.model.Menu;
import mx.com.tiendas3b.ticketdoctorexpress.utils.Tools;
import mx.com.tiendas3b.ticketdoctorexpress.widget.SpacingItemDecoration;

public class RecyclerViewFragment extends Fragment {

    public RecyclerViewFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recycler_view, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);

        MenuAdapter menuAdapter = new MenuAdapter(prepareMenuData());
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getContext().getApplicationContext(), 3);
        recyclerView.addItemDecoration(new SpacingItemDecoration(3, Tools.dpToPx(getContext(), 8), true));
        recyclerView.setAdapter(menuAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(layoutManager);

        return view;
    }



    private List<Menu> prepareMenuData() {
        List<Menu> menus = new ArrayList();

        Menu menu = new Menu();
        menu.setDescription("01 Equipo");
        menu.setIcon("\uf108");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("02 Software");
        menu.setIcon("\uf2d0");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia de Sistemas en el área de contabilidad.");
        menu.setIcon("\uf071");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf1c9");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("01 Equipo");
        menu.setIcon("\uf108");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("02 Software");
        menu.setIcon("\uf2d0");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf071");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf1c9");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("01 Equipo");
        menu.setIcon("\uf108");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("02 Software");
        menu.setIcon("\uf2d0");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf071");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf1c9");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("01 Equipo");
        menu.setIcon("\uf108");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("02 Software");
        menu.setIcon("\uf2d0");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf071");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf1c9");
        menus.add(menu);


        menu = new Menu();
        menu.setDescription("01 Equipo");
        menu.setIcon("\uf108");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("02 Software");
        menu.setIcon("\uf2d0");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf071");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf1c9");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("01 Equipo");
        menu.setIcon("\uf108");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("02 Software");
        menu.setIcon("\uf2d0");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf071");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf1c9");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("01 Equipo");
        menu.setIcon("\uf108");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("02 Software");
        menu.setIcon("\uf2d0");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf071");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf1c9");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("01 Equipo");
        menu.setIcon("\uf108");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("02 Software");
        menu.setIcon("\uf2d0");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf071");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf1c9");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("01 Equipo");
        menu.setIcon("\uf108");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("02 Software");
        menu.setIcon("\uf2d0");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf071");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf1c9");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("01 Equipo");
        menu.setIcon("\uf108");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("02 Software");
        menu.setIcon("\uf2d0");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf071");
        menus.add(menu);

        menu = new Menu();
        menu.setDescription("03 Incidencia");
        menu.setIcon("\uf1c9");
        menus.add(menu);

        return menus;
    }

}
