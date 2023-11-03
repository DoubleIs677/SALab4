package example;

import javax.xml.ws.Endpoint;

public class test {
    public static void main(String[] args){
        Endpoint.publish("http://localhost:8080/WS/calcTax?wsdl",
                new HelloWorld());
        System.out.println("发布成功!");
    }
}

