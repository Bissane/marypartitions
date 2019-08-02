
public class Biss {

	public static Integer solution(int n, int k, int m, int[][] D) {
		if (D[n][k] != -1)
			return D[n][k];
		if (n == 0)
			return 1;
		if (k == 0)
			return D[n][k] = 1;
		int aa = (int) (n - Math.pow(m, k));
		if (aa < 0)
			return D[n][k] = solution(n, k - 1, m, D);
		int bb = aa;
		return D[n][k] = solution(n, k - 1, m, D) + solution(bb, k, m, D);
	}

	// arguments are passed using the text field below this editor
	public static void main(String[] args) {
		String nS = args[0];
		String mS = args[1];
		int[][] D = new int[10000][10000];
		int n = Integer.parseInt(nS);
		int m = Integer.parseInt(mS);
		int p = (int) (Math.log(n) / Math.log(m));
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= p; j++) {
				D[i][j] = -1;
			}
		}
		System.out.println(solution(n, p, m, D));
	}

}
