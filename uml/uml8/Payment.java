package uml8;

public class Payment {
    private int payId;
    private String method;
    private double payment;

    double getPayment() {
        return payment;
    }

    void setPayment(int payId, String method) {
        this.payId = payId;
        this.method = method;
    }

    void displayPayment() {
        System.out.println("Payment Id: " + payId);
        System.out.println("Method: " + method);
    }
}
