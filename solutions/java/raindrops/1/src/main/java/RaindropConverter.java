class RaindropConverter {

    String convert(int number) {
        StringBuilder sb = new StringBuilder();
        boolean added = false;
        if (number % 3 == 0){
            sb.append("Pling");
            added = true;
        }
        if (number % 5 == 0){
            sb.append("Plang");
            added = true;
        }
        if (number % 7 == 0){
            sb.append("Plong");
            added = true;
        }

        if (added){
            return sb.toString();
        } else {
            return Integer.toString(number);
        }
    }
}
