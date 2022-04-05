package br.com.daione.avaliacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import spinjar.com.minidev.json.JSONUtil;

@SpringBootApplication
public class Application {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
    System.out.println("Hell0 World");
  }

}