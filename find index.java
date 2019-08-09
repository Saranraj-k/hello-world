import java.util.Scanner;
class Arraypgm
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i;

int a[]=new int[n];
for( i=0;i<n;i++)
{
a[i]=scan.nextInt();
}
System.out.println("number to search");
int x=scan.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==x)
{
System.out.println(i);
}
}
}
}

