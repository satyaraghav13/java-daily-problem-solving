package max;

public class Emp implements Comparable<Emp>{
 int eid;
 String name;
 String add;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
@Override
public int compareTo(Emp e) {
	
	//return name.compareTo(e.getName());
	
	if(eid==e.getEid())
	return 0;
	
	else if(eid>e.getEid())
		return -1;
	else
		return 1;
}
}