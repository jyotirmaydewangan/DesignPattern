package com.dewangan.jyotirmay.behavioral.iterator;

/**
 * Created by jyotirmay.d on 01/10/17.
 */
public class Channel {
    private double frequency;
    private ChannelTypeEnum channelType;

    public double getFrequency() {
        return this.frequency;
    }

    public ChannelTypeEnum getChannelType() {
        return this.channelType;
    }

    public Channel(double frequency, ChannelTypeEnum channelType){
        this.frequency = frequency;
        this.channelType = channelType;
    }

    public String toString(){

        return "Chanal Type = " + getChannelType().name() + " Frequency = " + getFrequency();
    }

}
