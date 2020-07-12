package example;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class CallHelloWorld {

    //this method gets data from Service
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/sayHello");
        QName qName = new QName("http://example/", "HelloWorldImplService");
        Service service = Service.create(url, qName);
        HelloWorld helloWorld = service.getPort(HelloWorld.class);
        System.out.println(helloWorld.sayHelloWorld());

        //Hello World
    }
}
