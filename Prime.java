public class Prime{
	public static void main(String[] args){
		Prim(100,200);
	}
	public static void Prim(int m,int n){
		int j;
		for(int i=m;i<n;i++){
			for( j=2;j<i;j++){
				if(i%j==0){
					break;
				}
			}
			if(j>=i)
				System.out.println(i);
		}
	}
}