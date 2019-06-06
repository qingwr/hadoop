package com.dasijiaoyu.qwr;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

public class Starter {

    public static void main(String[] args) throws IOException {
        RPC.Builder bulder = new RPC.Builder(new Configuration());
        bulder.setBindAddress("hadoop1").setPort(10000)
                .setProtocol(LoginServiceInterface.class).setInstance(new LoginServiceImpl());
        RPC.Server server = bulder.build();
        server.start();
    }
}
