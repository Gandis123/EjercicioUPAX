package com.upax.servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.upax.vo.ResponseVO;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface WebServiceInterface {

	@WebMethod
	ResponseVO agregarEmpleado(@WebParam(name = "GENDER_ID") int GENDER_ID, @WebParam(name = "JOB_ID") int JOB_ID,
			@WebParam(name = "NAME") String NAME, @WebParam(name = "LAST_NAME") String LAST_NAME,
			@WebParam(name = "BIRTHDATE") String BIRTHDATE);
	
	@WebMethod
	ResponseVO agregarHorasTrabajadas(@WebParam(name = "EMPLOYEE_ID") int EMPLOYEE_ID, @WebParam(name = "WORKED_HOURS") int WORKED_HOURS,
			@WebParam(name = "WORKED_DATE") String WORKED_DATE);
	
	@WebMethod
	ResponseVO consultaHorasTrabajadas(@WebParam(name = "EMPLOYEE_ID") int EMPLOYEE_ID, @WebParam(name = "START_DATE") String START_DATE,
			@WebParam(name = "END_DATE") String END_DATE);

	@WebMethod
	ResponseVO consultaSalarioEmpleado(@WebParam(name = "EMPLOYEE_ID") int EMPLOYEE_ID, @WebParam(name = "START_DATE") String START_DATE,
			@WebParam(name = "END_DATE") String END_DATE);

}