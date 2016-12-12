/*
要求：开发一个简单java类，里面包含有雇员编号、姓名、职位、基本工资、佣金；
类名称必须存在有意义，例如：Book、Emp；
类之中所有的属性必须private封装，封装后的属性必须提供有setter、getter方法；
类之中可以提供有做任意多个构造方法，但是必须保留一个无参的构造方法；
类之中不允许出现任何输出语句，所有信息输出必须交给被调用处输出；
类之中需要提供有一个取得对象完整信息的方法，暂定为：getInfo（）；
*/

class Emp{//定义一个有意义的类
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private double comm;

	public Emp(){}

	public Emp(int eno, String ena,String j,double s,double c){
	empno = eno;
	ename = ena;
	job = j;
	sal = s;
 	comm = c ;
	}

	public void setEmpno(int e){

		empno = e ;
		}
	public void setEname(String e){
		ename = e ;
		}
	public void setJob(String j){
		job = j;
		}
	public void setSal(double s){
		sal = s ;
		}
	public void setComm(double c){
		comm = c;
		}


	public int getEmpno(){
		return empno;
		}
	public String getEname(){
		return ename;
		}
	public String getJob(){
		return job ;
		}
	public double getSal(){
		return sal ;
		}
	public double getComm(){
		return comm ;
		}

	public String getInfo(){
	return 	"雇员编号："+ empno +"\n"+
		"雇员姓名："+ ename +"\n"+
		"雇员职位："+ job  +"\n" +
		"基本工资："+ sal +"\n" +
		"佣     金" +comm ;


		}


}


public class TestDemo{
	public static void main(String args[]){
	Emp e = new Emp(777,"SMITH","CLERK",800.0,1.0);
	System.out.println(e.getInfo());
	e.setEname("ALLEN");
	System.out.println("姓名" +e.getEname());
	





	}

}
