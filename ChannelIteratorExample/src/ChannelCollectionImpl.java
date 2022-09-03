import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection{
    private List<Channel> channelList;

    public ChannelCollectionImpl() {
        this.channelList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        channelList.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        channelList.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelType type) {
        return new ChannelIteratorImpl(type);
    }

    private class ChannelIteratorImpl implements ChannelIterator {
        private ChannelType type;
        private int position;

        public ChannelIteratorImpl(ChannelType type) {
            this.type = type;
        }

        @Override
        public boolean hasNext() {
            while (position < channelList.size()){
                Channel channel = channelList.get(position);
                if (channel.getType().equals(type)){
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel channel = channelList.get(position);
            position++;
            return channel;
        }
    }
}
