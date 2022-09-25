public class Chiller {
    public Refrigerant cool(String typeOfRefrigerant) {
        switch (typeOfRefrigerant) {
            case "R134a":
                return new R134a();
            case "R1314z":
                return new R1314z();
            case "R410":
                return new R410a();
            default:
                return null;
        }
    }
}
