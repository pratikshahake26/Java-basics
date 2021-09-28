class Easy
{
 public static void main(String[] args) 
 { 
 // Arithmetic oprator 
 int a=5,b=3;
 System.out.println("Add="+(a+b));
 System.out.println("Sub="+(a-b));
 System.out.println("Multi="+(a*b));
 System.out.println("Div="+(a/b));
 System.out.println("Mod="+(a%b)); 

 //realational oprator 
int a=10,b=60,c=40;
 if(a>b&&a>c)
  System.out.println("a is greatest");
 if(b>a&&b>c)
  System.out.println("b is greatest");
 if(c>a&&c>b)
  System.out.println("c is greatest"); 

 //Assignment oprator 
int x1=5,y1=3;
 x1+=y1;//x1=x1+y1
 System.out.println(x1);

int x2=5,y2=3;
x2-=y2;//x2=x2-y2
System.out.println(x2); 

//bitwise oprator 
int a=5,b=3,c;
  c=a&b;//AND Operation
  System.out.println("a&b="+c);
  c=a|b;//OR Operation
  System.out.println("a|b="+c);
  c=a>>2;//Shift right Operation
  System.out.println("a>>2="+c);
  c=a<<2;//Shift left Operation
  System.out.println("a<<2="+c);
  c=a^2;//X-OR Operation
  System.out.println("a^2="+c); 

 // Increment/decrement oprator 
int a=5,b=10;
   System.out.println(++a);
   System.out.println(--b); 

//Conditional oprator 
int a=5,b=10,max;
  max=a>b?a:b;
  //don't be confused,here + is separator in java
  System.out.println("Greater value is "+max);
 }
 
}

