package ro.ase.acs.example1;

public class EmployeeStudent {
	int salaryPerHour;
	//int salary;	//redundant- can be computed
	int hours;

	public void reportHours(int addHours) {
		hours+=addHours;
		//salary=salaryPerHour*hours;
		
	}
	
	public int getFullSalary() {
		return hours*salaryPerHour;
	}
	
	
	
	public String getExam(int examNumber) throws Exception {
		
		String[] exams= {ConstantVariables.EXAM_OOP, ConstantVariables.EXAM_JAVA,ConstantVariables.EXAM_DS,
				ConstantVariables.EXAM_CS, ConstantVariables.EXAM_STAT};
		if(examNumber!=0&&examNumber<=exams.length) {
			return exams[examNumber-1];
		}
		else {
			 throw new Exception("exam must be in range 1 to 5");
		}
//	    switch (numberExam) {
//	        case 1:
//	            return ConstantVariables.EXAM_OOP;
//	        case 2:
//	            return  ConstantVariables.EXAM_JAVA;
//	        case 3:
//	            return ConstantVariables.EXAM_DS;
//	        case 4:
//	            return ConstantVariables.EXAM_CS;
//	        case 5:
//	            return ConstantVariables.EXAM_STAT;
//	        
//	        default:
//	            throw new Exception("exam must be in range 1 to 5");
//	    }
	}
}

