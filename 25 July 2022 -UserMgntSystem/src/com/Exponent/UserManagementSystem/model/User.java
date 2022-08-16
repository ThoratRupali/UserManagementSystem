package com.Exponent.UserManagementSystem.model;

public class User {
	
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", UserAddress=" + UserAddress + ", UsermailId="
				+ UsermailId + "]";
	}
	private int UserId;
	private String UserName;
	private String UserAddress;
	private String UsermailId;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserAddress() {
		return UserAddress;
	}
	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}
	public String getUsermailId() {
		return UsermailId;
	}
	public void setUsermailId(String usermailId) {
		UsermailId = usermailId;
	}
	

}
