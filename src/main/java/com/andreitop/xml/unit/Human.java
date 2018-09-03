package com.andreitop.xml.unit;

import com.andreitop.xml.mount.Mount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human implements Unit {

    private Mount mount;
    private String leftHandWeapon;
    private String rightHandWeapon;

    @Autowired
    @Qualifier("shadowTiger")
    public void setMount(Mount mount) {
        this.mount = mount;
    }

    public Human(Mount mount, String leftHandWeapon, String rightHandWeapon) {
        this.mount = mount;
        this.leftHandWeapon = leftHandWeapon;
        this.rightHandWeapon = rightHandWeapon;
    }

    @Override
    public void mountMove() {
        mount.move();
    }

    public String getLeftHandWeaponWeapon() {
        return leftHandWeapon;
    }

    public String getRightHandWeaponWeapon() {
        return rightHandWeapon;
    }

    public Mount getMount() {
        return mount;
    }
}




