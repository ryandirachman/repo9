public class EkspresiWajah{
	public String respons(){
		return("Perhatikan ekspresi wajah saya");
	}
}
class Gembira extends EkspresiWajah{
	public String respons(){
		return("ha ha ha . .");
	}
}
class Sedih extends EkspresiWajah{
	public String respons(){
		return("hik hk ngee ngee . .");
	}
}
class Marah extends EkspresiWajah{
	public String respons(){
		return("hai kurang ajar!");
	}
}