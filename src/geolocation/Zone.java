public enum Zone {
    NORTH_CENTRAL("Benue FCT Kogi Kwara Nasarawa Niger Plateau"),
    NORTH_EAST("Adamawa Bauchi Borno Gombe Taraba Yobe"),
    NORTH_WEST("Kaduna Katsina Kano Kebbi Sokoto Jigawa Zamfara"),
    SOUTH_EAST("Abia Anambra Ebonyi Enugu Imo"),
    SOUTH_SOUTH("Akwa-Ibom Bayelsa Cross-River Delta Edo Rivers"),
    SOUTH_WEST("Ekiti Lagos Osun Ondo Ogun Oyo");

    private final String states;

    Zone(String states) {
        this.states = states.toLowerCase();
    }

    public static Zone findZone(String input) {
        if (input == null || input.isBlank()) return null;

        String state = input.trim().toLowerCase();
        for (Zone zone : values()) {
            if (zone.states.contains(state)) return zone;
        }
        return null;
    }
}