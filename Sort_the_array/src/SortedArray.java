import java.util.Scanner;
public class SortedArray {
    
    public static Scanner scanner=new Scanner(System.in);
    public static int[] getIntegers(int n){
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        return a;
    }
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println("Element "+ i+ " contents "+ a[i]);
        }
        
    }
    public static int[] sortIntegers(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i-1;j++){
                if(a[i]<a[j]){
                    int temp;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println("Element "+ i+  " contents "+ a[i]);
        }
        return a;
    }
}
