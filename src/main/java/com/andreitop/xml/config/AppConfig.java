package com.andreitop.xml.config;

import com.andreitop.xml.mount.Mount;
import com.andreitop.xml.mount.Tiger;
import com.andreitop.xml.mount.Wolf;
import com.andreitop.xml.unit.Human;
import com.andreitop.xml.unit.Orc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.andreitop.xml")
public class AppConfig {

    @Bean("shadowTiger")
    public Mount newTiger() {
        return new Tiger();
    }

    @Bean("frostWolf")
    public Mount newWolf() {
        return new Wolf();
    }

    @Bean("knight")
    public Human newHuman() {
        return new Human(newTiger(), "thunderFury","soulBlade");
    }

    @Bean("trall")
    public Orc newOrc() {
        Orc orc = new Orc (newWolf());
        orc.setWeapon("furryAxe");
        orc.setColorCode(9);
        return orc;
    }
}
