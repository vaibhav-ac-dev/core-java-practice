public class TakeUserInput {
	
	public static void main(String []args) {
		
		// Take values from command args[]
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("First -> "+ a +"\nSecond -> "+ b);
		
		// Limitation of using this method of input is, you need to pass all arguments on same line like as follow:
		// javac TakeInputFromCommandLindArg 5 8
		// java TakeInputFromCommandLindArg 5 8

        // Convert command-line arguments to int array dynamically
        int[] numbers = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        // Print the array
        System.out.println("\nYou entered:");
        for (int num : numbers) {
            System.out.println(num);
        }
	}
}
