public class LampContext {
    private LampState lampState;

    public LampContext() {
        setLampState(new LampCloseState());
      //  LampState lampState1 = new LampCloseState();
    }

    public void onOpen() {
        lampState.onOpen();
        if(lampState instanceof LampCloseState) {
            setLampState(new LampOpenState());
            System.out.println("Lambanın içsel durumu şöyle oldu : " + lampState.getClass().getName());
        }
    }

    public void onClose() {
        lampState.onClose();
        if(lampState instanceof LampOpenState) {
            setLampState(new LampCloseState());
            System.out.println("Lambanın içsel durumu şu oldu : " + lampState.getClass().getName());
        }
    }

    public LampState getLampState() {
        return lampState;
    }

    public void setLampState(LampState lampState) {
        this.lampState = lampState;
    }
}
