package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String m = "";
		for (int i = 0; i < s.length(); i++) {
			if(i%2 == 0) {
				m += s.toLowerCase().charAt(i);
			}
			else {
				m += s.toUpperCase().charAt(i);
			}
		}
		//System.out.println(s);
		return m;
	}

}
