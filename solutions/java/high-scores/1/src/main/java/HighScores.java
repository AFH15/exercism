import java.util.*;

class HighScores {
    private final List<Integer> highScores;
    private int latest;

    private List<Integer> sort(List<Integer> listToSort){
        List<Integer> sorted = new ArrayList<>(listToSort);
        Collections.sort(sorted, Collections.reverseOrder());
        return sorted;
    }
    
    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
        this.latest = highScores.get(highScores.size() - 1);
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return latest;
    }

    Integer personalBest() {
        List<Integer> temp = new ArrayList<>(highScores);
        temp = sort(highScores);
        return temp.get(0);
    }

    List<Integer> personalTopThree() {
        List<Integer> temp = new ArrayList<>(highScores);
        temp = sort(highScores);
        List<Integer> topThree = new ArrayList<>();
        for (int i = 0; i < temp.size() && topThree.size() < 3; i++){
            topThree.add(temp.get(i));
        }
        return topThree;
    }

}
