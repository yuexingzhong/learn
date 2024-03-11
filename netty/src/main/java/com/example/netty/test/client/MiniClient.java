package com.example.netty.test.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.*;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollServerSocketChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * desc: 服务端初始类
 * User: YueXZ
 * DateTime: 2024/1/4 16:24
 * Version：1.0.0
 */

public class MiniClient {


    public static void main(String[] args) throws InterruptedException {

        EventLoopGroup group = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .handler(new MiniClientJDChannelInitializer());

        ChannelFuture future = bootstrap.connect("127.0.0.1", 10090).sync();
        Channel channel = future.channel();
        channel.writeAndFlush("client send");

        future.channel().closeFuture().sync();

        System.out.println(1312);


    }
}
