package org.ncu.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CalculatorApplication.class, args);
		Calculator calculator = context.getBean(Calculator.class);
		while(true){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter operation: add, subtract, divide, multiply: ");

		String operation = sc.nextLine();

		System.out.print("enter first number: ");
		double a = sc.nextDouble();

		System.out.print("enter second number: ");
		double b = sc.nextDouble();

		calculator.compute(operation,a,b);
		}
	}

}
