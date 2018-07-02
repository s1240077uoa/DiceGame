import java.util.Random;
import java.io.*;

class DiceGame{
    public class Number{
	public static final int N = 2;
    }
    
    public static void main(String[] args) throws IOException{
	InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        System.out.print("What is your name?\n> ");

        String str = br.readLine();

        System.out.println("Hello, "+ str + "!");

	
	Random ran = new Random();
	int sum = 0;
	
	System.out.println("Rolling the dice...");

	for(int i = 1; i <= Number.N; i++){
	    int num = ran.nextInt(6);
	    num++;
	    sum += num;
	    System.out.println("Die "+ i +": "+ num);
	}
	System.out.println("Total value: "+ sum);


	if(sum >= 7 && sum <= 6 * Number.N) System.out.println( str + " won!");
	else if(sum < 7 && sum > 0) System.out.println( str + " lost!");
	
    }
}
