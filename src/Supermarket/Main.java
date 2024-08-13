package Supermarket;

import java.util.Scanner;

import View.Login;
import Model.Database;

public class Main {
	
	public static void main(String[] args) {
		new Login().oper(null, new Scanner(System.in), new Database());
	}

}
