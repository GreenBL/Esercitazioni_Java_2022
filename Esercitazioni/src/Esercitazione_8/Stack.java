package bin.es8; 
import java.util.ArrayList;

public class Stack{
	private ArrayList<String> pila = new ArrayList<>(100);
	private String lastPushed;
	private String lastPopped;
	
	
	public Stack(){
		(this.pila).ensureCapacity(100);
	}
	
	public void push(String s){
		int size2 = (this.pila).size();
		if(this.isFull() == false && !(this.pila).contains(s)){
			if((this.pila).size() == 0){
				pila.add(0, s);
				System.out.println("\nSuccessfully pushed " + s);
			} else {
				(this.pila).add(0, s);
				this.lastPushed = s;
				System.out.println("\nSuccessfully pushed " + s);
			}
		} else {
			System.out.println("\n\u001B[31mCOULD NOT PUSH " + s + ", stack either full or duplicate object!\u001B[0m");
		}
	}
	
	public String pop(){
		if(this.isEmpty() == false){
			this.lastPopped = (this.pila).get(0);
			(this.pila).remove(0);
			return this.lastPopped;
		}
		return null;
	}
	
	public boolean isEmpty(){
		return pila.isEmpty();
	}
	
	public boolean isFull(){
		if(pila.size() < 100){
			return false;
		}
		return true;
	}
	
	public String toString(){
		String buff = "";
		for(String string: this.pila){
			buff = buff + "\n| " + string + " |\n";
		}
		return buff;
	}
}