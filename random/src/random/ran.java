package random;

import java.util.Random;

public class ran {
	public static void main(String[] args)
	{

	float m; 
	int j,c,k;
	String ye;
	
	Random ran = new Random();
	k= ran.nextInt(50);
	j= ran.nextInt(50);
	c= ran.nextInt(50);
	System.out.println("random number="+k+","+j+","+c);
	m= (float)k;
	System.out.printf("float=%.2f\n",m);
	System.out.printf("int= %d\n",j);
	ye = String.valueOf(c);
	System.out.println("string="+ye);
}

}
