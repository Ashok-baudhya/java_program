import java.util.Scanner;

public class armstrong {
	
	void checkArmstrong(int n){
	
		int i =n;
		int ans =0;
		while(i!=0)
		{
			int rem = i%10;
			ans += rem*rem*rem;
			i = i/10;
		}
		if(ans==n)
		{
			System.out.println("Armstrong");
			return;
		}
		System.out.println("Not Armstrong");
}
	

	public static void main(String[] args) {
		
		int n = 105;
		System.out.println("Enter Number"+n);
		armstrong ar = new armstrong();
		ar.checkArmstrong(n);

	}

}
