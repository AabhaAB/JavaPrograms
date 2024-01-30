package ControlStatements;

public class SwitchCase {

	public static void main(String[] args) {
		// 
		int choice= 5;
		String Days;
		switch(choice)
		{
		case 1:
			Days= "Monday";
			break;
		case 2:
			Days= "Tueday";
			break;
		case 3:
			Days= "Wednesday";
			break;
		case 4:
			Days= "Thursday";
			break;
		case 5:
			Days="Friday";
			break;
		case 6:
			Days= "Saturday";
			break;
		case 7:
			Days= "Sunday";
			break;
		default:
			Days= "Invalid";
			break;
			
		}
		System.out.println(Days);

	}

}
