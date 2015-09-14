package spring.ioc.test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserHome {
	
	private String username;
	private int age;
	private Home myHome;
	private Home[] homes;
	private List homesList;
	private Set homesSet;
	private Map homesMap;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Home getMyHome() {
		return myHome;
	}

	public void setMyHome(Home myHome) {
		this.myHome = myHome;
	}

	public Home[] getHomes() {
		return homes;
	}

	public void setHomes(Home[] homes) {
		this.homes = homes;
	}

	public List getHomesList() {
		return homesList;
	}

	public void setHomesList(List homesList) {
		this.homesList = homesList;
	}

	public Set getHomesSet() {
		return homesSet;
	}

	public void setHomesSet(Set homesSet) {
		this.homesSet = homesSet;
	}

	public Map getHomesMap() {
		return homesMap;
	}

	public void setHomesMap(Map homesMap) {
		this.homesMap = homesMap;
	}

}
