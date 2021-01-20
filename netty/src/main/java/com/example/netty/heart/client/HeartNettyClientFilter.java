package com.example.netty.heart.client;

/**
 * create by yuexingzhong on 2021/1/12 17:02
 */

import java.util.concurrent.TimeUnit;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.timeout.IdleStateHandler;

/**
 * 客户端过滤器，如编解码和心跳的设置
 *
 * @author Administrator
 */
public class HeartNettyClientFilter extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline ph = ch.pipeline();
        //因为服务端设置的超时时间是5秒，所以客户端设置4秒
        ph.addLast(new IdleStateHandler(0, 4, 0, TimeUnit.SECONDS));

        // 解码和编码，应和服务端一致
        ph.addLast(new StringDecoder());
        ph.addLast(new StringEncoder());

        //处理客户端的业务逻辑
        ph.addLast(new HeartNettyClientHandler());
    }
}

