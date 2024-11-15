 import java.util.Scanner;
 import java.io.*;
 class Dmart{
	 public static final String Red = "\u001B[31m";
	 public static final String Blue = "\u001B[34m";
	 public static final String Yellow = "\u001B[33m";
     public static final String Green = "\u001B[32m";
     public static final String Reset = "\u001B[37m";	
	 public static final String K = "\u001B[36m";	

 public static void main(String[] args) {
    float qd1 = 0.0f;
    float qd5= 0.0f;
    float qd10 = 0.0f;
   int total;
  double td;
   double p_gst;
 String gift;


 System.out.println("Enter name ");
 Scanner sc = new Scanner(System.in);
 String name= sc.nextLine();
 System.out.println("Enter gender (M/F)");
 char gen = sc.next().charAt(0);
if(gen == 'f' || gen == 'F'){
    gift = "cadeberry";
}
else if(gen=='m'||gen == 'M'){
  gift = "ladger wallet";
}
else{
gift =" no gift";
}

 System.out.println("Enter first item");
 String i_1= sc.next();
 System.out.println("Enter first items qunatity");
 int q1= sc.nextInt();
 int ip1 = q1*10;
 System.out.println("Enter 2 item");
 String i_2= sc.next();
 System.out.println("Enter 2 items qunatity");
 int q2 = sc.nextInt();
 int ip2  = q2*20;
 System.out.println("Enter 3 item");
 String i_3= sc.next();
System.out.println("Enter 3 items qunatity");
 int q3= sc.nextInt();
 int ip3  = q3*30;
 System.out.println("Enter 4 item");
 String i_4= sc.next();
 System.out.println("Enter 4 items qunatity");
 int q4 = sc.nextInt();
 int ip4 = q4*40;
 System.out.println("Enter 5 item");
 String i_5= sc.next();
 System.out.println("Enter 5 items qunatity");
 int q5 = sc.nextInt();
 int ip5 = q5*50;
 System.out.println("Enter 6 item");
 String i_6= sc.next();
 System.out.println("Enter 6 items qunatity");
 int q6 = sc.nextInt();
 int ip6 = q6*60;

 System.out.println("Enter 7 item");
 String i_7= sc.next();
 System.out.println("Enter 7 items qunatity");
 int q7 = sc.nextInt();
 int ip7 = q7 * 70;

 System.out.println("Enter 8 iten");
 String i_8= sc.next();
 System.out.println("Enter 8 items qunatity");
 int q8 =sc.nextInt();
 int ip8 = q8*80;

 System.out.println("Enter 9 item");
 String i_9= sc.next();
 System.out.println("Enter 9 items qunatity");
 int q9 = sc.nextInt();
 int ip9 = q9*90;

 System.out.println("Enter 10 item");
String i_10=sc.next();
System.out.println("Enter 10 items qunatity");
 int q10 = sc.nextInt();
 int ip10 = q10*100;

 total = ip1+ip2+ip3+ip4+ip5+ip6+ip7+ip8+ip9+ip10;

 if(q1>4){
  qd1 = ip1 - (ip1*0.05f);
 //System.out.println("first iten 5% discount price  "+qd1);
}
else{
   qd1 =ip1;
}
   if(ip5==ip5){ 
    qd5 = ip5 - (ip5*0.10f);
    //System.out.println("after fifth item discount   "+qd5);
}

 if(ip10==ip10) {
qd10 = ip10 - (ip10*0.15f);
// System.out.println("after discount 10th  "+qd10);
}
if(total >10000) {
td = total - (total* 0.15);
//System.out.println("after discount 15% on total  "+td);
}
else if(total >5000 || total<10000){
 td = total- (total*0.10);
//System.out.println("after discount 10%  "+td);
}
else{
td= total;
//System.out.println("no discount amout too small");
    }
p_gst =  td+(td*0.10);
double b_gst = (td*0.10);
double t_gst = total + p_gst;
//System.out.println("after the gst  "+p_gst);
System.out.println("do you want carry bag(y/n) ");
 char b= sc.next().charAt(0);


/*
     item name i_1
    item quantity = q1

   item total price = ip1;
  after discount = qd1,qd5,qd10.


System.out.println("                                                     Dmart                                                     ");
System.out.println("Name : "+name+ "                                                                         Date :12/09/22");       
System.out.println("------------------------------------------------------------------------------------------------");
System.out.println("Item Name         Quantity               Price                 Total             After-Discount");  
System.out.println("  "+ i_1 +      " \t "       +  q1 +              "    10          \t " +ip1 + "           " + qd1           );
System.out.println("  "+ i_2 +      " \t "       +  q2 +              "    20           \t" +ip2 +   "        " + ip2          );
System.out.println("  "+ i_3 +        " \t"       +  q3 +              "    30             \t  " +ip3 + "           " + ip3          );
System.out.println("  "+ i_4  +     " \t"       +  q4 +              "    40             \t" +ip4 + "              " + ip4       );
System.out.println("  "+ i_5 +      " \t "       +  q5 +              "    50             \t  " +ip5 + "             " + qd5       );
System.out.println("  "+ i_6 +      "\t  "       +  q6 +              "    60            \t" +ip6 + "           " + ip6        );
System.out.println("  "+ i_7 +      "\t  "       +  q7 +              "    70             \t " +ip7 + "            " + ip7          );
System.out.println("  "+ i_8 +      " \t "       +  q8 +              "   80              \t " +ip8 + "              " + ip8           ); 
System.out.println("  "+ i_9 +      " \t "       +  q8 +              "   90              \t " +ip9 + "           " + ip9          );                    
System.out.println("  "+ i_10 +    "\t  "       +  q8 +              "   100           \t " +ip10 + "               " + qd10    );      

*/

System.out.printf( Blue+"%40s\n","Dmart"+Reset);
System.out.printf(Red+"%-8s%-15s%50s\n","Name :",name,"Date :22/09/22"+Reset);
System.out.println("-------------------------------------------------------------------------");
System.out.printf(Green+ "%-15s%-10s%5s%10s%30s\n", "Item Name","Quantity","Price","total","after-discout"+Reset);
System.out.printf(Yellow+ "%-15s%-10d%5s%10d%20f\n", i_1,q1,"10",ip1,qd1);
System.out.printf( "%-15s%-10d%5s%10d%20d\n", i_2,q2,"20",ip2,ip2);
System.out.printf( "%-15s%-10d%5s%10d%20d\n", i_3,q3,"30",ip3,ip3);
System.out.printf( "%-15s%-10d%5s%10d%20d\n", i_4,q4,"40",ip4,ip4);
System.out.printf( "%-15s%-10d%5s%10d%20f\n", i_5,q5,"50",ip5,qd5);
System.out.printf( "%-15s%-10d%5s%10d%20d\n", i_6,q6,"60",ip6,ip6);
System.out.printf( "%-15s%-10d%5s%10d%20d\n", i_7,q7,"70",ip7,ip7);
System.out.printf( "%-15s%-10d%5s%10d%20d\n", i_8,q8,"80",ip8,ip8);
System.out.printf( "%-15s%-10d%5s%10d%20d\n", i_9,q9,"90",ip9,ip9);
System.out.printf( "%-15s%-10d%5s%10d%20f\n", i_10,q10,"100",ip10,qd10);

System.out.println("-------------------------------------------------------------------------"+Reset);
System.out.printf(Green+"%40s%20s\n","AP","DP"+Reset);
System.out.println(""+K);
System.out.printf("%40d%20f\n",total,td);

//System.out.println("                                 ap  "+total+ "     dp       " +td);              
System.out.println("your gift is  :"+gift + "         0.0                 0.0 ");
if((b == 'y') || (b =='Y')){
 p_gst =p_gst + 10;
//System.out.println( " Carry bag : Yes                    10.0                          10.0\n ");
System.out.printf("%10s%20s%20s\n","Carry bag : Yes ","10.0","10.0");

   }else if(b=='N' || b=='n') {
	   System.out.printf("%10s%30s%20s\n","Carry bag :No ","0.0","0.0");
//System.out.println( " Carry bag : No           0.0                 0.0 \n");
   }
else{
System.out.println("Carry bag : invalid ");
 }
 System.out.printf("%10s%30f%20f\n","Gst(10%)",b_gst,b_gst);
//System.out.println( "GST (10%)                    "+b_gst +"          "+b_gst+"\n");

System.out.println("-------------------------------------------------------------------------");
System.out.printf("%40f%20f\n",t_gst,p_gst);
System.out.println(""+Reset);
//System.out.println("                                     "+t_gst+"   "               +p_gst);
System.out.println("-------------------------------------------------------------------------");
System.out.printf( Red+"%40s\n", "Thank  you");
System.out.printf( "%39s\n", "To visit"); 
System.out.printf( "%38s\n", "Dmart");
System.out.println(""+Reset);
}
}	