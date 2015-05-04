package com.zzti.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zzti.bean.ListResult;
import com.zzti.bean.Result;
import com.zzti.bean.Class;
import com.zzti.bean.TResult;

@Path("/class")
public class ClassResource {

	@GET
	@Path("/hello")	
	public String test()
	{
		return "Hello Jersey....";		
	}
	/*
	 * Add Class
	 */
	@POST
	@Path("/add")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces("application/json;charset=utf-8")
	public Result classAdd(Class data) 
	{
		return new com.zzti.dao.Class().add(data);
	}
	
	/*
	 * Update Class
	 */
	@POST
	@Path("/update")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces("application/json;charset=utf-8")
	public Result classUpdate(Class data)
	{
		return new com.zzti.dao.Class().update(data);
	}
	
	/*
	 * Delete Class
	 */
	@GET
	@Path("/delete/{id}")
	@Produces("application/json;charset=utf-8")
	public Result classDelete(@PathParam("id") int id)
	{
		Class data = new Class(id);
		return new com.zzti.dao.Class().delete(data);
	}
	/*
	 * Delete Class
	 */
	@POST
	@Path("/delete")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces("application/json;charset=utf-8")
	public Result classDelete(Class data)
	{
		return new com.zzti.dao.Class().delete(data);
	}
	
	/*
	 * get single model by id
	 */
	@GET
	@Path("/getmodel/{id}")
	@Produces("application/json;charset=utf-8") 
	public TResult<Class> classGetSingle(@PathParam("id") int id)
	{
		System.out.println(id);
		Class data = new Class(id);
		return new com.zzti.dao.Class().getModel(data);		
	}
	
	/*
	 * get single model
	 */
	@POST
	@Path("/getmodel")
	@Consumes({MediaType.APPLICATION_FORM_URLENCODED})
	@Produces("application/json;charset=utf-8")
	public TResult<Class> classGetModel(Class data)
	{
		return new com.zzti.dao.Class().getModel(data);
	}
	
	
	/*
	 * get class list
	 */
	@GET
	@Path("/list")
	@Produces("application/json;charset=utf-8")
	public ListResult<Class> classGetList()
	{
		return new com.zzti.dao.Class().getList();
		
	}
}
