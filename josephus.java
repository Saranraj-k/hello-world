import java.util.Scanner;
class jos
{
 public static int josephus(int n,int k)
{
if(n==1)
return 1;
else
return(josephus(n-1,k)+ k-1)% n+1;
}
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int k=scan.nextInt();
System.out.println("the person is" +josephus(n,k));
}
}
