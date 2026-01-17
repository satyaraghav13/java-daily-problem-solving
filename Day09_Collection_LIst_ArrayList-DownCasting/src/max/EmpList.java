package max;

import java.util.ArrayList;
import java.util.List;

public class EmpList {

    public List<Object> getEmp() {

        List<Object> list = new ArrayList<>();

        Emp e = new Emp();
        e.setEid(11);
        e.setName("raja");
        e.setAdd("Noida");
        list.add(e);

        list.add(new Manager(100, "kalu"));

        Emp e1 = new Emp();
        e1.setEid(12);
        e1.setName("aja");
        e1.setAdd("Noida");
        list.add(e1);

        list.add("ram is good");

        Emp e2 = new Emp();
        e2.setEid(14);
        e2.setName("rahul");
        e2.setAdd("Delhi");
        list.add(e2);

        list.add(new Manager(111, "ok"));

        return list;
    }
}
