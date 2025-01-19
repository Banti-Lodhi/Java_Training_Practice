package app_java_enum;

public enum PaymentMethod {
CREDIT_CARD(2.5),
DEBIT_CARD(1.0),
PAYPAL(3.0),
BANK_TRANSFAR(0.5);
	
	private final double transactionFee;
	PaymentMethod(double fee) {
		this.transactionFee = fee;
	}
	public double getTransactionFee() {
		return transactionFee;
	}
	
	public void processPayment(double Amount) {
		double feeAmount = Amount * (transactionFee/100);		
		double totalFee = Amount+feeAmount;
		
		System.out.print("processing payment via "+ this.name());
		System.out.println("Transcation Fee "+ feeAmount);
		System.out.println("Total Amount to be paid "+totalFee);
	}
}
