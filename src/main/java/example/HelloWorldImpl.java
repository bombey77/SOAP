package example;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService(endpointInterface = "example.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        //run service
        Endpoint.publish("http://localhost:8080/sayHello", new HelloWorldImpl());
    }
}
