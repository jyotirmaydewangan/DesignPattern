package com.dewangan.jyotirmay.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class ChannelCollectionImpl implements ChannelCollection {
    private List<Channel> channelList;

    public ChannelCollectionImpl(){
        this.channelList = new ArrayList<Channel>();
    }

    public void addChannel(Channel channel) {
        this.channelList.add(channel);
    }

    public void removeChannel(Channel channel) {
        this.channelList.remove(channel);
    }

    public ChannelIterator iterator(ChannelTypeEnum channelType) {
        return new ChannelIteratorImp(channelType, this.channelList);
    }


    private class ChannelIteratorImp implements ChannelIterator {
        private ChannelTypeEnum channelType;
        private List<Channel> channelList;
        private int position;

        public ChannelIteratorImp(ChannelTypeEnum channelType, List<Channel> channelList){
            this.channelType = channelType;
            this.channelList = channelList;
            this.position = 0;
        }

        public boolean hasNext() {
            while(position < channelList.size()){
                Channel ch = channelList.get(position);
                if(ch.getChannelType().equals(this.channelType) || this.channelType.equals(ChannelTypeEnum.ALL)){
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        public Channel next() {
            Channel ch = channelList.get(this.position);
            this.position++;
            return ch;
        }
    }
}
