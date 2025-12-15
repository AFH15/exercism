class ResistorColorTrio {
    private final String[] colors = new String[] {
      "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" 
    };

    int getIndexFromColors (String text){
        for (int i = 0; i < colors.length; i++){
            if (text.equals(colors[i])){
                return i;
            }
        }
        throw new IllegalArgumentException("Color not found");
    }

    String exponent (int power){
        StringBuilder zero = new StringBuilder();
        for (int i = 0; i < power; i++){
            zero.append("0");
        }
        return zero.toString();
    }
    String result(String number){
        long temp = Long.parseLong(number);
        if (temp < 1000){
            return temp + " ohms";
        } else if (temp >= 1000 && temp < 1000000){
            temp /= 1000;
            return temp + " kiloohms";
        } else if (temp >= 1000000 && temp < 1000000000){
            temp /= 1000000;
            return temp + " megaohms";
        } else {
            temp /= 1000000000;
            return temp + " gigaohms";
        }
    }
    
    String label(String[] colors){
        StringBuilder temp = new StringBuilder();
        temp.append(Integer.toString(getIndexFromColors(colors[0])));
        temp.append(Integer.toString(getIndexFromColors(colors[1])));
        if (getIndexFromColors(colors[2]) > 0){
            temp.append(exponent(getIndexFromColors(colors[2])));
        }
        
        return result(temp.toString());
    }
}
