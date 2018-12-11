package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListStorage implements StoragePersons
{
    ArrayList<String> list = new ArrayList<>();
    public String add (String cnp)
    {
        this.list.add (cnp);
        return cnp ;
    }
    public void remove(String cnp)
    {
        this.list.remove(cnp);
    }
    public Boolean exists (String cnp)
    {
        return this.list.contains(cnp);
    }
    public List<String> list ()
    {return this.list;}

    @Override
    public String toString() {
        return this.list.toString();
    }
}
