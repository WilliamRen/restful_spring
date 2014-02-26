package com.linuxgt.mobile;

import javax.ws.rs.Path;

/**
 * Created with IntelliJ IDEA.
 * User: murong
 * Date: 14-2-26
 * Time: 下午2:51
 * To change this template use File | Settings | File Templates.
 */
@Path(value = "/sample")
public class weixin implements Iweixin{

    @Override
    public String doGet() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String doPost() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
