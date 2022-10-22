
package rte;
class Add
{private String pwd="Java9";

public String getpwd() {
	// TODO Auto-generated method stub
	return pwd;
}
public void setpwd(String pwd) {
	// TODO Auto-generated method stub
	this.pwd=pwd;
}

}

public class Mainclass5 {
public static void main(String[] args)
{ Add e2=new Add();
System.out.println(e2.getpwd());
String x=e2.getpwd();
e2.setpwd("123456");
System.out.println(e2.getpwd());
System.out.println(e2.getpwd()+x);
}
}

