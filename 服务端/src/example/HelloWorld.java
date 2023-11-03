package example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorld{
    private static final double THRESHOLD = 3500;
    private static final double RATE = 0.02;

    @WebMethod
    public Double calculateTax(Double income) {
        double tax = 0;

        if (income > THRESHOLD) {
            tax = (income - THRESHOLD) * RATE;
        }

        return tax;
    }
}