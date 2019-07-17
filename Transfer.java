public class Transfer{
	public static void main(String[] args){
		System.out.printf(decToHex(300));
	}
	//  public static string dectohex(int n){
		 //  string s="";
		//  int t=n%16;
		//  while(n!=0){
		 // if(t<10){
		// system.out.printf(dectohex(n/16));
			//  return s+(char)(t+'0');
		//  }
		//  else if(t<16){
			//system.out.printf(dectohex(n/16));
			//  return s+(char)('a'+(t-10));
		//  }
		//  }
		// else n=n/16;
		// return null;
	//  }
	public static String decToHex(int n){
		String s="";
		while(n!=0){
			int t=n%16;
			if(t<10){
				System.out.printf(s+(char)(t+'0'));
			}
			else if(t<16){
				System.out.printf(s+(char)('A'+(t-10)));
			}
			n=n/16;
		}
		return s;
	}
	
}