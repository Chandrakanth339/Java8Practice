package functionalinterfaceexample;

public class FunctionalInterfaceImpl implements FunctionalInter,
		FunctionalInter2 {

	@Override
	public final Number getStr() {
		// TODO Auto-generated method stub
		System.out.println("BAM...");
		return Double.valueOf(3d);
	}

}
