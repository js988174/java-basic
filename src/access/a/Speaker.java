package access.a;

public class Speaker {

    int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println(volume);
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println(volume);
    }

}
