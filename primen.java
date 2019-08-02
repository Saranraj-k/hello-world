import java.util.Scanner;
class primecount {
public static void main(String[] qwe) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
 int i = 3, count, c;
if(n >= 1)
    {
        System.out.println("First "+n+"prime numbers are :  ");
        System.out.println("2 ");
    }
 for(count = 2; count <= n; i++)  
    {
        
        for(c = 2; c < i; c++)
        {
            if(i%c == 0)
                break;
        }

        if(c == i)  
        {
            System.out.println(i);
            count++;    
        }

    }
}
}
