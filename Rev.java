
import java.io.;
public class Rev {
  public static void main(String [] args) throws IOException
  {
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the input");
    String a=b.readLine();
    StringBuffer br = new StringBuffer(a);
    br.reverse();
    
    System.out.println(br);
  }
}
