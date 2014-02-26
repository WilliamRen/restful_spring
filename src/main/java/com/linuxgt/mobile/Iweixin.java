package com.linuxgt.mobile;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created with IntelliJ IDEA.
 * User: murong
 * Date: 14-2-26
 * Time: 下午3:30
 * To change this template use File | Settings | File Templates.
 */
@Path(value = "/sample")
public interface Iweixin {
    @GET
    @Path("/weixin")
    @Produces(MediaType.TEXT_PLAIN)
    public String doGet();

    @POST
    @Path("/weixin")
    @Produces(MediaType.TEXT_PLAIN)
    public String doPost();

}
