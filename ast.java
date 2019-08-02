import java.util.Scanner;
class ast {
public static void main(String[] qwe) {
Scanner scan=new Scanner(System.in);
int a,b,c;
int N=scan.nextInt( );

for(a=1;a<=N;a++)
{
for(b=1;b<=a;b++)
{
System.out.print("*");
}
for(c=a+1;c<=N;c++)
{System.out.print(" ");
}
System.out.println( );
}
}
}
