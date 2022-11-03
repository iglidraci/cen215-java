public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.channelUp();
        tv1.volumeUp();
        System.out.println("TV1, channel " + tv1.channel + " and volume " + tv1.volume);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.setChannel(10);
        tv2.setVolume(10);
        System.out.println("TV2, channel " + tv2.channel + " and volume " + tv2.volume);
    }
}
