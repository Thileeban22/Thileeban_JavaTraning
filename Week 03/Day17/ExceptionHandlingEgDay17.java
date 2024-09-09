package programs.Day17;

public class ExceptionHandlingEgDay17 {
	public static void main(String[] args) {

		try {
			// Exception Exmaple 1
			int arr[] = { 1, 2, 3, 4, 5 };
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}

			// Exception Exmaple 2
			String str = "abcd";
			String substr = str.substring(2, 9);
			System.out.println(substr);

			ExceptionEgDay17.met();
			// ExceptionHandlingEg.met();
		} catch (StringIndexOutOfBoundsException se) {
			System.out.println("String IndexOutOfBounds Exception" + se);

		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("String IndexOutOfBounds Exception" + ae);
		} catch (NumberFormatException ne) {
			System.out.println("String IndexOutOfBounds Exception" + ne);
		}

		catch (Exception e) {
			System.out.println("Exception Occured.....Pls retry with valid input");
			e.printStackTrace();
		}

	}

}