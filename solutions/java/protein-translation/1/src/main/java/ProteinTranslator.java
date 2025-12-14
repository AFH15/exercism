import java.util.*;

class ProteinTranslator {
    //Example:AUG UUU UCU UAA AUG
    private final String[] stopCodons = new String[] {
        "UAA", "UAG", "UGA"
    };
    private final String[] methionine = new String[] {
        "AUG"  
    };
    private final String [] phenylalanine = new String[] {
        "UUU", "UUC"
    };
    private final String [] leucine = new String[] {
        "UUA", "UUG"
    };
    private final String [] serine = new String[] {
        "UCU", "UCC", "UCA", "UCG"
    };
    private final String [] tyrosine = new String[] {
        "UAU", "UAC"
    };
    private final String [] cysteine = new String[] {
        "UGU", "UGC"
    };
    private final String [] tryptophan = new String[] {
        "UGG"
    };

    private String[] split (String text){
        String[] split = text.split("(?<=\\G.{3})");
        return split;
    }

    private boolean isStopCodon (String text){
        for (int i = 0; i < stopCodons.length; i++){
            if (text.equals(stopCodons[i])){
                return true;
            }
        }
        return false;
    }

    private List<String> getList(String sequence){
        if (sequence.equals("")){
            return new ArrayList<String>();
        }
        String[] splitted = split(sequence);
        List<String> temp = new ArrayList<>();
        
        for (int i = 0; i < splitted.length; i++){
            if (isStopCodon(splitted[i])){
                return temp;
            } else {
                temp.add(splitted[i]);
            }
        }
        return temp;
    }

    private void checkCodon(String str, List<String> toWrite){
        for (int i = 0; i < methionine.length; i++){
            if (str.equals(methionine[i])){
                toWrite.add("Methionine");
                return;
            }
        }
        for (int i = 0; i < phenylalanine.length; i++){
            if (str.equals(phenylalanine[i])){
                toWrite.add("Phenylalanine");
                return;
            }
        }
        for (int i = 0; i < leucine.length; i++){
            if (str.equals(leucine[i])){
                toWrite.add("Leucine");
                return;
            }
        }
        for (int i = 0; i < serine.length; i++){
            if (str.equals(serine[i])){
                toWrite.add("Serine");
                return;
            }
        }
        for (int i = 0; i < tyrosine.length; i++){
            if (str.equals(tyrosine[i])){
                toWrite.add("Tyrosine");
                return;
            }
        }
        for (int i = 0; i < cysteine.length; i++){
            if (str.equals(cysteine[i])){
                toWrite.add("Cysteine");
                return;
            }
        }
        for (int i = 0; i < tryptophan.length; i++){
            if (str.equals(tryptophan[i])){
                toWrite.add("Tryptophan");
                return;
            }
        }
        throw new IllegalArgumentException("Invalid codon");
    }

    private List<String> getAminoAcid(List<String> list){
        List<String> temp = new ArrayList<>();
        int listSize = list.size();
        for (int i = 0; i < listSize; i++){
            checkCodon(list.get(i), temp);
        }
        return temp;
    }

    List<String> translate(String rnaSequence) {
        List<String> processed = getList(rnaSequence);
        return getAminoAcid(processed);
    }
}
