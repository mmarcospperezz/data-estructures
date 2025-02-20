
public class MyNode {
    private double value;
    private MyNode next;

    public MyNode(double value, MyNode next) {
        this.value = value;
        this.next = next;
    }

    public Double get(int i) {
        if(i == 0) {
            return value;
        } else {
            if(next == null) {
                return null;
            } else {
                return next.get(i - 1);
            }
        }
    }

    public void add(MyNode node) {
        if( next == null) {
            next = node;
        } else {
            next.add(node);
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }



}
