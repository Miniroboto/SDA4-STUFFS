package Interfaces;

import java.util.List;

public interface StoragePersons
{
  public String add (String cnp);
  public void remove(String cnp);
  public Boolean exists (String cnp);
  public List<String> list ();
}
