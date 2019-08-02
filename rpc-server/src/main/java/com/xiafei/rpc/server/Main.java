package com.xiafei.rpc.server;

import com.xiafei.rpc.server.center.Server;
import com.xiafei.rpc.server.center.ServerImpl;
import com.xiafei.rpc.server.service.HelloService;
import com.xiafei.rpc.server.service.HelloServiceImpl;

import java.io.IOException;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/31</P>
 * <P>UPDATE DATE: 2018/5/31</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class Main {

    public static void main(String[] args) {
        Server server = new ServerImpl(8099);
        try {
            server.register(HelloService.class,HelloServiceImpl.class);
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
