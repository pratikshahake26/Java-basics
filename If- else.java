import java.util.Scanner;
class Easy
{
 public static void main(String[] args) 
 {
  Scanner in=new Scanner(System.in);
  int no=5;
  if(no>2)//condition true
  {
   System.out.println("Hello1");   
  }
  else if(no<2)//condition false
  {
   System.out.println("Hello2");   
  }
  else if(no==5)//condition true
  {
   System.out.println("Hello3");
  }
  else
  {
   System.out.println("Hello4");
  }
 }
}
