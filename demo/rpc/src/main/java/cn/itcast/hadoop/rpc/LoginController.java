package cn.itcast.hadoop.rpc;


import com.dasijiaoyu.qwr.LoginServiceInterface;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

public class LoginController {

    public static void main(String[] args) throws IOException {
        LoginServiceInterface proxy = RPC.getProxy(LoginServiceInterface.class
                , 1l, new InetSocketAddress("hadoop1", 10000), new Configuration());
        String result = proxy.login("Mj", "no 1");
        System.out.println(result);
    }
}
