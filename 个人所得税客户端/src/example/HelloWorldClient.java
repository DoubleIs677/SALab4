package example;


import mypackage.HelloWorld;
import mypackage.HelloWorldServiceLocator;

import java.util.Scanner;


public class HelloWorldClient {
    public static void main(String[] argv) {
        try {
            HelloWorld service = new HelloWorldServiceLocator().getHelloWorldPort();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的工资");
            double income = sc.nextDouble();
            double result = service.calcTax(income);
            System.out.println("须交税"+result);
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
