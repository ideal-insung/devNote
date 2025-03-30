package algorithm;

public class fibo {
	static int[] memo = new int[101];
	
	public int fibo_sequence1(int x) {
		if(x==0) return 0;
		else if(x==1) return 1;
		else {
			int fibPrev = 0;
            int fibCurr = 1;
			for(int i=2;i<=x;i++) {
				int temp = fibCurr;
	            fibCurr = fibPrev + fibCurr;
	            fibPrev = temp;
			}
			return fibCurr;
		}
	}
	
	public int fibo_sequence2(int x) {
		if(x==1) return x;
		else if(x == 2) return 1;
		else return  fibo_sequence2(x-1) + fibo_sequence2(x-2);
	}
	
	public int fibo_sequence3(int x) {
		if(memo[x] > 0) return memo[x];
		if(x==1) {
			return memo[x] = 1;
		}else if(x==2) {
			return memo[x] = 2;
		}else {
			return memo[x] = memo[x-1] + memo[x-2];
		}
	}
	
	public static void main(String[] args) {
		fibo f = new fibo();
		for(int i=1; i<11;i++) {
			System.out.println(f.fibo_sequence1(i));
		}
		System.out.println("@@@@");
		System.out.println(f.fibo_sequence1(10));
	}
}
