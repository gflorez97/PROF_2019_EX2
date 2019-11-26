package GonzaloFlorezArias.PROF_2019_EX2;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

	public static List<Integer> primos (int n) throws EntradaInvalida{
		
		//Entrada inválida
		if(n < 2) {
			throw new EntradaInvalida();
		}
		
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
            while (n%i==0) {
                res.add(i);
                n = n/i;
            }
        }	
		return res;
	}

}
