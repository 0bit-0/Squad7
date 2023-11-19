import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.*;
class Pass
{
 String Name,Trno,doj,tn,from,to,co,sno,br,gn,age,amt;
public void Printform()
{
System.out.println("\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\tINDIAN RAILWAY RESERVATION");
System.out.println("\n\t\t\t\tDate of booking :__________");
System.out.println("\n\t\t\t\tFrom       :__________"+"\t\t\t\t\t\tTo         :__________"+"\n\t\t\t\tTrain no.  :__________"+"\t\t\t\t\t\tTrain name :__________"+
"\n\t\t\t\tMobile no. :__________"+"\t\t\t\t\t\tClass      :__________");
System.out.println("\n\t\t\t\t______________________________________________________________________________________"+"\n\t\t\t\tSno.|"+" Name  |"+" Age  |"+
" Gender |"+" Choice of any |"+"\n\t\t\t\t--------------------------------------------------------------------------------------"+"\n\t\t\t\t1.  |"+" \t    |"+"\t   |"+
" \t    |"+" \t\t    |"+"\n\t\t\t\t2.  |"+" \t    |"+"\t   |"+" \t    |"+" \t\t    |"+"\n\t\t\t\t3.  |"+" \t    |"+"\t   |"+" \t    |"+" \t\t    |"+"\n\t\t\t\t4.  |"+" \t    |"+"\t   |"+
" \t    |"+" \t\t    |"+"\n\t\t\t\t5.  |"+" \t    |"+"\t   |"+" \t    |"+" \t\t    |"+"\n\t\t\t\t6.  |"+" \t    |"+"\t   |"+" \t    |"+" \t\t    |"+
"\n\t\t\t\t--------------------------------------------------------------------------------------");
}
public void Entry()
{
Scanner in = new Scanner(System.in);
System.out.println("\n\t\t\t\t\t\t\t-----NEW RESERVATION----- "+"\n\t\t\t\t\t\t\t     ===============");
System.out.print("\n\t\t\t\t\t\tEnter Name = ");
Name = in.next();
System.out.print("\t\t\t\t\t\tEnter Train Number = ");
Trno = in.next();
System.out.print("\t\t\t\t\t\tEnter date Of Journey = ");
doj = in.next();
System.out.print("\t\t\t\t\t\tEnter Train Name = ");
tn = in.next();
System.out.print("\t\t\t\t\t\tFrom = ");
from = in.next();
System.out.print("\t\t\t\t\t\tTo = ");
to = in.next();
System.out.print("\t\t\t\t\t\tEnter Coach Number = ");
co = in.next();
System.out.print("\t\t\t\t\t\tEnter Seat Number = ");
sno = in.next();
System.out.print("\t\t\t\t\t\tEnter Berth = ");
br = in.next();
System.out.print("\t\t\t\t\t\tEnter Gender = ");
gn = in.next();
System.out.print("\t\t\t\t\t\tEnter Age = ");
age = in.next();
System.out.print("\t\t\t\t\t\tEnter Amount = ");
amt = in.next();
System.out.print("\n\n\n\t\t\t\t\t\t------Your Entry Is Saved------");
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
System.out.printf("    %-5s \t|   %-5s \t%-5s   |  %-6s \t%-3s  \t%-5s\t\t|",co,sno,br,gn,age,amt);
System.out.print("\n\t\t---------------------------------------------------------------------------------");  
}
public void save()
{
	try
	{
		FileWriter W= new FileWriter("Pdata.text",true);
		W.write(Name+" "+Trno+" "+doj+" "+tn+
		" "+from+" "+to+" "+co+" "+sno+" "+br+" "+gn+" "+age+" "+amt);
		W.write(System.lineSeparator());
		W.close();
	}
	catch(IOException X)
	{
		System.out.println("Error in filereading");
	}
	}

public void Showall()
{
	String d;
	System.out.println("\t\t\t\t\t\t\t\tPassenger List"+"\n============================================================================================================================================================"+
	"\n   Name"+"\t\tTrainNo."+"\tDateofJourney"+"\t  TrainName"+"\t\tFrom"+"\t\tTo"+"\t    Coachno."+"   SeatNo."+"   Berth"+"  Gender"+"   Age"+"    Amount"+
	"\n===========================================================================================================================================================");
	try
	{
		FileReader R= new FileReader("Pdata.text");
		BufferedReader Br = new BufferedReader(R);
		while((d=Br.readLine())!=null)
		{
			String []Parts = d.split(" ");
System.out.printf("\n %-15s  %-7s      %-10s \t%-15s       %-15s%-15s %-5s \t %-5s \t  %-5s %-6s   %-3s     %-5s",Parts[0],Parts[1],Parts[2],Parts[3],Parts[4],Parts[5],Parts[6],Parts[7],Parts[8],Parts[9],Parts[10],Parts[11]);
System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------");		
		}
Br.close();
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
	Pass p1 = new Pass();
	while(true)
{   
    System.out.println("\n\n\n\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t   RAILWAY RESERVATION");
	System.out.println("\t\t\t\t\t\t\t_________________________________________"+"\n\t\t\t\t\t\t\t|\t1:Print Slip\t\t\t|"+
	"\n\t\t\t\t\t\t\t|\t2:Passenger Entry\t\t|"+"\n\t\t\t\t\t\t\t|\t3:Print Ticket\t\t\t|"+"\n\t\t\t\t\t\t\t|\t4:ShowAll\t\t\t|"+
	"\n\t\t\t\t\t\t\t|\t5:Exit\t\t\t\t|"+"\n\t\t\t\t\t\t\t|_______________________________________|");
System.out.print("\n\n\n\n\n\n\n\t\t\t\t\t\t\tEnter the operation number : ");
  n =in.nextInt();
System.out.println("\033[H\033[2J");
	 if (n==1)
	{
		
		p1.Printform();
		System.out.print("\n\n\n\n\n\n\t\t\t\t\t\tPress Any Key Then Enter To EXIT : ");
		in.next();
		System.out.println("\033[H\033[2J");

	}
	else if(n==2)
	{
		
		p1.Entry();
		p1.save();
		System.out.print("\n\n\n\n\n\n\t\t\t\t\t\tPress Any Key Then Enter To EXIT = ");
		in.next();
		System.out.println("\033[H\033[2J");
	}
else if(n==3)
{
		
	p1.Printticket();
		System.out.print("\n\n\n\n\n\n\t\t\t\t\t\tPress Any Key Then Enter To EXIT = ");
	in.next();
    System.out.println("\033[H\033[2J");
}
else if(n==4)
{
	
	p1.Showall();
		System.out.print("\n\n\n\n\n\n\n\t\t\t\t\t\tPress Any Key Then Enter To EXIT = ");
    in.next();
    System.out.println("\033[H\033[2J");
}
else if(n==5)
{
	break;
		
}
}
}
}