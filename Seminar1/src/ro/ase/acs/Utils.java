package ro.ase.acs;

public class Utils {

	public static int function(int v[], int k) {
		int j=0;
		
		if(v.length>0) {
			int i=v[0];

			for(k=0;k<v.length;k++) {
				if(i==v[k]) {
					j++;
				}
				else if(i>v[k]) {
					i=v[k];
					j=1;
				}
			}
			
		}
	
		return j;
	}
	
}
