package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.volumeDown();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        // private 접근 제한자를 설정하여 객체 속성에 접근을 금지함
//        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200;
//        speaker.showVolume();
    }
}
