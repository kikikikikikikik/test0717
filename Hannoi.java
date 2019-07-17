public class Hannoi{
	public static void main(String[] args){
		move(2,0,2);
	}
	public static void move(int n,int source,int dest){
		if(n==1){
		//move(n,source,dest);
		System.out.printf("从%d到%d%n",source,dest);
		}
			else{
				move(n-1,source,3-source-dest);
				System.out.printf("从%d到%d%n",source,dest);
				move(n-1,3-source-dest,dest);
				
			}
		}
}