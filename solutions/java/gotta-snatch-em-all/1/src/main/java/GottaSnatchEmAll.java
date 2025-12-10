import java.util.*;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<String>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        if (myCollection.isEmpty() || theirCollection.isEmpty()){
            return false;            
        } else if (myCollection.containsAll(theirCollection)){
            return false;
        } else {
            boolean changed = myCollection.removeAll(theirCollection);
            //Once again
            if (myCollection.isEmpty() || theirCollection.isEmpty()){
                return false;
            } else {
                changed = myCollection.removeAll(theirCollection);
                return !changed;
            }
        }
        
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> first;
        Set<String> sec;
        if (collections.size() > 1){
            first = new HashSet<String>(collections.get(0));
            sec = new HashSet<String>(collections.get(1));
            first.retainAll(sec);
        } else {
            first = new HashSet<String>(collections.get(0));
        }
        
        return first;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> combined = new HashSet<String>();
        if (collections.size() > 1){
            for (int i = 0; i < collections.size(); i++){
                combined.addAll(collections.get(i));
            }
        } else {
            combined = new HashSet<String>(collections.get(0));
        }
        
        return combined;
    }
}
