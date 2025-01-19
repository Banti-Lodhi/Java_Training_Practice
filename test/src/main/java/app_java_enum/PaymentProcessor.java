package app_java_enum;

public class PaymentProcessor {
public static void main(String[] args) {
	double paymentAmount = 1000.0;
	
	//Process payment using Debit_Card
	PaymentMethod.DEBIT_CARD.processPayment(paymentAmount);
	//Process payment using Paypal
	PaymentMethod.PAYPAL.processPayment(paymentAmount);
	//Process payment using Banking Transfar
	PaymentMethod.BANK_TRANSFAR.processPayment(paymentAmount);
	//Process payment using credit card
	PaymentMethod.CREDIT_CARD.processPayment(paymentAmount);
	}

}
