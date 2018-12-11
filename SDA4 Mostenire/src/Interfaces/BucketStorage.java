package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class BucketStorage implements StoragePersons {

    List<String> barbati = new ArrayList<>();
    List<String> femei = new ArrayList<>();


    @Override
    public String add(String cnp)
    {
       if (cnp.startsWith("1")) {
           barbati.add(cnp);
       }
       else if (cnp.startsWith("2")) {
           femei.add(cnp);

       }
       return "Error!";
    }

    @Override
    public void remove(String cnp) {
        if (cnp.startsWith("1")) {
            barbati.remove(cnp);
        }
        else if (cnp.startsWith("2")) {
            femei.remove(cnp);

        }


    }

    @Override
    public Boolean exists(String cnp) {
        if (cnp.startsWith("1")){
            return barbati.contains(cnp);
        }
        else if (cnp.startsWith("2")) {
            return femei.contains(cnp);
        }
        return null;
    }

    @Override
    public List<String> list() {
        List<String> ret = new ArrayList<>();
        ret.addAll(femei);
        ret.addAll(barbati);
        return ret;

    }
    @Override
    public String toString() {
        return "barbati: " +barbati + " femei: " +femei;
    }
}
