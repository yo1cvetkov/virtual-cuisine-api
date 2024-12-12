package com.example.demo.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.services.HealthCheckService;

@Component
public class StartupChecker implements CommandLineRunner {
  @Autowired
  private HealthCheckService healthCheckService;

  @Override
  public void run(String... args) {
    if(healthCheckService.isDatabaseConnected()) {
      System.out.println("Database connection successful!");
    } else {
      System.err.println("Database connection failed");
      throw new IllegalStateException("Database connection failed");
    }
  }
}
