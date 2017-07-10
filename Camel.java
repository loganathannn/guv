import java.util.Scanner;
public class Camel {
public static void main(String[] args)
{
	//System.out.print("sd");
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();

	String[] c=a.split(" ");
	//String d=c[].toUpperCase();
	String b=a.substring(0,1).toUpperCase()+a.substring(1);
for(String d:c)
{
	System.out.print(d.substring(0,1).toUpperCase()+d.substring(1)+" ");
}
	
}
}
