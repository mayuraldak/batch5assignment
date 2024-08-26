public class Swap2 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int temp=0;                     //for swapping we have to initialize a new variable temp with 0 literal
        
        temp=arr[4];  // temp=50  arr[4]=0
        arr[4]=arr[0]; //arr[4]=10  arr[0]=0
        arr[0]=temp;  //arr[0]=50 temp=0
        
        for(int value:arr){
            System.out.println(value+"");
        }
    }
}
