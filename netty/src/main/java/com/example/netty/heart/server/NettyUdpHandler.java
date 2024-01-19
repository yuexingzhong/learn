package com.example.netty.heart.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;

/**
 * desc:
 * User: YueXZ
 * DateTime: 2024/1/5 18:24
 * Version：1.0.0
 */
public class NettyUdpHandler extends SimpleChannelInboundHandler<DatagramPacket> {


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, DatagramPacket packet) throws Exception {
        try {
            ByteBuf byteBuf = packet.content();
            String str = byteBuf.toString(CharsetUtil.UTF_8);
            System.out.println("receive str: " + str);

            // res
            String resStr = "ok";
            byte[] resBytes = resStr.getBytes("UTF-8");
            DatagramPacket resData = new DatagramPacket(Unpooled.copiedBuffer(resBytes), packet.sender());
            ctx.writeAndFlush(resData);
        } catch (Exception e) {
        }
    }
}
