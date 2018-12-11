public class Element<E>
{
    public E value;
    public Element<E> next;
    public Element<E> prev;

    public Element(E value)
    {
        this.value = value;
    }
    @Override
    public String toString(){
        return this.value.toString();
    }
}

