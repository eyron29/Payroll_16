package Project1;

public class Employee {
    String posCode,empName, statCode, empStat, empPos, depCode;
    //int posCode;
    double hourlyRate,hoursWorked, presentNum, regPay, taxRate, otPay, netPay;
    //deduction;

    Employee(String empName, String posCode, String empPos, String statCode, String empStat, String depCode, double hourlyRate, double hoursWorked, double presentNum,double regPay, double taxRate, double otPay, double netPay){
        this.empName = empName;
        this.posCode = posCode;
        this.empPos = empPos;
        this.statCode = statCode;
        this.empStat = empStat;
        this.depCode = depCode;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.presentNum = presentNum;
        this.taxRate = taxRate;
        this.regPay = regPay;
        this.otPay = otPay;
        this.netPay = netPay;
        //this.deduction = deduction;
    }
}
