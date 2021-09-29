class EASY
 { 
  public static void main(String[] args) 
  { 

   // to upper case
   String s="Easy";
   System.out.println(s.toUpperCase());

  //to lower case 
 String s="Easy";
   System.out.println(s.toLowerCase());
  
 //length
String s="Easy";
   System.out.println(s.length());

 //charAt 
String s="Easy";
   System.out.println(s.charAt(2) 

 //startWith
String s="Easy";
   System.out.println(s.startsWith("ea"));//false 
   System.out.println(s.startsWith("Ea"));//true

 //endWith
String s="Easy";
   System.out.println(s.endsWith("sy"));//true 
   System.out.println(s.endsWith("sY"));//false
 
//compareTo
String s="Easy";
   System.out.println(s.compareTo("Easy"));
   System.out.println(s.compareTo("easy"));

 //equals 
String s="Easy";
   System.out.println(s.equals("Easy"));
   System.out.println(s.equals("easy")); 

 // toCharArry
   String s="Easy";
   char ch[]=s.toCharArray();
   for(int i=0;i<ch.length;i++)
   System.out.println("character at "+i+" is "+ch[i]);
  
 //reverse 
   String s="Easy";
   String rev=new StringBuffer(s).reverse().toString();
   System.out.println("Original String="+s+"\nReverse String="+rev);
  
 //replace 
String s="Easy softwares is telecom training centre";
   //replace telecom with software
   String s1=s.replace("telecom", "software");
   System.out.println("Original String="+s+"\nUpdated String="+s1);
  
 //replaceAll
String s="Easy softwares is software training centre";
   //replace all a  with @
   String s1=s.replaceAll("a", "@");
   System.out.println("Original String="+s+"\nUpdated String="+s1);

 // replaceFirst 
String s="Easy softwares is software training centre";
   //replace only first a  with @
   String s1=s.replaceFirst("a", "@");
   System.out.println("Original String="+s+"\nUpdated String="+s1);
  
 // getBytes
String s="Easy";
   //passing string into byte array
   byte ar[]=s.getBytes();
   for (int i = 0; i < ar.length; i++) 
    {
    System.out.println(ar[i]);     
    }
  
 //indexOf 
String s="Easy Softwares";
     System.out.println(s.indexOf("a"));
 
 //lastindexOf 
String s="Easy Softwares";
     System.out.println(s.lastIndexOf("a"));
 
 //trim
String s="Easy";
     System.out.println("Before Trim");
     System.out.println(s);
     System.out.println("After Trim");
     System.out.println(s.trim());

 //contains 
String s="Easy softwares is an ISO Certified Training Centre";
   System.out.println(s.contains("ISO")); 

 //intern 
String s="Easy softwares";
   System.out.println(s);
   String s2=s.intern();
   System.out.println(s2); 

 //valueOf 
int no=10;
   System.out.println(no+20);
   String s=String.valueOf(no);
   System.out.println(s+20); 

 //isEmpty
String s1="Easy";
   System.out.println(s1.isEmpty());
   String s2="";
   System.out.println(s2.isEmpty()); 
 
 //substring
 String s1="EasySoftwares";
   //substring(startIndex)
   System.out.println(s1.substring(4)); 
   //substring(startIndex,endString)
   System.out.println(s1.substring(4,8));
  }
 }


