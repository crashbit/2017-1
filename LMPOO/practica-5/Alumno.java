public class Alumno{


	void evalua(int cal) throws AlumnoException{

		if(cal<6){
			throw new AlumnoException("Esta por reprobar este alumno");
		}

	}

}