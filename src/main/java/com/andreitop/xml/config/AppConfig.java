package com.andreitop.xml.config;

import com.andreitop.xml.mount.Mount;
import com.andreitop.xml.mount.Tiger;
import com.andreitop.xml.mount.Wolf;
import com.andreitop.xml.unit.Human;
import com.andreitop.xml.unit.Orc;
import com.andreitop.xml.unit.Troll;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.text.SimpleDateFormat;
import java.util.*;

import static com.andreitop.xml.unit.Troll.DEFAULT_MOUNT;
import static java.util.concurrent.ThreadLocalRandom.*;

@Configuration
@ComponentScan(basePackages = "com.andreitop.xml")
@PropertySource("classpath:config/heroes.properties")
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
        return new Orc (newWolf(), "furryAxe", 9);
    }

    @Bean("zulJin")
    public Troll newTroll() {
        return new Troll();
    }

    @Bean("colorCode")
    public int trollColorCode() {
        return current().nextInt(1,10);
    }

    @Bean("listOfMounts")
    public List<Mount> trollMountList() {
        List<Mount> mountList = new ArrayList<>();
        mountList.add(DEFAULT_MOUNT);
        mountList.add(null);
        mountList.add(newTiger());
        return mountList;
    }

    @Bean("setOfMounts")
    public Set<Mount> trollMountSet() {
        Set<Mount> mountSet = new LinkedHashSet<>();
        mountSet.add(newTiger());
        mountSet.add(newWolf());
        return mountSet;
    }

    @Bean("mapOfMounts")
    public Map<String, Mount> trollMountMap() {
        Map<String, Mount> mountMap = new HashMap<>();
        mountMap.put("m1", newWolf());
        mountMap.put("m2", newTiger());
        return mountMap;
    }


}
