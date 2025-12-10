public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >=5 ? (1.00-0.15) : 1.00 ;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary;
        salary = 1000.00 * salaryMultiplier(daysSkipped);
        salary += bonusForProductsSold(productsSold);
        return salary >= 2000.00 ? 2000.00 : salary;
    } 
}
