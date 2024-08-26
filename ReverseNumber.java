public class ReverseNumber
{
public static void main(String[] args) {
   int num = 123456;
   int reverse = 0;        
   
   while(num!=0)
   {
       int remainder = num%10;             //123456 % 10 = 6,   in first iteration
       reverse = reverse*10 + remainder;   //0*10 + 6 = 6,
       num = num/10;                       //123456/10 = 12345
   }
System.out.println("The revers of the given no is :" + reverse);
}
}