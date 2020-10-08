public class SwitchExample3 {
    public static void main(String[] args) {
    String dayOfWeekArg = "Thursday";
    String typeOfDay = "";
    switch (dayOfWeekArg) {
    case "Monday":
    typeOfDay = "Start of work week";
    break;
    case "Tuesday":
    case "Wednesday":
    case "Thursday":
    typeOfDay = "Midweek";
    break;
    case "Friday":
    typeOfDay = "End of work week";
    break;
    case "Saturday":
    case "Sunday":
    typeOfDay = "Weekend";
    break;
    default:
    System.out.println("Invalid day of the week: " +
    dayOfWeekArg);
    }
    System.out.println(typeOfDay);
    }
    }
    
    /*
    Memiliki 2 yg bertipe string dayofweekarg dan typeofday, namun string dayofweekarg memiliki nilai yaitu Thursday

    Jika Thursday berada pada typeofday Midweek maka program akan print Midweek dan program akan berhenti
    */