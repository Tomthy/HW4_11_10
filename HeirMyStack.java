/*名字:王懷謙
 *學號:U10316039
 *ex:11_10
 */


import java.util.*;


class HeirMyStack extends ArrayList<Object>{

	//判斷陣列是否為空
	public boolean isEmpty(){
		return super.isEmpty();
	}
	
	//把元素加進ArrayList
	public void push(String o){
		super.add(o);
	}
	
	//得到陣列大小
	public int getSize(){
		return super.size();
	}
	
	//回傳陣列最上層的元素
	public Object peek(){
		return super.get(getSize() - 1);
	}
	
	//取出元素後刪除
	public Object pop(){
		Object o = super.get(getSize()-1);
		super.remove(getSize()-1);
		return o;
	}
}
