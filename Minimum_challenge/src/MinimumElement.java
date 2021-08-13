import java.util.Scanner;

public class MinimumElement {
    public static Scanner scanner= new Scanner(System.in);
    public static int readInteger(){
        int n;
            n=scanner.nextInt();
        return n;
    }
    public static int[] readElements(int n){
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array){
        int a=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(a>array[i]){
                a=array[i];
            }
        }
        return a;
    }
}
