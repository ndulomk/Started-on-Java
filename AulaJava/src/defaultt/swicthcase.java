package defaultt;
import java.util.Random;

public class swicthcase {

	public static void main(String[] args) {
		
		String day = "Friday";
		String[] dayof = new String[6];
		for(int i = 0;i<7;i++) {
			dayof[i] = "Mon";
		}
		int mon = 1;
		int sun = 2;
		int tue = 3;
		int wed = 4;
		int thu = 5;
		int friday = 6;
		int saturday = 7;
		Random random = new Random();
		
		switch(day) {
			case "Sunday": System.out.println("its sunday");
			break;
			case "Monday": System.out.println("it's Monday");
			break;
			case "Tuesday": System.out.println("it's Tuesday");
			break;
			case "Wednesday": System.out.println("It's Wednesday");
			case "Thursday": System.out.println("It's Thursday");
			break;
			case "Friday": System.out.println("It's Friday");
			break;
			case "Saturday": System.out.println("It's Saturday");
			break;
			default : System.out.println("Error");
			break;
			
		}

	}

}
