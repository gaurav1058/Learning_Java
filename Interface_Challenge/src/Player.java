import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private Integer hitPoints;
    private Integer strength;
    private String weapon;

    public Player(String name, Integer hitPoints, Integer strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon ="Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(Integer hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player : { name= "+ getName()+
            " Hit points= "+ getHitPoints()+ 
                " Strength= "+ getStrength()+
                " Weapon= "+ getWeapon()+ " }";
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues!=null && savedValues.size()>0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0,getName());
        values.add(1,"" + getHitPoints());
        values.add(2,"" + getStrength());
        values.add(3,getWeapon());
        return values;
    }   
}
