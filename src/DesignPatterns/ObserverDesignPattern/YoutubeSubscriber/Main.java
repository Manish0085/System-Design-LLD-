package DesignPatterns.ObserverDesignPattern.YoutubeSubscriber;

public class Main{


    public static void main(String[] args) {
        Subscribable subscribable1 = new YoutubeChannel1();
        Subscribable subscribable2 = new YoutubeChannel2();

        NotifySubscriber user1 = new User1("xyz1@gmail.com", subscribable1, "codehelp");
        NotifySubscriber user2 = new User2("xyz2@gmail.com", subscribable2, "concept and coding");
        NotifySubscriber user3 = new User3("xyz3@gmail.com", subscribable1, "apna college");

        subscribable1.addSubscriber(user1);
        subscribable1.addSubscriber(user2);
        subscribable2.addSubscriber(user3);

        subscribable1.setVideoCount(2);

    }
}
