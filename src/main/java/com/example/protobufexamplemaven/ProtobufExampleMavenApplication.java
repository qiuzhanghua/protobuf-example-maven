package com.example.protobufexamplemaven;

import com.example.proto.SimpleMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProtobufExampleMavenApplication {

  public static void main(String[] args) {
    SimpleMessage.Message.Builder builder = SimpleMessage.Message.newBuilder();
    System.out.println(builder.setId(88).setName("邱张华").addList(1).addList(2).build());
//    SpringApplication.run(ProtobufExampleMavenApplication.class, args);
  }
}
