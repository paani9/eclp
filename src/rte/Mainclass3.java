package rte;
class Adhar
{private String name="avani";

public String getname() {
	// TODO Auto-generated method stub
	return name;
}
public void setname(String name) {
	// TODO Auto-generated method stub
	this.name=name;
}

}

public class Mainclass3 {
public static void main(String[] args)
{ Adhar e1=new Adhar();
System.out.println(e1.getname());
e1.setname("Pavani");
System.out.println(e1.getname());
}
}
