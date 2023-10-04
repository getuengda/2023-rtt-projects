package protestclasscheck;

public class classA {

	void ETL() {
        String E = "mySQL";
        String T = "Sqoop";
        String L = "hdfs";
        System.out.println(E + T + L);
    };

    void ETL(String ETL) {
        System.out.println(ETL.toUpperCase());
    }
    void ETL(String E, String T, String L) {
        System.out.println(E + T + L);
    }

}
