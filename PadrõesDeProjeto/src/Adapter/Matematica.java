package Adapter;
import java.lang.Math;
public class Matematica implements MathAdapter {
	
private static int Log;
private static int Base;

public void setLogAritimo(int L) {
	this.Log = L;
	
}

public void setBASE(int B) {
	this.Base = B;
	
}

public int getbase() {
	
	return Base;
}

public int getLogaritimo() {
	return Log;
	
}
public void Resul() {
	
	System.out.println("O resultado do calculo é  " + Math.log(getLogaritimo())/Math.log(getbase()));
}

}
