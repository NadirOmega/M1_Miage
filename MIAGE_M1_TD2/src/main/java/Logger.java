


public class Logger {
	private  boolean isActive =true;

	public  void log(Object o,String msg) {
		if (this.isActive) {
			String temp = o.getClass().getName();
			String messageFinal=new StringBuilder("Le nom de class est : ")
					.append(temp)
					.append(" le message de log est : ")
					.append(msg).toString();
			System.out.println(messageFinal);

		}

	}
}
