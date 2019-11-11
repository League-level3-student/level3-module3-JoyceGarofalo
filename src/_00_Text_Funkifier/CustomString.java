package _00_Text_Funkifier;

public class CustomString extends SpecialString{

	public CustomString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String h = "";
		for (int i = 0; i < s.length(); i++) {
			if(i%3 == 0) {
				h += s.toLowerCase().charAt(i);
			}
			else {
				h += s.toUpperCase().charAt(i);
			}
		}
		return h;
	}
	
}