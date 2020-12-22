package com.jerseyproject.JerseyDemo2;

public class City
{
	private int cityId;
	private String cityName;
	
	public City() {}
	public City(int i, String cityName) {
		super();
		this.cityId = i;
		this.cityName = cityName;
	}
	
	public int getCityId() {
		return cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
	
	

}
