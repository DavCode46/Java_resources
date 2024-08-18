package dev.davcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Mappable> mappables = new ArrayList<>();

        mappables.add(new Building("City Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Stadium", UsageType.SPORTS));
        mappables.add(new Building("Theater", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Apartment", UsageType.RESIDENTIAL));

        mappables.add(new UtilityLine("Power Line", UtilityType.ELECTRICAL));
        mappables.add(new UtilityLine("Water Line", UtilityType.WATER));
        mappables.add(new UtilityLine("Gas Line", UtilityType.GAS));
        mappables.add(new UtilityLine("Fiber Optic Line", UtilityType.FIBER_OPTIC));

        for(var m : mappables) {
            Mappable.mapIt(m);
        }

    }
}
