public class GameMaster {

    public String describe (Character c){
        return "You're a level " + c.getLevel() + " " + c.getCharacterClass() + " with " + c.getHitPoints() + " hit points.";
    }
    
    public String describe (Destination d){
        return "You've arrived at " + d.getName() + ", which has " + d.getInhabitants() + " inhabitants.";
    }

    // TODO: define a 'describe' method that returns a description of a TravelMethod

    public String describe (TravelMethod tm){
        if (tm == TravelMethod.WALKING){
            return "You're traveling to your destination by walking.";
        } else {
            return "You're traveling to your destination on horseback.";
         }
    }
    // TODO: define a 'describe' method that returns a description of a Character, Destination and TravelMethod
    public String describe (Character c, Destination d, TravelMethod tm){
        return describe(c) + " " + describe(tm) + " " + describe(d);
    }

    // TODO: define a 'describe' method that returns a description of a Character and Destination

    public String describe (Character c, Destination d){
        return describe(c) + " " + describe(TravelMethod.WALKING) + " " + describe(d);
    }
}
