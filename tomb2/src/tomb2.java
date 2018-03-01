import java.util.Random;

public class tomb2 {
	public static void main(String[] args) {
		int[] tomb = new int[10];
	
		Random rand = new Random();

		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = rand.nextInt(50)+1;
			System.out.println(tomb[i]);
}

	

	for (int i = 0; i < tomb.length; i++) {
		tomb[i] = (int)(Math.random() * 50) + 1;
		System.out.println(tomb[i]);
		
}}}
