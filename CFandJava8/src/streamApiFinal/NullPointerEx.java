package streamApiFinal;

import java.util.Optional;

public class NullPointerEx {

	public static void main(String[] args) {
		String[] enames = new String[10];
		enames[0] ="Rahul Gandhi";
		enames[1] ="Sonai Gandhi";
		enames[2] ="Priyanka Gandhi";
		//System.out.println(enames[300]);
		//System.out.println(enames[3].toUpperCase());
		Optional opt = Optional.ofNullable(enames[5]);
		if(opt.isPresent()) {
				System.out.println(opt.get());
		}else {
			System.out.println("Value not exits");
		}

	}

}
