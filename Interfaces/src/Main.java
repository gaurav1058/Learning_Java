public class Main {
    public static void main(String[] args) throws Exception {
        ITelephone gauravPhone;
        gauravPhone = new DeskPhone(11411363);
        gauravPhone.powerOn();
        gauravPhone.callPhone(234321);
        gauravPhone.answer();

        gauravPhone = new MobilePhone(232323);
        gauravPhone.powerOn();
        gauravPhone.callPhone(232323);
        gauravPhone.answer();
    }
}
