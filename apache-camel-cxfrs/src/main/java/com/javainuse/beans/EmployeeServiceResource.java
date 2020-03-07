package com.javainuse.beans;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class EmployeeServiceResource {

	public EmployeeServiceResource() {
	}

	@GET
	@Path("/employeesB/{name}/")
	public String getCustomer(@PathParam("name") String name) {
		return "Welcome Baba" + name;
	}

}