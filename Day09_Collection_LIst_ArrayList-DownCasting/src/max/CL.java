package max;

import java.util.List;

public class CL {

    public static void main(String[] args) {

        EmpList empList = new EmpList();
        List<Object> list = empList.getEmp();

        for (Object q : list) {

            if (q instanceof Emp) {
                Emp e = (Emp) q;
                System.out.println( e.getEid() + " " + e.getName() + " " + e.getAdd()
                );

            } else if (q instanceof Manager) {
                Manager m = (Manager) q;
                System.out.println(m.mid + " " + m.name);

            } else if (q instanceof String) {
                System.out.println(q);
            }
        }
    }
}
