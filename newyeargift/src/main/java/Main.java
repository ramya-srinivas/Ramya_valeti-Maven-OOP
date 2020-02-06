import java.util.*;
interface Sweets{
	int weight=2;
	public int Weight_method();
	
}
class choclates implements Sweets{
	int w;
	int c;
	public choclates(int n) {
		c=n;
	}
	public int Weight_method() {
		       w=weight*c;
				return w;
	}
}
class Candy implements Sweets{
	int c;
	int w;
	public Candy(int n) {
		c=n;
	}
	public int Weight_method() {
		w=weight*c;
				return w;
	}
}
class gift{
	int choc,cha,t;
	gift(int ch,int ca){
		cha=ca;
		choc=ch;
		
	}
	int totalWeight() {
		choclates ch1=new choclates(choc);
		Candy c=new Candy(cha);
		t=ch1.Weight_method()+c.Weight_method();
		return t;
		
	}
}
public class Main{
	public static void main(String args[]) {
		System.out.println("Hello Epam");
		gift g=new gift(3,4);
		gift g1=new gift(3,5);
		gift g2=new gift(3,2);
		int x[]=new int[3];
		x[0]=g.totalWeight();
		x[1]=g1.totalWeight();
		x[2]=g2.totalWeight();
		Arrays.sort(x);
		for(int i=0;i<3;i++) {
			System.out.println("Total weight of "+(i+1)+" gift is:"+x[i]);
		}
				
	}
}
