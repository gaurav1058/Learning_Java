public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isON = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the MobilePhone.");
            isRinging = false;
        }        
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(myNumber == phoneNumber && isON){
            isRinging = true;
            System.out.println("Song Song.....");
        }
        else{
            System.out.println("Mobile phone is not on or number different.");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public void dial(int phoneNumber) {
        if(isON){
            System.out.println("Now ringing "+ phoneNumber + " on deskPhone."); 
        }
        else{
            System.out.println("Phone is Switched off.");
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public void powerOn() {
        isON = true;
        System.out.println("Mobile Phone is Starting.");
    }
}
