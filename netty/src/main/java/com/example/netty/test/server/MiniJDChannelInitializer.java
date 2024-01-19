package com.example.netty.test.server;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

import java.nio.charset.Charset;

/**
 * 服务端过滤器，如编解码和心跳的设置
 * User: duanyuhui
 * Date: 2018/12/14
 * Time: 10:35
 * To change this template use File | Settings | File and CodeTemplates.
 */

public class MiniJDChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast("debug", new LoggingHandler(LogLevel.DEBUG));
        // 通过 分隔符 拆分收到的报文。
        pipeline.addLast("delimiterDecoder", new DelimiterBasedFrameDecoder(1024,
                Unpooled.copiedBuffer("<".getBytes()),
                Unpooled.copiedBuffer(">".getBytes())));
        // 解析帧
        pipeline.addLast(new StringDecoder(Charset.forName("UTF-8")));
        pipeline.addLast(new StringEncoder(Charset.forName("UTF-8")));
//        pipeline.addLast("frameDecoder", new MiniMessageFrameDecoder());
        pipeline.addLast("frameEncoder", new MiniMessageFrameEncoder());
     
        pipeline.addLast("executor", new MiniMessageHandler());
    }
}
