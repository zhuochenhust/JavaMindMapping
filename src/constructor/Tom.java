package constructor;

/**
 * 构造方法调用构造方法，用this
 * 当使用this关键字时，它意味着“这个对象”或者“当前对象”，并且它自身产生对当前对象的引用。在一个构造函数中，当给传递给它一个参数列表时
 * 它将直接的调用能够匹配这个参数列表的构造函数。因此，我么可以直接的调用其它构造函数
 * */
public class Tom {
	int age = 0;
	String name = "";
 
	Tom(int a){
		age = a;
		System.out.println("age:" + age);
	}
 
	Tom(String n){
		name = n;
		System.out.println("name:" + name);
	}
 
	Tom(int a, String n){
		this(a);
		/*
		 * 为什么当前构造函数name赋值不可以调用对应的构造方法呢？
		 * 尽管可以在构造函数中调用构造函数，但是只可以调用一次，并且构造函数的调用必须排在第一位，否则将会出现编译时错误。
		 * */
		this.name = n;
		System.out.println("both!");
	}

}
