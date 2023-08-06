package enum_example03;

//Buradan sonrası başka bir class


public enum Employee {

    FULL_TIME(1), PART_TIME(2), PROJECT_BASE(3);

    private int key;

    private Employee(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

}