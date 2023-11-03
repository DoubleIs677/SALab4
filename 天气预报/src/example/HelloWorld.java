package example;

import tianqi.WeatherWSLocator;
import tianqi.WeatherWSSoap_PortType;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        try {
            WeatherWSLocator locator = new WeatherWSLocator();
            WeatherWSSoap_PortType port = locator.getWeatherWSSoap();

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您要查询的城市:");
            String city = sc.nextLine();

            String[] weatherInfo = port.getWeather(city, null);

            for(String weather: weatherInfo) {
                System.out.println(weather);
            }
        } catch(javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch(java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
