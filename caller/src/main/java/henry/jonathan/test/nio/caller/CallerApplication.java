package henry.jonathan.test.nio.caller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CallerApplication {
  public static void main(String[] args) {
    SpringApplication.run(CallerApplication.class, args);
  }
}
