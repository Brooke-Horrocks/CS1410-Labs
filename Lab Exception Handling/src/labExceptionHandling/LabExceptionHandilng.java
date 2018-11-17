package labExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExceptionHandilng
{
	public static void main(String[] args)
	{
		boolean valid = false;
		
		do {
			try {
				int digit = numberFromUser();
				int result = sevenModulusN(digit);
				System.out.printf("7 %% %d = %d", digit, result);
				valid = true;
			} catch (Exception e) {
				System.out.println("A problem occurred: " + e);
			} 
		} while (!valid);
	}

	private static int numberFromUser()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean valid = false;
		
			do {
				try {
					System.out.print("number: ");
					number = input.nextInt();
					if(number == 0) {
						throw new IllegalArgumentException("Can't calculate 7 % 0.");
					}
					valid = true;
				} catch (InputMismatchException e) {
					input.nextLine();
					System.out.println("The number entered needs to be a whole number.");
					}
			} while (!valid);
		
		return number;
		
	}

	private static int sevenModulusN(int number)
	{
		return 7 % number;
	}
	
}
