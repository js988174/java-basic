package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("음악 on");

        volume++;
        System.out.println("볼륨값:" + volume);

        volume++;
        System.out.println("볼륨값:" + volume);

        volume--;
        System.out.println("볼륨값:" + volume);

        System.out.println("플레이어 상태");
        if (isOn) {
            System.out.println("음악 on" + volume);
        } else {
            System.out.println("음악 off");
        }


        isOn = false;
        System.out.println("종료");
    }

}
