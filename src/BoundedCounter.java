public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }

    public void next() {
        if (this.value >= upperLimit) {
            this.value = 0;
        }else {
            this.value++;
        }
    }
        public String toString() {
            if (this.value < 10) {
                return "0" + this.value;
            }
            return "" + this.value;
        }
    public int getValue() {
        // write here code that returns the value
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    }

