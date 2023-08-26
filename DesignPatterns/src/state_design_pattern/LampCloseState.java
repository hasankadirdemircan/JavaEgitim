package state_design_pattern;

public class LampCloseState implements LampState{
    @Override
    public void onOpen() {
        System.out.println("Lamba kapalı fakat şuan açık duruma/state geçiyor..");
    }

    @Override
    public void onClose() {
        System.out.println("Lambayı kapatmaya çalışıyorsun fakat zaten kapalı..");
    }
}
