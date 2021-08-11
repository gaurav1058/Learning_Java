public class Main {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            Movie movie = randomMovie();
            System.out.println("Movie is "+ movie.getName() + "\n"+ 
            "plot generated "+ movie.plot());
        }
    }
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5) +1;//Math.random() returns a number between 0.0(included) to 1.0(excluded). 
        System.out.println("Random Number generated = "+ randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }
    }
}
