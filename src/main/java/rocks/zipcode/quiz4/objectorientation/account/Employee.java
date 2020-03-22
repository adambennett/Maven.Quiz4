package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements Worker, Transactable {

    private BankAccount account;
    private Double hoursWorked;
    private Double hourlyWage;

    public Employee() {
        this(new BankAccount());
    }

    public Employee(BankAccount bankAccount) {
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
        this.account = bankAccount;
    }

    public BankAccount getBankAccount() {
        return this.account;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.account = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        this.account.deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        this.account.withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return this.account.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
        this.hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.hoursWorked * this.hourlyWage;
    }
}
