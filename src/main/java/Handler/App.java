package Handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class App implements RequestHandler<Map<String, String>,String> {
    @Override
    public String handleRequest(Map<String, String> stringStringMap, Context context) {

        // add custom logic here

        // change RequestHandler<Input, output> to match your use case

        return "Hello from Java lambda!";
    }
}
