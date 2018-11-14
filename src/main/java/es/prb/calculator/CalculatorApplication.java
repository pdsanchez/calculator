package es.prb.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

  // export JAVA_HOME=/c/Program\ Files/Java/jdk1.8.0_92
  // ./mvnw compile
  // ./mvnw spring-boot:run
  public static void main(String[] args) {
    SpringApplication.run(CalculatorApplication.class, args);
  }
}
