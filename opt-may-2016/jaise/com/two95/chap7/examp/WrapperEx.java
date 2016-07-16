package com.two95.chap7.examp;

public class WrapperEx {
	public static void main(String args[]) {
		int i = 10;
		String val = "1045.33";
		int k;
		Integer ii = new Integer(i);
		k = ii.intValue();
		System.out.println("k value " + k);
		double vval = Double.parseDouble(val);
		System.out.println("double value from val string variable: " + vval);
		ii = null;// setting object to null
		int j = WrapperEx.add(ii);
		System.out.println(" j value is:" + j);
	}

	static int add(Integer ob) throws java.lang.NullPointerException {
		try {
			if (ob != null) {
				int val = ob.intValue() + 100;
				return val;
			}throw new NullPointerException();
			// if i don't want to terminate code execution and also don't want to handle the exception
		} catch (NullPointerException ne) {
			ne.printStackTrace();
			return 1;
		}
	}

}
