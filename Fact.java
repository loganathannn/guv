
import java.io.*;
import java.util.*;
public class Fact{
public static void main(String args[])throws IOException
{
int f=1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(br.readLine());
for(int i=1;i<=a;i++)
{
f=f*i;
}
    System.out.println("factorical value is "+f);
}
}
