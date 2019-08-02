package com.xiafei.rpc.server.service;

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
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHi(final String name) {
        return "hello " + name;
    }
}
