
public class Lista<T>
{
    public Element<T> head;

    public Lista()
    {

    }

    public void add(T value)
    {
        Element<T> el = new Element<T>(value);
        if (head == null)
        {
            this.head = el;
            this.head.next = null;
            this.head.prev = null;
        }
        else
        {
            Element<T> iter = this.head;
            while(iter.next != null)
            {
                iter = iter.next;
            }
            iter.next = el;
            el.prev = iter;
            el.next = null;
        }
    }

        public Element<T> remove (Integer pos)
          {Element<T> iter = this.head;
          Integer counter = 0;
          while (iter != null) {
              if (counter.equals(pos)) {
                  break;
              }
              else {
                  counter++;
              }
              iter=iter.next;
          }
          if (counter.equals(pos)){
              //chiar a ajuns la element, nu s-a terminat lista
              if (iter.prev==null){
                  //eliminam capul listei
                  this.head= iter.next;
                  if (this.head!=null) {
                  this.head.prev= null;}

              }
              else if (iter.next == null) {
                  //eliminam ultimul element din lista
                  iter.prev.next= null;
              }
              else {
                  //eliminam un element din mijlocul listei
                  iter.prev.next= iter.next;
                  iter.next.prev= iter.prev;
              }
              return iter;

          }
return null;
            }
//
        public Element<T> get(Integer pos) {
            {
                Element<T> iter = this.head;
                Integer counter = 0;
                while (iter != null) {
                    if (counter.equals(pos)) {
                        break;
                    } else {
                        counter++;
                    }
                    iter = iter.next;
                }
                if (counter.equals(pos)) {
                    return iter;
                }
                return null;
            }
        }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Element<T> iter = this.head;
        while(iter != null)
        {
            sb.append(iter.value );
            if(iter.next != null)
            {
                sb.append(", ");
            }
            iter = iter.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
