public class CalPi{
	public static void main(String[] args){
		System.out.println(Pi(3));
	}
	public static double Pi(int n){
		int i=1;
		double sum=0;
		while(i<=n){
		if(n==1)
		return 1;
		if(i%2!=0)
		sum+=1.0/(i*2-1);
		else sum-=1.0/(i*2-1);
		i++;
        }
		return sum;
		}
}