package com.Exponent.UserManagementSystem.Controller;

import java.util.Scanner;

import com.Exponent.UserManagementSystem.Service.UserService;
import com.Exponent.UserManagementSystem.Service.Implementation.UserCompany;

public class UserController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		UserService u = new UserCompany();
		boolean flag = true;

		while (flag) {

			System.out.println("--------Welcome--------");
			System.out.println("************************");
			System.out.println("    1.addUser");
			System.out.println("    2.deleteUser");
			System.out.println("    3.getAllUserDetails");
			System.out.println("    4.Exit");
			System.out.println("Enter option :");

			int option = sc.nextInt();
			switch (option) {
			case 1: {
				u.addUser();
				break;
			}
			case 2: {
				u.deleteUser();
				break;
			}
			case 3: {
				u.getAllUserDetails();
				break;
			}
			case 4: {
				flag = false;
				break;
			}
			default:
				System.out.println("Wrong Option");
				System.out.println("Please Enter Correct Option");
				break;
			}
		}
			sc.close();
			System.out.println("---Thank You!!!!!!---");
			System.out.println("************************");
			
		}
	}

