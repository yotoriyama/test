public class Test1{
public static void main(String[] args){
Person p = new Person();

Person saburo=new Person();
saburo.name="saburo";
saburo.age=0;
System.out.println(saburo.name);
System.out.println(saburo.age);

Person 名前なし=new Person();
名前なし.name="名前なし";
名前なし.age=25;
System.out.println(名前なし.name);
System.out.println(名前なし.age);

Person hanako=new Person("hanako",17);
System.out.println(hanako.name);
System.out.println(hanako.age);



}
}

