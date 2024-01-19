package com.example.netty;

import com.example.netty.heart.server.NettyUdpHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;

/**
 * create by yuexingzhong on 2021/1/7 9:52
 */
public class NettyServer {

    public static void main(String[] args) throws InterruptedException {

        //表示服务器连接监听线程组，专门接受 accept 新的客户端client 连接
        EventLoopGroup bossLoopGroup = new NioEventLoopGroup();
        try {
            //1、创建netty bootstrap 启动类
            Bootstrap serverBootstrap = new Bootstrap();
            //2、设置boostrap 的eventLoopGroup线程组
            serverBootstrap = serverBootstrap.group(bossLoopGroup);
            //3、设置NIO UDP连接通道
            serverBootstrap = serverBootstrap.channel(NioDatagramChannel.class);
            //4、设置通道参数 SO_BROADCAST广播形式
            serverBootstrap = serverBootstrap.option(ChannelOption.SO_BROADCAST, true);
            //5、设置处理类 装配流水线
            serverBootstrap = serverBootstrap.handler(new NettyUdpHandler());
            //6、绑定server，通过调用sync（）方法异步阻塞，直到绑定成功
            ChannelFuture channelFuture = serverBootstrap.bind(10070).sync();
            //7、监听通道关闭事件，应用程序会一直等待，直到channel关闭
            channelFuture.channel().closeFuture().sync();
        } catch (Exception e) {
        } finally {
            //8 关闭EventLoopGroup，
            bossLoopGroup.shutdownGracefully();
        }

    }
}
