package task_java;

public class switchcase {
	public static void main(String[]args) {
		/*
		 * switch case
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day no:");
		int value=sc.nextInt();
		/*switch(value) {
		case 1:{
			System.out.println("Mon");
			break;
		}
		case 2:{
			System.out.println("tue");
			break;
			
		}
		default:{
			System.out.println("Invalid");
		}
		}*/
		String typeofDay=switch(value) {
		    case 1,2,3,4,5,6->"Weekday";
		    case 7->"Weekend";
		    default->"Invalid day";
		
		};
		System.out.println("Res:"+typeofDay);
	}

}

