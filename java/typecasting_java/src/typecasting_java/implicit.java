package typecasting_java;

public class implicit {
	public static void main(String[] args) {
     /*
      * type casting:
      * ==========
      * converting one data type to another datatype
      * "1"-->
      * 1.implicit:auto conversion by jvm
      * byte--->short-int-long-float
      * 2.explicit:manually need to 
      * double-float-long-short
      * syntax:(datatype)
      */
		int marks=3000;
		System.out.println("int:"+marks);
		
		long marks1=marks;
		System.out.println("long:"+marks1);
}
}