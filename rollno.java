import java.util.Scanner;
class regno
{
public static void  main(String args[])
{
Scanner scan=new Scanner(System.in);
String name=scan.nextLine();  
String DOB=scan.nextLine();
String dept=scan.nextLine();
String clg=scan.nextLine();
String rollno=" ";
System.out.println(rollno=clg.substring(0,1)+DOB.substring(0,2)+dept.substring(0,2)+name.substring(0,3)+DOB.substring(3,5)+DOB.substring(8));
}
}
