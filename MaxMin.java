public class MaxMin {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};     //length of array is 9
        
        for(int i=1; i<arr.length; i++) {
            int max = arr[0];    //initialization
            int min = arr[0];    //initialization
            
            for (i=1;i<arr.length;i++)       //i=1,1<9(length of an array),true
            {
                if(arr[i]>max)
                {
                    max=arr[i];
                }
                else if(arr[i]<min)
                {
                    min=arr[i];
                
                }
            }
            System.out.println("Maximum no is:"+max);
            System.out.println("Minimum no is:"+min);
        }
    }
}