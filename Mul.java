public class Mul{
	public static void Muli(){
		int i=0;
		int j=1;
		for (i=1;i<=9;i++){
		for (j=1;j<=i;j++)
		System.out.printf("%2d*%-2d=%-3d",j,i,i*j);
		System.out.println("\t");
	}
	}
	public static void main(String[] args)
	{
		 Muli();
	}
}
