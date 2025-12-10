class Acronym {
    private String phrase;
    
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        StringBuilder sb = new StringBuilder();
        
        String temp = phrase.replaceAll("-"," ");
        temp = temp.replaceAll("_"," ");
        String[] strArray = temp.split("\\s+");
        for (int i = 0; i < strArray.length; i++){
            sb.append(Character.toUpperCase(strArray[i].charAt(0)));
        }
        return sb.toString();
    }

}
