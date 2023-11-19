import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
class Passenger
{
 String Name,Trno,doj,tn,from,to,co,sno,br,gn,age,amt;
public void Printform()
{
System.out.println("\t\t\t\t\t\tINDIAN RAILWAY RESERVATION");
System.out.println("\n\t\tDate of booking :__________");
System.out.println("\n\t\tFrom       :__________"+"\t\t\t\t\t\tTO         :__________"+"\n\t\tTrain no.  :__________"+"\t\t\t\t\t\tTrain name :__________"+
"\n\t\tMobile no. :__________"+"\t\t\t\t\t\tClass      :__________");
System.out.println("\n\t\t_________________________________________________________________________"+"\n\t\tSno.|"+" Name  |"+" Age  |"+
" Gender |"+" Choise of any |"+"\n\t\t-------------------------------------------------------------------------"+"\n\t\t1.  |"+" \t    |"+"\t   |"+
" \t    |"+" \t\t    |"+"\n\t\t2.  |"+" \t    |"+"\t   |"+" \t    |"+" \t\t    |"+"\n\t\t3.  |"+" \t    |"+"\t   |"+" \t    |"+" \t\t    |"+"\n\t\t4.  |"+" \t    |"+"\t   |"+
" \t    |"+" \t\t    |"+"\n\t\t5.  |"+" \t    |"+"\t   |"+" \t    |"+" \t\t    |"+"\n\t\t6.  |"+" \t    |"+"\t   |"+" \t    |"+" \t\t    |"+
"\n\t\t-------------------------------------------------------------------------");
}
public void Entry()
{
Scanner in = new Scanner(System.in);
System.out.println("\n\t\t\t\t\t\t\tNEW RESERVATION "+"\n\t\t\t\t\t\t\t===============");
System.out.print("\t\t\t\t\tEnter Name = ");
Name = in.next();
System.out.print("\t\t\t\t\tEnter Train Number = ");
Trno = in.next();
System.out.print("\t\t\t\t\tEnter date Of Journey = ");
doj = in.next();
System.out.print("\t\t\t\t\tEnter Train Name = ");
tn = in.next();
System.out.print("\t\t\t\t\tFrom = ");
from = in.next();
System.out.print("\t\t\t\t\tTo = ");
to = in.next();
System.out.print("\t\t\t\t\tEnter Coach Number = ");
co = in.next();
System.out.print("\t\t\t\t\tEnter Seat Number = ");
sno = in.next();
System.out.print("\t\t\t\t\tEnter Berth = ");
br = in.next();
System.out.print("\t\t\t\t\tEnter Gender = ");
gn = in.next();
System.out.print("\t\t\t\t\tEnter Age = ");
age = in.next();
System.out.print("\t\t\t\t\tEnter Amount = ");
amt = in.next();
}
public void Printticket()
{
System.out.println("\n\t\t_________________________________________________________________________________"+"\n\t\t|\t\t\t\t"+"HAPPY JOURNEY"+"\t\t\t\t\t|"+
"\n\t\t---------------------------------------------------------------------------------"+"\n\t\t|"+"    PNR No.     | "+"Train Name.  "+"\tDateofJ   "+
"\t    TicketNo.     \t|"+"\n\t\t|\t\t |"+"      \t\t\t\t\t\t\t|");
System.out.printf("    \t\t|    ________    | %-20s",tn);
System.out.printf(" %-20s",doj);
System.out.print("_________\t\t|"+
"\n\t\t---------------------------------------------------------------------------------"+"\n\t\t|"+"    From :");
System.out.printf("%-15s",from); 
System.out.print("   \t\t To :");
System.out.printf("%-15s",to);
System.out.print("\t\t\t|"+"\n\t\t---------------------------------------------------------------------------------"+
"\n\t\t|"+"    Coach      | "+"  Seat no."+ "    Berth "+"\t|"+"  Gender "+"   \tAge "+"   \tAmount "+"\t\t|"+
"\n\t\t|");
System.out.println("    "+co   +"\t|" +"   "+sno+ "\t"+br +"\t|"+"  "+gn+"         "+age+"    "+amt+"\t\t|");
System.out.print("\t\t---------------------------------------------------------------------------------");  
}
public void save()
{
	try
	{
		FileWriter W= new FileWriter("data.text",true);
		W.write("\n\t\t_________________________________________________________________________________"+"\n\t\t|\t\t\t\t"+"HAPPY JOURNEY"+"\t\t\t\t\t|"+
"\n\t\t---------------------------------------------------------------------------------"+"\n\t\t|"+"    PNR No.     | "+"Train Name.  "+"\tDateofJ   "+
"\t    TicketNo.     \t|"+"\n\t\t|"+"    ________    | "+"\t\t\t\t\t\t\t\t|"+"    \t\t|\t\t | "+tn+"  "+doj+"_________\t\t|"+
"\n\t\t---------------------------------------------------------------------------------"+"\n\t\t|"+"    From :"+from+
"   \t\t To :"+to+"\t\t\t\t\t|"+"\n\t\t---------------------------------------------------------------------------------"+
"\n\t\t|"+"    Coach      | "+"  Seat no."+ "    Berth "+"\t|"+"  Gender "+"   \tAge "+"   \tAmount "+"\t\t|"+
"\n\t\t|"+"    "+co   +"\t|" +"   "+sno+ "\t"+br +"\t|"+"  "+gn+"         "+age+"    "+amt+"\t\t|"+
"\n\t\t---------------------------------------------------------------------------------");
		W.write(System.lineSeparator());
		W.close();
	}
	catch(IOException X)
	{
		System.out.println("Error");
	}
}
	
public static void main(String ahs[])
{
	int n;
	Scanner in = new Scanner(System.in);
	System.out.println("\033[H\033[2J");
	//System.out.flush();Passenger p1 = new Passenger();
	Passenger p1 = new Passenger();
	while(true)
{   
    System.out.println("\n\t\t\t\t\t\t   RAILWAY RESERVATION");
	System.out.println("\t\t\t\t\t_________________________________________"+"\n\t\t\t\t\t|\t1:Print Slip\t\t\t|"+
	"\n\t\t\t\t\t|\t2:Passenger Entry\t\t|"+"\n\t\t\t\t\t|\t3:Print Ticket\t\t\t|"+"\n\t\t\t\t\t|\t4:Exit\t\t\t\t|"+
	"\n\t\t\t\t\t|_______________________________________|");
System.out.println("Enter the operation number :");
  n =in.nextInt();
System.out.println("\033[H\033[2J");
	 if (n==1)
	{
		
		p1.Printform();
		in.next();
		System.out.println("\033[H\033[2J");

	}
	else if(n==2)
	{
		
		p1.Entry();
		p1.save();
		in.next();
		System.out.println("\033[H\033[2J");
	}
else if(n==3)
{
		
	p1.Printticket();
	in.next();
    System.out.println("\033[H\033[2J");
}
else if(n==4)
{
	
	break;
}
}
}
}