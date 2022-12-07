import java.util.*;
import java.util.regex.*; 

/*
Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что один человек может иметь несколько телефонов
*/
public class Task1{
	
	//метод добавляет запись в телефонную книгу
	private static Map<String, ArrayList<String>> addPersonToPhoneBook(String name, String phone) {
		Map<String, ArrayList<String>> phoneBook = new HashMap();
		
	}
	
	/*
	метод использует регулярное выражение для проверки 
	правильности ввода номера телефона
	*/
	private static boolean isPhoneNumber(String phone) {
		Pattern pat = Pattern.compile("^(7|8){1}[9]{1}[0-9]{9}");
		Matcher mat = pat.matcher(phone);
		return mat.find();
	}


    public static void main(String args[]){
	Map<String, LinkedList<String>> phoneBook = new HashMap();
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter name: ");
	String name = scan.nextLine();
	
	while(!name.equals("quit") {
		System.out.println("Enter phone: ");
		String phone = scan.nextLine();
		
		if (!isPhoneNumber(phone)) 
			continue;
		if (!phoneBook.containsKey(name)) { 
		phoneBook.put(name, new LinkedList<String>);
		} else {
			phoneBook.get(name).add(phone);
			String name = scan.nextLine();
		}
	}
    }
}



