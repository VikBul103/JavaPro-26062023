package HW_5;

import HW_5.Ship.ShipBuilder;

public class Main {

    public static void main(String[] args) {

        ShipBuilder ship = Ship.builder(Ship.EngineType.DOUBLE_HEAVY);

        ship
                .torpedoes(Ship.TorpedoType.PLASMA)
                .gun(Ship.GunType.LANCE);

        Ship build = ship
                .shipClass(Ship.ShipType.Cruiser)
                .fraction(Ship.Fraction.ImperialNavy)
                .build();

        System.out.println(build);

    }
}
