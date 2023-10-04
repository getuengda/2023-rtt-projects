package protestclasscheck;

import java.util.StringJoiner;

public class main {

	public static void main(String[] args) {
		String E = "extraction1";
        String T = "transformation2";
        String L = "loading3";

        classA obj = new classA();
        obj.ETL(E + T + L);
        
	}

}
