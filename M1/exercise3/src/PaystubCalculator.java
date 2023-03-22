public class PaystubCalculator {
    public static void main(String[] args) {
        int totalHoursWorked, overTimeHours;
        double hourlyRate, overTimeRate, grossPay;
        boolean workedOvertime;

        hourlyRate= 40.0;
        overTimeRate= hourlyRate * 1.5;
        totalHoursWorked = 45;


        workedOvertime= totalHoursWorked>40;

        if(!workedOvertime){
            grossPay= hourlyRate * totalHoursWorked;
            System.out.println("Your gross pay is $" + grossPay);
        }
        else {
            overTimeHours= totalHoursWorked-40;
            grossPay= (hourlyRate * (totalHoursWorked- overTimeHours)) + (overTimeRate * overTimeHours);
            System.out.println("Your gross pay with overtime is $" + grossPay);
        }


    }
}