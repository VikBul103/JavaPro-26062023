package HW_5;

public class Ship {

    private final GunType gun;
    private final TorpedoType torpedoes;
    private final ShipType shipClass;

    private static EngineType engine;
    private final Fraction fraction;

    private Ship(GunType gun, TorpedoType torpedoes, ShipType shipClass, EngineType engine, Fraction fraction) {
        this.gun = gun;
        this.torpedoes = torpedoes;
        this.shipClass = shipClass;
        this.engine = engine;
        this.fraction = fraction;
    }

    public static ShipBuilder builder(EngineType engine) {
        if (engine == null)
            throw new IllegalArgumentException("Engines required");
        return new ShipBuilder(engine);
    }


    public GunType getGun() {
        return gun;
    }

    public TorpedoType getTorpedoes() {
        return torpedoes;
    }

    public ShipType getShipClass() {
        return shipClass;
    }

    public EngineType getEngine() {
        return engine;
    }

    public Fraction getFraction() {
        return fraction;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "guns = " + gun +
                ", Torpedo = " + torpedoes +
                ", cheese = " + shipClass +
                ", engines = " + engine +
                ", fraction = " + fraction +
                '}';
    }

    public static class ShipBuilder {


        private GunType gun;
        private TorpedoType torpedoes;
        private ShipType shipClass;
        private EngineType engine;
        private Fraction fraction;


        public Ship build() {
            return new Ship(
                    this.gun,
                    this.torpedoes,
                    this.shipClass,
                    this.engine,
                    this.fraction);
        }


        private ShipBuilder(EngineType engine) {
            this.engine = engine;
        }

        public ShipBuilder gun(GunType gun) {
            this.gun = gun;
            return this;
        }

        public ShipBuilder torpedoes(TorpedoType torpedoes) {
            this.torpedoes = torpedoes;
            return this;
        }

        public ShipBuilder shipClass(ShipType shipClass) {
            this.shipClass = shipClass;
            return this;
        }

        public ShipBuilder engine(EngineType engine) {
            this.engine = engine;
            return this;
        }

        public ShipBuilder fraction(Fraction fraction) {
            this.fraction = fraction;
            return this;
        }
    }

    public enum GunType {
        MACRO, LANCE
    }

    public enum TorpedoType {
        PLASMA, MELTA, CYCLONIC
    }

    public enum ShipType {
        Frigate, Destroyer, LightCruiser, Cruiser
    }
    public enum EngineType {
        HEAVY, SMALL, DOUBLE_HEAVY, DOUBLE_SMALL
    }
    public enum Fraction {
        Chaos, ImperialNavy
    }
}
