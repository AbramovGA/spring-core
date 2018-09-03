package com.andreitop.xml.unit;

import com.andreitop.xml.mount.Mount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Orc implements Unit {

    private Mount mount;
    private String weapon;
    private int colorCode;

    public Orc(Mount mount) {
        this.mount = mount;
    }

    @Autowired
    public Orc(@Qualifier("frostWolf") Mount mount, String weapon, int colorCode) {
        this.mount = mount;
        this.weapon = weapon;
        this.colorCode = colorCode;
    }

    @Override
    public void mountMove() {
        mount.move();
    }

    public Mount getMount() {
        return mount;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getColorCode() {
        return colorCode;
    }

    public void setMount(Mount mount) {
        this.mount = mount;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setColorCode(int colorCode) {
        this.colorCode = colorCode;
    }
}




