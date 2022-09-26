package net.htlgkr.pos2.KeiserPatrice2;

import java.util.ArrayList;
import java.util.List;

public class HalloJavaMitForEach {

    public void forEach() {
        List<String> strings = new ArrayList<>();
        strings.add("Hallo");
        strings.add("Welt");
        System.out.println("Normal:");
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("\nlLamda:");
        strings.forEach((n) -> System.out.println(n));
    }

}
