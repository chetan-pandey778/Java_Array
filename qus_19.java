import java.util.Scanner;
public class qus_19 {

static int[] makeFrequencyArray(int arr[]){
    int freq []= new int[100005];
    for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;
    }

    return freq;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter "+size+" element in array");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }  

          int freq [] = makeFrequencyArray(arr);
        System.out.println("enter the queries");
          int q = sc.nextInt();
          while(q>0){
            System.out.println("enter the no. you want to find");
            int x =  sc.nextInt(); 
            if(freq[x]>0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
              q--;
          }
          
           
    }
}
