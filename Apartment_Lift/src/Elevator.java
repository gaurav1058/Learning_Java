public class Elevator {
    private int elevatorFloor;
    public Elevator(int elevatorFloor) {
        this.elevatorFloor = elevatorFloor;
    }
    private int getElevatorFloor() {
        return elevatorFloor;
    }

    public int floor(){
        return getElevatorFloor();
    }
    public void reset(){
        this.elevatorFloor=1;
    }
    public void change(int newFloor){
        this.elevatorFloor=newFloor;
    }
}
