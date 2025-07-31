package polymorphism_override;

public class OverrideDemo {
	public static void main(String[] args) {
		//late binding ,dynamic binding ,and runtime polymorphism
		//base class
		PLTraining p1=new PLTraining();
		p1.session("full stack developer ");
		//jfs object
		p1=new JFS();
		p1.session("method overriding");
		//python object
		p1=new Python();
		p1.session("Method overriding");

	}


	}


