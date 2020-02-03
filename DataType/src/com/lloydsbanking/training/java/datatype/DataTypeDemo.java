package com.lloydsbanking.training.java.datatype;

public class DataTypeDemo {
	
	public static String byteDemo = "com.lloydsbanking.training.java.datatype.ByteDemo";
	public static String shortDemo = "com.lloydsbanking.training.java.datatype.ShortDemo";
	public static String integerDemo = "com.lloydsbanking.training.java.datatype.IntegerDemo";
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// byte
//		byte byteVariable = 127;
//		System.out.println("Byte min value : " + Byte.MIN_VALUE);
//		System.out.println("Byte max value : " + Byte.MAX_VALUE);
		
		ClassLoader classLoader = DataTypeDemo.class.getClassLoader();
		try {
			DataTypeInterface classDataType = (DataTypeInterface) classLoader.loadClass(byteDemo).newInstance();
			classDataType.print();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
