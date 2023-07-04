package Arrays;

public class SwitchCase {
    public static void main(String[] args) {
        int t=1;
        System.out.println("--------------------------------------------------------");
        System.out.println("Switch without full breakpoints: ");
        switch(t){
            case 1:
                System.out.println("This is Case: "+1);
            case 2:
                System.out.println("This is Case: "+2);
            case 3:
                System.out.println("This is Case: "+3);
                break;
            case 4:
                System.out.println("This is Case: "+4);
            default:
                System.out.println("This is Case Default");
        }
            String d="Thursday";
            System.out.println("--------------------------------------------------------");
            System.out.println("Switch with full breakpoints: ");
            switch(d){
                case"Monday":
                    System.out.println("Today is Monday");
                    break;
                case"Tuesday":
                    System.out.println("Today is Tuesday");
                    break;
                case"Wednesday":
                    System.out.println("Today is Wednesday");
                    break;
                case"Thursday":
                    System.out.println("Today is Thursday");
                    break;
                case"Friday":
                    System.out.println("Today is Friday");
                    break;
                case"Saturday":
                    System.out.println("Today is Saturday");
                    break;
                case"Sunday":
                    System.out.println("Today is Sunday");
                    break;
                default:
                    System.out.println("This is Case Default");
            }
            System.out.println("--------------------------------------------------------");
        }
    }
