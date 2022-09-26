package net.htlgkr.pos2.KeiserPatrice2;

import java.util.ArrayList;
import java.util.List;

public class HalloJavaMitForEach {

    private void forEach() {
        List<String> strings = new ArrayList<>();
        strings.add("Hallo");
        strings.add("Welt");

        for (String s:strings) {
            System.out.println(s);
        }
    }

}
