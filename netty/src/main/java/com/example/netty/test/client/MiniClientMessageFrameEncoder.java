package com.example.netty.test.client;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.util.CharsetUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * mini狼-发送报文转换编码
 *
 * @author duanyuhui Email:duanyuhui@jd.com
 * @date 2019/3/10
 */
@ChannelHandler.Sharable
public class MiniClientMessageFrameEncoder extends MessageToMessageEncoder<String> {
    private static Logger logger = LoggerFactory.getLogger(MiniClientMessageFrameEncoder.class);

    @Override
    protected void encode(ChannelHandlerContext ctx, String msg, List<Object> out) {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("<")
                .append(msg)
                .append(":back")
                .append(">");
        System.out.println("客户端发送:" + stringBuffer.toString());
        ByteBuf message = Unpooled.copiedBuffer(stringBuffer.toString(), CharsetUtil.UTF_8);
        out.add(message);
    }
}
