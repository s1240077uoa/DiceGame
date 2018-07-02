import java.util.Random;
class DiceGame{
    public class Number{
	public static final int N = 2;
    }
    
    public static void main(String[] args){

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
    }
}
