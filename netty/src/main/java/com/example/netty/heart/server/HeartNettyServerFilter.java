package com.example.netty.heart.server;

/**
 * create by yuexingzhong on 2021/1/12 17:01
 */
import java.util.concurrent.TimeUnit;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.timeout.IdleStateHandler;

/**
 * 服务端过滤器，如编解码和心跳的设置
 *
 * @author Administrator
 *
 */
public class HeartNettyServerFilter extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel sc) throws Exception {
        ChannelPipeline cp = sc.pipeline();
        cp.addLast(new IdleStateHandler(5, 0, 0, TimeUnit.SECONDS));

        // 解码和编码，应和客户端一致
        cp.addLast(new StringDecoder());
        cp.addLast(new StringEncoder());

        //处理服务端的业务逻辑
        cp.addLast(new HeartNettyServerHandler());
    }
}