class Easy
{  
 public static void main(String[] args) 
 {  
 // Break statement
  for(int i=1;i<=10;i++)
  {
  System.out.print(i+" ");
  if(i==5)
   break;  

 //continue statement
  for(int i=1;i<=5;i++)
  {
   if(i==3)
    continue;
   else
    System.out.print(i+" "); 

 // Return statement 
int add()
   {
    int x=3,y=6;
    return (x+y);//returning x+y=9
   }
 public static void main(String[] args) 
 {
  Easy obj=new Easy();
  int return statement=obj.add();
  System.out.println("Add="+rs);
  }
 }
}
