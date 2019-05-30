package com.dasijiaoyu.demo.io.read;

import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.io.IOUtils;

import java.io.InputStream;
import java.net.URL;

public class HdfsURLCat {

    static {
        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
    }

    public static void main(String[] args){
        InputStream in = null;
        try {
            in = new URL(args[0]).openStream();
//            in = new URL("hdfs://192.168.175.10:9000/demo/nginx/log/temp-access.log").openStream();
            IOUtils.copyBytes(in, System.out, 4096, false);
        }catch (Throwable e){
            System.out.println("usage message hadoop jar io-1.0-SNAPSHOT.jar com.dasijiaoyu.demo.io.read.HdfsURLCat hdfs://host:port/filepath" );
            e.printStackTrace();
        }finally {
            IOUtils.closeStream(in);
        }
    }
}
