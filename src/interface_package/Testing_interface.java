package interface_package;

/**
 * 1. 接口里定义的方法必须是public的，即使你不显式地这么做，这些方法实际上也是public的
 * 2. 接口可以被定义成public的，如果不这样，那就只有包内的访问权限
 * 3. 接口中定义的值隐式的是static和final的
 * */
public interface Testing_interface {
	int value = 5; // static & final
	int add(int a, int b); // automatically public
}
