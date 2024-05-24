{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for(int k=0;k<t;k++){
		 String str = sc.nextLine();
		 int n= str.length();

		 if(n<2){
		     System.out.println(0);
		     continue;
		 }

		 int count=0;

		 for(int i=1;i<n;i=i+2){
		     if(str.charAt(i-1)!= str.charAt(i) ){
		          count++;
		      }
		     else {
		         i--;
		      }
		    }
		 System.out.println(count);
		}
	}
}
