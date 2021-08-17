public class Person {
    private int personFloor;

    public Person(int personFloor) {
        this.personFloor = personFloor;
    }

    public int getPersonFloor() {
        return personFloor;
    }

    public void changePresonFloor(int current){
        this.personFloor=current;
    }
}
