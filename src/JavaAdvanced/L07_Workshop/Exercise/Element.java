package JavaAdvanced.L07_Workshop.Exercise;

public class Element {

    public int value;
    public Element prev;

    public Element next;

    public Element(int value, Element prev, Element next){
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }

    public String toString(){
        return String.valueOf(this.value);
    }


}
