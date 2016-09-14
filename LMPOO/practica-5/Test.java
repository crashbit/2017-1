public class Test{

	public static void main(String args[]){

		Alumno andrea = new Alumno();
		try{
			andrea.evalua(5);
		}catch(AlumnoException e){
			System.out.println(e);
		}

	}

}