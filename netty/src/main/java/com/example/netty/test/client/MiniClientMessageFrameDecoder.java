package com.example.netty.test.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;
import java.util.List;

/**
 * mini狼设备报文转换对象
 *
 * @author duanyuhui Email:duanyuhui@jd.com
 * @date 2019/3/10
 */
public class MiniClientMessageFrameDecoder extends ByteToMessageDecoder {
    private static Logger logger = LoggerFactory.getLogger(MiniClientMessageFrameDecoder.class);

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf buffer, List<Object> out) {
        String str = "客户端接收报文：" + getStringValueByLength(buffer, buffer.readableBytes());
        System.out.println(str);
        out.add(str);
    }

    public static String getStringValueByLength(ByteBuf source, int length) {
        if (length == 0) {
            return null;
        }
        try {
            ByteBuf byteBuf = source.slice(source.readerIndex(), length);
            String dest = bufToString(byteBuf);
            source.readerIndex(source.readerIndex() + length);
            return dest;
        } catch (IllegalStateException e) {
            throw new RuntimeException("Cannot decode string as UTF8" + e);
        }
    }

    public static String bufToString(ByteBuf buf) {
        return buf.toString(Charset.forName("UTF-8"));
    }


}
