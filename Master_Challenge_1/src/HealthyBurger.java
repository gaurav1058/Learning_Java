public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    
    public HealthyBurger(String name,double price) {
        super("n/a", name, price, "n/a");
    }
    public void addHealthyAddition1(String healthyExtra1Name,double healthyExtra1price){
        this.healthyExtra1Name=healthyExtra1Name;
        this.healthyExtra1Price=healthyExtra1price;
    }
    public void addHealthyAddition2(String healthyExtra2Name,double healthyExtra2price){
        this.healthyExtra2Name=healthyExtra2Name;
        this.healthyExtra2Price=healthyExtra2price;
    }
    @Override
    public double itemizeHamburger(){
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name!=null){
            hamburgerPrice += this.healthyExtra1Price;

        }
        if(this.healthyExtra2Name!=null){
            hamburgerPrice += this.healthyExtra2Price;
            
        }
        return hamburgerPrice;
    }
}
