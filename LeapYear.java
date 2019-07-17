public class LeapYear{
	public static void main(String[] args){
		Leap(2000,2020);
	}
	public static void Leap(int m,int n){
		for(int i=m;i<n;i++){
			if((i%4==0)&&(i%100!=0))
			System.out.println(i);
			else if(i%400==0)
			System.out.println(i);
		}
	}
}