import java.util.*;

class ResistorColorDuo {
    private final String[] colorDefinitions = new String[] {
          "black", "brown", "red", "orange", "yellow",
        "green", "blue", "violet", "grey", "white"
    };
    
    
    int value(String[] colors) {
        StringBuilder sb = new StringBuilder();
        List<String> list = Arrays.asList(colorDefinitions);
        
        for (int i = 0; i < colors.length && i < 2; i++){
            sb.append(list.indexOf(colors[i]));
        }

        return Integer.parseInt(sb.toString());
    }
}
