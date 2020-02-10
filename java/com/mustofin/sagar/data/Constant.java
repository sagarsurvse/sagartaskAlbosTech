package com.mustofin.sagar.data;

import com.mustofin.sagar.R;
import com.mustofin.sagar.fragment.Fragment1;
import com.mustofin.sagar.fragment.Fragment2;
import com.mustofin.sagar.navigationdrawer.NavMenuModel;

import java.util.ArrayList;

/**
 *  Created by sagar on 9/2/2020.
 */

public class Constant {

    public static ArrayList<NavMenuModel> getMenuNavigasi(){
        ArrayList<NavMenuModel> menu = new ArrayList<>();



        menu.add(new NavMenuModel("music", R.drawable.ic_teman,
                new ArrayList<NavMenuModel.SubMenuModel>() {{
                    add(new NavMenuModel.SubMenuModel("music 1", Fragment1.newInstance("unch")));
                    add(new NavMenuModel.SubMenuModel("music 2", Fragment2.newInstance("utututu")));
        }}));




        return menu;
    }
}
