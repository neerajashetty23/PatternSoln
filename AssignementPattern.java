package javaFirst;

public class AssignementPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =4;
		for(int i=1 ;i<=num ;i++) {
			for(int j=1 ;j<=num;j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
		System.out.println();
		int n=14;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1 || i+j<=(n-1)/2 || j-i>=(n-1)/2)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			

			System.out.print("    ");
			for(int j=0;j<n;j++) {
				if(i==n-1 || i-j>=(n-1)/2 || i+j>=n-1+(n-1)/2)
					System.out.print("*");
				else 
					System.out.print(" ");
			}

			System.out.print("    ");
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1 || j==0 || i+j<=(n-1)/2 || i-j>=(n-1)/2)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			
			System.out.println();
	}

}
}
