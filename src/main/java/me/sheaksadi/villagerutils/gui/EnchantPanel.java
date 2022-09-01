package me.sheaksadi.villagerutils.gui;

import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.WPlainPanel;


public class EnchantPanel extends WPlainPanel {
    WButton button;

    public EnchantPanel() {

        button = new WButton();
        this.add(button, 0,0, 120, 18);
        this.setSize(120, 18);
       // this.validate(this.getHost());
    }
}
