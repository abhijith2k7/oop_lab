class InvoiceProcessor {
    public void generateInvoice(String customer, double amount) {
        System.out.println("Generating invoice for " + customer);
        double total = calculate(amount);
        System.out.println("Total Amount: " + total);
    }
    private double calculate(double amount) {
        return amount + (amount * 0.18); 
    }
    public void accessCalculation(double amount) {
        System.out.println("Calculated Amount: " + calculate(amount));
    }
}

class RetailInvoice extends InvoiceProcessor {
    public void generateInvoice(String customer, double amount) {
        System.out.println("Retail Invoice for " + customer);
        double discounted = amount - (amount * 0.10);
        System.out.println("After Discount: " + discounted);
    }
}

public class invoii{
    public static void main(String[] args) {

        InvoiceProcessor obj1 = new InvoiceProcessor();
        obj1.generateInvoice("Abhi", 1000);
        obj1.accessCalculation(1000);
        System.out.println("-------------------");
        RetailInvoice obj2 = new RetailInvoice();
        obj2.generateInvoice("Abhi", 1000);
        System.out.println("-------------------");
        InvoiceProcessor ref = new RetailInvoice();
        ref.generateInvoice("Abhi", 1000);
        ref.accessCalculation(1000);       
    }
}
