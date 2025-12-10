class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        char[] chars = identifier.toCharArray();
        String finalString;
        
        for (int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                chars[i] = '_';
            }
        }
        
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == '-' && !Character.isWhitespace(chars[i+1])){
                sb.append(Character.toUpperCase(chars[i+1]));
                i++;
            } else {
                sb.append(chars[i]);
            }
        }
        chars = sb.toString().toCharArray();
        
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == '4'){
                chars[i] = 'a';
            }
            if (chars[i] == '3'){
                chars[i] = 'e';
            }
            if (chars[i] == '0'){
                chars[i] = 'o';
            }
            if (chars[i] == '1'){
                chars[i] = 'l';
            }
            if (chars[i] == '7'){
                chars[i] = 't';
            }
        }

        sb = new StringBuilder();
        for (char ch : chars){
            if(Character.isLetter(ch) || ch == '_'){
                sb.append(ch);
            }
        }
        
        chars = sb.toString().toCharArray();
        
        finalString = new String(chars);
        return finalString;
    }
}
