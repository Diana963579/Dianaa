package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor

 public class User {

  private String name;
  private int age;
  private String email;
  private String address;


}
