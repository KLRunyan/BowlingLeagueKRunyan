package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Player {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="playerId")
	public int playerId;
	@Column(name="firstName")
	public String firstName;
	@Column(name="lastName")
	public String lastName;
	@Column(name="phoneNumber")
	public String phoneNumber;
	@Column(name="screenName")
	public String screenName;
	@Column(name="teamId")
	public int teamId;
	
	
	
	
	
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}






	public Player(int playerId, String firstName, String lastName, String phoneNumber, String screenName, int teamId) {
		super();
		this.playerId = playerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.screenName = screenName;
		this.teamId = teamId;
	}






	public int getPlayerId() {
		return playerId;
	}






	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}






	public String getFirstName() {
		return firstName;
	}






	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}






	public String getLastName() {
		return lastName;
	}






	public void setLastName(String lastName) {
		this.lastName = lastName;
	}






	public String getPhoneNumber() {
		return phoneNumber;
	}






	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}






	public String getScreenName() {
		return screenName;
	}






	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}






	public int getTeamId() {
		return teamId;
	}






	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	
	
}
