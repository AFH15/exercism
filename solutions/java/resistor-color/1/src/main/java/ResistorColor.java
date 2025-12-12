import java.util.*;

class ResistorColor {
    private int position;
    private int value;
    private String[] colors = new String[] {
        "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"
    };
    int colorCode(String color) {
        List<String> colorsList = Arrays.asList(colors);
        return colorsList.indexOf(color);
    }

    String[] colors() {
        return colors;
    }
}
