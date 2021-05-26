package com.netty.heartbeatretry.server.handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class HeartBeatRespHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//        super.channelRead(ctx, msg);
        String heartBeat = (String) msg;
        if (heartBeat != null && heartBeat.equals("clientConnect")) {
            ctx.writeAndFlush("connect");
        } else if (heartBeat != null && heartBeat.equals("clientSend")) {
            System.out.println("receive entity heartBeat");
            System.out.println("send server heartBeat to entity");
            ctx.writeAndFlush("serverSend");
        } else {
            ctx.fireChannelRead(msg);
        }
    }
}
