package com.jerseyproject.JerseyDemo2;

import java.util.*;
import java.util.stream.Collectors;

public class CityDao 
{
	List<City> cities;
	public CityDao() {
		
		cities=new ArrayList<>();
		City city1=new City(101, "Lucknow");
		City city2=new City(102, "patna");
		City city3=new City(103, "varansi");
		City city4=new City(104, "gorakhpur");
		
		cities.addAll(Arrays.asList(city1,city2,city3,city4));
	}
	
	public List <City> getAllCity()
	{
		return cities;
	}
	public City getCityById(int cityId)
	{
		return cities.stream().filter(x->x.getCityId()==cityId).collect(Collectors.toList()).get(0);
	}
	
	public void createCity(City city)
	{
		cities.add(city);
	}
	public List <City> removeCity(int id)
	{
		 cities.removeIf(x -> x.getCityId() ==id);
		 return cities;
	}
	
	public List<City> updateCity(int id,String cityName)
	{
		 cities.stream().filter(x->x.getCityId()==id)
		 .collect(Collectors.toList()).get(0).setCityName(cityName);
		 return cities;
		
	}

}
