package com.dasijiaoyu.demo.io.read;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

import java.io.InputStream;
import java.net.URI;

public class FileSystemCat {

    public static void main(String[] args){
        InputStream in = null;
        try {
//            String uri = args[0];
            String uri = "hdfs://192.168.175.10:9000/demo/nginx/log/temp-access.log";
            Configuration conf = new Configuration();
            FileSystem fs = FileSystem.get(URI.create(uri), conf);
            in = fs.open(new Path(uri));
            IOUtils.copyBytes(in, System.out, 4098, false);
        }catch (Exception e){
            System.out.println("usage message hadoop jar io-1.0-SNAPSHOT.jar com.dasijiaoyu.demo.io.read.FileSystemCat hdfs://host:port/filepath" );
            e.printStackTrace();
        }finally {
            IOUtils.closeStream(in);
        }
    }
}
