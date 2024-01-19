package com.example.netty.test.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * mini狼-发送报文转换编码
 *
 * @author duanyuhui Email:duanyuhui@jd.com
 * @date 2019/3/10
 */
@ChannelHandler.Sharable
public class MiniMessageFrameEncoder extends MessageToMessageEncoder<String> {
    private static Logger logger = LoggerFactory.getLogger(MiniMessageFrameEncoder.class);

    @Override
    protected void encode(ChannelHandlerContext ctx, String msg, List<Object> out) throws Exception {
        String str = msg +"233";
 
        ByteBuf message = Unpooled.copiedBuffer(str, CharsetUtil.UTF_8); 

        out.add(message);
    }
}
