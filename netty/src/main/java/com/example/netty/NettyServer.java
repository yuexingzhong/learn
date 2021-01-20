package com.example.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;

/**
 * create by yuexingzhong on 2021/1/7 9:52
 */
public class NettyServer {

    public static void main(String[] args) throws InterruptedException {

        ServerBootstrap server = new ServerBootstrap();
        EventLoopGroup parentGroup = new NioEventLoopGroup();
        EventLoopGroup childGroup = new NioEventLoopGroup();
        server.group(parentGroup, childGroup);


        server.option(ChannelOption.SO_BACKLOG, 128);

        server.channel(NioServerSocketChannel.class);

        server.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            protected void initChannel(SocketChannel ch) throws Exception {
                ch.pipeline().addLast(new DelimiterBasedFrameDecoder(Integer.MAX_VALUE, Delimiters.lineDelimiter()[0]));
                ch.pipeline().addLast(new SimpleServerHandler());
            }

        });

        //第4步绑定8080端口
        ChannelFuture future = server.bind(40000).sync();
        if (!future.awaitUninterruptibly().isSuccess()) {
            throw new InterruptedException("Failed to bind port:" + 40000);
        }
        //当通道关闭了，就继续往下走
        future.channel().closeFuture().sync();
    }
}
