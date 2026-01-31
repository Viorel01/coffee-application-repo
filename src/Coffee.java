public class Coffee {
    //props
    private int temp;
    private int conc;

    //contructor (init)
    public Coffee (int t, int c) {
    temp = t;
    conc = c;
    }

    //getters

    public int getTemp() {
        return temp;
    }

    public int getConc() {
        return conc;
    }


    //toSttring()
    @Override
    public String toString() {
        return "Coffee{" +
                "temp=" + temp +
                ", conc=" + conc +
                '}';
    }
}
