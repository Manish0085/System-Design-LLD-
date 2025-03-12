package DesignPatterns.ObserverDesignPattern.YoutubeSubscriber;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel1 implements Subscribable{

    List<NotifySubscriber> subscriberList = new ArrayList<>();
    int videoCount = 0;

    @Override
    public void addSubscriber(NotifySubscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(NotifySubscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifyUser() {
        for (NotifySubscriber sub: subscriberList){
            sub.update();
        }
    }

    public void setVideoCount(int num){
        if(videoCount == 0){
            notifyUser();
        }
        videoCount += num;
    }

    public int getVideoCount(){
        return videoCount;
    }
}
