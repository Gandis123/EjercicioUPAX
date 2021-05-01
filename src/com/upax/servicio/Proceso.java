package com.upax.servicio;

import javax.jws.WebService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.upax.business.EventosBusiness;
import com.upax.vo.AgregarEmpleadoVO;
import com.upax.vo.ConsultaSalarioVO;
import com.upax.vo.ConsultarHorasVO;
import com.upax.vo.HorasTrabajadasVO;
import com.upax.vo.ResponseVO;

@WebService(endpointInterface = "com.upax.servicio.WebServiceInterface")
public class Proceso implements WebServiceInterface {

	private static final Logger logger = LogManager.getLogger();

	@Override
	public ResponseVO agregarEmpleado(int GENDER_ID, int JOB_ID, String NAME,
			String LAST_NAME, String BIRTHDATE) {

		AgregarEmpleadoVO agregarEmpleadoVO = new AgregarEmpleadoVO(GENDER_ID, JOB_ID, NAME,
				LAST_NAME, BIRTHDATE, null, null);
		ResponseVO responseVO = new EventosBusiness().agregarEmpleado(agregarEmpleadoVO);
		return responseVO;
	}
	
	@Override
	public ResponseVO agregarHorasTrabajadas(int EMPLOYEE_ID, int WORKED_HOURS, String WORKED_DATE) {

		HorasTrabajadasVO horasTrabajadasVO = new HorasTrabajadasVO(EMPLOYEE_ID, WORKED_HOURS, WORKED_DATE, null, null);
		ResponseVO responseVO = new EventosBusiness().agregarHorasTrabajadas(horasTrabajadasVO);
		return responseVO;
	}
	
	@Override
	public ResponseVO consultaHorasTrabajadas(int EMPLOYEE_ID, String START_DATE, String END_DATE) {

		ConsultarHorasVO consultarHorasVO = new ConsultarHorasVO(EMPLOYEE_ID, START_DATE, END_DATE, null, null);
		ResponseVO responseVO = new EventosBusiness().consultaHorasTrabajadas(consultarHorasVO);
		return responseVO;
	}
	
	@Override
	public ResponseVO consultaSalarioEmpleado(int EMPLOYEE_ID, String START_DATE, String END_DATE) {

		ConsultaSalarioVO consultaSalarioVO = new ConsultaSalarioVO(EMPLOYEE_ID, START_DATE, END_DATE, null, null);
		ResponseVO responseVO = new EventosBusiness().consultaSalarioEmpleado(consultaSalarioVO);
		return responseVO;
	}
	

}
