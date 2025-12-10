public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        String temp;
        switch(shirtNum){
            case 1:
                temp = "goalie";
                break;
            case 2:
                temp = "left back";
                break;
            case 3:
            case 4:
                temp = "center back";
                break;
            case 5: 
                temp = "right back";
                break;
            case 6:
            case 7:
            case 8:
                temp = "midfielder";
                break;
            case 9:
                temp = "left wing";
                break;
            case 10:
                temp = "striker";
                break;
            case 11:
                temp = "right wing";
                break;
            default:
                temp = "invalid";
        }
        return temp;
    }
}
