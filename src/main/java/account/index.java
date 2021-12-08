package account;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class index {
    public static void main(String[] args) {
        System.out.println("fdasf");
    }

    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Fucking, world, from " + from;
        System.out.println(result);
        return result;
    }
}
