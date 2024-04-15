package com.teo.hell_web_app.resful;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.teo.hell_web_Dao.entities.productdao1;
import com.teo.hell_web_Dao.entities.productdienthoai;
import com.teo.hell_web_Dao.entities.productlaptop;

@Path("/productslaptop")

public class ResAPILaptop {
	productlaptop productDao= new productlaptop();
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public Map<String, Object> getProduct_JSON() {
	        Map<String, Object> result = productDao.getLatestProductLaptop();
	        return result;
	    }
}