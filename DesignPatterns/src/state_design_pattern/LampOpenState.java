package state_design_pattern;

public class LampOpenState implements LampState{
    @Override
    public void onOpen() {
        System.out.println("Lamba açmaya çalışıyorsunuz fakat lamba zaten açıktı.");
    }

    @Override
    public void onClose() {
        System.out.println("Lamba açık fakat şuan kapalı duruma/state geçiyor..");
    }
}
