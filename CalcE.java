public class CalcE{
	public static void main(String[] args){
		System.out.println(Calc(3));
	}
	public static double Calc(int n){
		int i=0;
		double sum=0;
		for(i=0;i<n;i++){
			sum+=1.0/fac(i);
		}
		return sum;
	}
	public static double fac(int n){
		if(n==0){
			return 1;
		}
		return n*fac(n-1);
	}
	
}