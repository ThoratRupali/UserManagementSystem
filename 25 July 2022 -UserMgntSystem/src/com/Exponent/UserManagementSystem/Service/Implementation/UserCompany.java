package com.Exponent.UserManagementSystem.Service.Implementation;

import java.util.Scanner;

import com.Exponent.UserManagementSystem.Service.UserService;
import com.Exponent.UserManagementSystem.model.User;

public class UserCompany implements UserService {

	public static final int MAX_USERS = 5;
	Scanner sc = new Scanner(System.in);

	User[] UserDetails = new User[MAX_USERS];

	@Override
	public void addUser() {
		System.out.println("---Start Adding of users----");
		System.out.println("----------------------------");

		boolean flag = true;
		while (flag) {

			System.out.println("   1.Add first user :");
			System.out.println("   2.Add Second user :");
			System.out.println("   3.Add Third user :");
			System.out.println("   4.Add Fourth user :");
			System.out.println("   5.Add fifth user :");
			System.out.println("   6.Exit");
			System.out.println("Enter Your choice :");

			int Option = sc.nextInt();

			switch (Option) {
			case 1: {
				System.out.println("   1.Enter Details offirst user :");

				User u = new User();
				u.setUserId(111);
				u.setUserName("AAA");
				u.setUserAddress("P1");
				u.setUsermailId("abcd@gmial.com");
				UserDetails[0] = u;
				System.out.println(u);
				System.out.println("Added first User");
				System.out.println("********************************");

				break;
			}
			case 2: {
				System.out.println("   2.Enter Details of Second user :");
				User u1 = new User();
				u1.setUserId(222);
				u1.setUserName("BBB");
				u1.setUserAddress("P2");
				u1.setUsermailId("def@gmial.com");
				UserDetails[1] = u1;
				System.out.println(u1);
				System.out.println("Added Second User");
				System.out.println("********************************");
				break;
			}
			case 3: {
				System.out.println("   3.Enter Details of Third user :");
				User u2 = new User();
				u2.setUserId(333);
				u2.setUserName("CCC");
				u2.setUserAddress("P3");
				u2.setUsermailId("xyz@gmial.com");
				UserDetails[2] = u2;
				System.out.println(u2);
				System.out.println("Added Third User");
				System.out.println("********************************");
				break;
			}
			case 4: {
				System.out.println("   4.Enter Details of Fourth user :");
				User u3 = new User();
				u3.setUserId(444);
				u3.setUserName("DDD");
				u3.setUserAddress("P4");
				u3.setUsermailId("pqr@gmial.com");
				UserDetails[3] = u3;
				System.out.println(u3);
				System.out.println("Added Fourth User");
				System.out.println("********************************");
				break;
			}
			case 5: {
				System.out.println("   5.Enter Details of Fifth user :");
				User u4 = new User();
				u4.setUserId(555);
				u4.setUserName("EEE");
				u4.setUserAddress("P5");
				u4.setUsermailId("lmn@gmial.com");
				UserDetails[4] = u4;
				System.out.println(u4);
				System.out.println("Added fifth User");
				System.out.println("********************************");
				break;
			}
			case 6: {

				flag = false;
				break;
			}
			default:
				System.out.println("Wrong Option selected");
				break;
			}
		}

		System.out.println("-----Completed-----");
		System.out.println("**********************");
		return;
	}
	private int getUserId() {
		System.out.println("Enter UserId :");
		int UserId = sc.nextInt();//try catch block
		boolean flag = isUserIdValid(UserId);
		if(!flag) {
			System.out.println("Invalid UserId");
			return getUserId();
		}
		return UserId;
	}
	
	
	private boolean isUserIdValid(int UserId) {
		boolean flag = false;
		if(UserId!=0 && UserId<=MAX_USERS) {//positive number
			flag = true;
		System.out.println("Valid UserId");	
		}else
			System.out.println("Enter again");
		return flag;
	}
	

	@Override
	public void deleteUser() {

		System.out.println("Enter UserId to Delete:");
		int UserId = sc.nextInt();
//		int i = 0;
//
//		for (User u : UserDetails) {
//			System.out.println(u);
//			if (UserId == u.getUserId()) {
//				break;
//			}else {
//				i++;	
//			}
//		}
		int UserId1 = 0;
		for (int i = 0; i <= MAX_USERS; i++) {
			User u = UserDetails[i];
			if (UserId == u.getUserId()) {
				UserId = i;
				break;
			}
		}
		UserDetails[UserId] = null;
		System.out.println("----Deleting User Completed----");
	}

	public User[] getAllUserDetails() {
		for (User u5 : UserDetails) {

			if (u5 != null) {
//			System.out.println(u5.getUserId());
//			System.out.println(u5.getUserName());
//			System.out.println(u5.getUserAddress());
//			System.out.println(u5.getUsermailId());
				System.out.println(u5);

			}

		}
		return UserDetails;
	}
}
