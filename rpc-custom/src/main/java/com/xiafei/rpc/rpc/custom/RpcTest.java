package com.xiafei.rpc.rpc.custom;

import com.xiafei.rpc.server.center.Server;
import com.xiafei.rpc.server.center.ServerImpl;
import com.xiafei.rpc.server.service.HelloService;
import com.xiafei.rpc.server.service.HelloServiceImpl;

import java.io.IOException;
import java.net.InetSocketAddress;

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
public class RpcTest {

    public static void main(String[] args) throws IOException {
        HelloService service = RpcClient.getRemoteProxyObj(HelloService.class, new InetSocketAddress("localhost", 8099));
        System.out.println(service.sayHi("test"));
    }
}
