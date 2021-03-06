import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;
    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }
    
    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster : { name= "+ getName()+
        " Hit points= "+ getHitPoints()+ 
            " Strength= "+ getStrength()+" }";
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues!=null && savedValues.size()>0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
    
    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,getName());
        values.add(1,"" + getHitPoints());
        values.add(2,"" + getStrength());
        return values;
    }
    
    
}
