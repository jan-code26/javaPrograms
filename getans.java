import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class getans {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			// split string by no space
			String[] str1 = s1.split(" ");
			ArrayList<String> p1 = new ArrayList<String>(
					Arrays.asList(str1));
			List<Integer> lst1 = new ArrayList<Integer>();
			for (String fav : p1) {
				lst1.add(Integer.parseInt(fav.trim()));
			}

			String[] str2 = s2.split(" ");
			ArrayList<String> p2 = new ArrayList<String>(
					Arrays.asList(str2));
			List<Integer> lst2 = new ArrayList<Integer>();
			for (String fav : p2) {
				lst2.add(Integer.parseInt(fav.trim()));
			}
			int n1 = 0, n2 = 0;
			for (int i = 0; i < lst1.size(); i++) {
				if (lst1.get(i) == lst2.get(i)) {
					continue;
				} else if (lst1.get(i) > lst2.get(i)) {
					n1++;
				}
				else{
					n2++;
				}
			}
			
			System.out.println(n1+" "+n2);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input");
			e.printStackTrace();
		}


	}

}