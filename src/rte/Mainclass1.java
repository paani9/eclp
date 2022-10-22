package rte;
class Email
{private int pwd=23455;

public int getpwd() {
	// TODO Auto-generated method stub
	return pwd;
}
public void setpwd(int pwd) {
	// TODO Auto-generated method stub
	this.pwd=pwd;
}

}

public class Mainclass1 {
public static void main(String[] args)
{ Email e1=new Email();
System.out.println(e1.getpwd());
e1.setpwd(7888);
System.out.println(e1.getpwd());
}
}
