package AssignmentOpps;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("deposit");
}
public void main (String[] args) {
	AxisBank bank=new AxisBank();
	bank.saving();
	bank.fixed();
	bank.deposit();

	
}	
}

