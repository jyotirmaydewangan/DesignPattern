package com.dewangan.jyotirmay.behavioral.iterator;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public interface ChannelCollection {
    public void addChannel(Channel channel);
    public void removeChannel(Channel channel);
    public ChannelIterator iterator(ChannelTypeEnum channelType);
}
