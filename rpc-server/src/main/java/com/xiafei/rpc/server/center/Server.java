package com.xiafei.rpc.server.center;

import java.io.IOException;

/**
 * <P>Description: 服务中心控制接口. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE DATE: 2018/5/31</P>
 * <P>UPDATE DATE: 2018/5/31</P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public interface Server {

    public void stop();

    public void start() throws IOException;

    public void register(Class serviceInterface, Class impl);

    public boolean isRunning();

    public int getPort();
}
