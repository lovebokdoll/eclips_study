
public class AccouningApp {

	public static void main(String[] args) {
		
	double valueOFSupply = Double.parseDouble(args[0]);
	double vatRate = 0.1;
	double expenseRate=0.3;
	double VAT = valueOFSupply*vatRate;
	double total = valueOFSupply+VAT;
	double expense = valueOFSupply*expenseRate;
	double income = valueOFSupply - expense;
	double dividend1 = income * 0.5;
	double dividend2 = income * 0.3;
	double dividend3 = income * 0.2;
	
	
		System.out.println("Value of supply : "+valueOFSupply);
		System.out.println("VAT : "+VAT);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		System.out.println("Dividend1 : "+dividend1);
		System.out.println("Dividend2 : "+dividend2);
		System.out.println("Dividend3 : "+dividend3);

	}

}
