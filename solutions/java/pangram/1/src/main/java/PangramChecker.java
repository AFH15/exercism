import java.util.*;

public class PangramChecker {

    public boolean isPangram(String input) {
        Set<Character> c = new HashSet<>();
        char temp;
        for (int i = 0; i < input.length(); i++){
            temp = input.charAt(i);
            if (!Character.isDigit(temp)){
                c.add(Character.toLowerCase(temp));
            }
        }
        c.remove(' ');
        c.remove('_');
        c.remove('\\');
        c.remove('"');
        c.remove('.');
        return c.size() == 26;
    }

}
