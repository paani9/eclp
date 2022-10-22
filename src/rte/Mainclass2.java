
package rte;
class Email1
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

public class Mainclass2 {
public static void main(String[] args)
{ Email1 e2=new Email1();
System.out.println(e2.getpwd());
e2.setpwd("123456");
System.out.println(e2.getpwd());
}
}

