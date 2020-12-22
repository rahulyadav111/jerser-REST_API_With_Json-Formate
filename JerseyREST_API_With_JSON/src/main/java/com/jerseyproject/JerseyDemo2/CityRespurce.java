package com.jerseyproject.JerseyDemo2;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("city")
public class CityRespurce
{
	CityDao dao=new CityDao();
	@GET
	@Path("getCities")
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> getCity()
	{
		return dao.getAllCity();
		
	}
	@GET
	@Path("getCities/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public City cityById(@PathParam("id") int cityId)
	{
		return dao.getCityById(cityId);
		
	}
	
	@POST
	@Path("addCities")
	@Produces(MediaType.APPLICATION_JSON)
	public List <City> addCity(City city)
	{
		dao.createCity(city);
		return dao.getAllCity();
		
	}
	
	@DELETE
	@Path("getCities/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> removeCity(@PathParam("id") int cityId)
	{
		return dao.removeCity(cityId);
		
	}
	
	@PUT
	@Path("updateCities/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<City> updateCity(@PathParam("id") int cityId,City city)
	{
		return dao.updateCity(cityId,city.getCityName());
		
	}

	

}
