import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		System.out.println("***LockedMe.com***");
		System.out.println("   Developed by Adams(Java FSD)\n\n");
		list.add("Hello.pdf");
		list.add("my.pdf");
		list.add("Friend.pdf");
		list.add("Arrows.pdf");
		App(list);
	}

	public static void App(List list) {

		System.out.println("1.Reteriving the file names ");
		System.out.println("2.Business-level operations");
		System.out.println("3.Close the application\n");
		System.out.print("Choose an option from the above: \n");

		try {
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			switch (x) {
			case 1:
				Collections.sort(list);
				System.out.println(list + "\n");
				App(list);
				break;
				
			case 2:
				while(true){
				
				System.out.println("1.Add a file to the existing directory list");
				System.out.println("2.Delete a  file from the existing directory list ");
				System.out.println("3. Search a  file from the main directory");
				System.out.println("4. Exit to the main menu");
				System.out.print("Choose an option from the above: \n");
				try {
					int y = sc.nextInt();
					switch (y) {
					case 1:
						System.out.print("enter a file name you want to add: ");
						String s = sc.next();
						list.add(s);
						System.out.println(s + " File Added\n\n");
						
					    break;
					

						case 2:
						System.out.print("Enter the file name you want to delete: ");
						String a = sc.next();
						int ab = 0;

						for (int i = 0; i < list.size(); i++) {
							if (list.get(i).equals(a)) {
								list.remove(a);
								ab = 1;
							}
						}
						if (ab == 0) {
							System.out.println("File not found\n\n");
						}

						App(list);
						break;

					case 3:
						int bc = 0;
						System.out.print("enter a file name you want to search: ");
						String b = sc.next();

						for (int i = 0; i < list.size(); i++) {
							if (list.get(i).equals(b)) {
								System.out.println("Successful");
								System.out.println(list.get(i) + " found");
								bc = 1;
								System.out.println("\n\n");
								break;
							}

						}
						if (bc == 0) {
							System.out.println("File not found");
						}
						App(list);
						break;

					case 4:
						System.out.println("\n");

						App(list);
						System.exit(0);
						break;

					default:
						System.out.println("invalid input");
						break;

					}
					
				} catch (Exception e) {
					System.out.println("Enter a valid choice");
				}}
			case 3:
				System.out.println("Thank you for using our application\nHave a nice day!");
				break;

			default:
				System.out.println("Invalid input");
				break;
			
		}
		}
		catch (Exception e) {
			System.out.println("Please enter a valid choice");
			App(list);

		}

	}
}