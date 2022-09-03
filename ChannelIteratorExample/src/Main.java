public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel(100.7, ChannelType.ENGLISH);
        Channel channel1 = new Channel(99.1, ChannelType.GERMAN);
        Channel channel2 = new Channel(97.2, ChannelType.GERMAN);
        Channel channel3 = new Channel(105.3, ChannelType.ENGLISH);


        ChannelCollection collection = new ChannelCollectionImpl();

        collection.addChannel(channel);
        collection.addChannel(channel1);
        collection.addChannel(channel2);
        collection.addChannel(channel3);

        ChannelIterator channelIterator = collection.iterator(ChannelType.GERMAN);

        while (channelIterator.hasNext()){
            System.out.println(channelIterator.next());
        }
    }
}
