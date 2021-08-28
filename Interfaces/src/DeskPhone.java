public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the phone.");
            isRinging = false;
        }        
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(myNumber == phoneNumber){
            isRinging = true;
            System.out.println("Ring Ring...");
        }
        else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing "+ phoneNumber + " on deskPhone.");        
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void powerOn() {
        System.out.println("No actions taken, this button does not hava a power button.");
    }


}
