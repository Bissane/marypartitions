
public class Biss {

	  static Integer n,m;
	  static Integer[][] D = new Integer[10000][10000];

	  public static Integer solution(Integer n,Integer k)
	  {
	      if(D[n][k] != -1)
	        return D[n][k];
	      if(n==0)
	        return 1;
	      if(k==0)
	        return D[n][k] = 1;
	      int aa = (int) (n - Math.pow(m,k));
	      if(aa < 0)
	        return D[n][k] = solution(n,k-1);
	      Integer bb = aa;
	      return D[n][k] = solution(n,k-1) + solution(bb,k);
	  }
	  // arguments are passed using the text field below this editor
	  public static void main(String[] args)
	  {	
		String nS = args[0];
		String mS = args[1];
		n = Integer.parseInt(nS);
	    m = Integer.parseInt(mS);
	    int p = (int)(Math.log(n)/Math.log(m));

	    for(int i=0;i<=n;i++){
	      for(int j=0;j<=p;j++){
	            D[i][j] = -1;
	      }
	    }
	    Integer a = solution(n,p);
		System.out.println(a);
	  }

}
