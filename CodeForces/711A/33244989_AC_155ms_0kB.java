import java.util.Scanner;

public class test1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		boolean t = false;
		for(int i=0;i<n;i++) {
			s[i] = sc.next();
			if(s[i].contains("OO") & !t) {
				t = true;
				int x = s[i].indexOf("OO");
				StringBuilder temp = new StringBuilder(s[i]);
				temp.setCharAt(x,'+');
				temp.setCharAt(x+1,'+');
				s[i] = temp.substring(0);
			}
		}
		if(t) {
			System.out.println("YES");
			for(String x:s) {
				System.out.println(x);
			}
		}
		else System.out.println("NO");
	}
}