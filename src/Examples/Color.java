package Examples;

enum Color {
    BLUE(1),
    RED(2),
    GREEN(3),
    UNKNOWN(0);

    private int id;

    Color(int id) {
        this.id = id;
    }

    public static Color getColor(int id) {
        for (Color color : values()) {
            if (color.id == id) {
                return color;
            }
        }
        return UNKNOWN;
    }
}
