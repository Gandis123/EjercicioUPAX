package com.upax.business;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.upax.dao.MonitoreoDAO;
import com.upax.vo.AgregarEmpleadoVO;
import com.upax.vo.ConsultaSalarioVO;
import com.upax.vo.ConsultarHorasVO;
import com.upax.vo.HorasTrabajadasVO;
import com.upax.vo.ResponseVO;
import com.upax.vo.ServiceResponseVO;

public class EventosBusiness {

	private static final Logger logger = LogManager.getLogger();

	
	public ResponseVO agregarEmpleado(AgregarEmpleadoVO agregarEmpleadoVO) {
		logger.info("***Agregar Empleado***" + agregarEmpleadoVO.toString());

		MonitoreoDAO empleado = new MonitoreoDAO();
		ServiceResponseVO serviceResponseVO = empleado.agregarEmpleado(agregarEmpleadoVO);
		ResponseVO responseVO = new ResponseVO();

		if (serviceResponseVO.isSuccess()) {
			responseVO.setIdResult(0);
			responseVO.setId(serviceResponseVO.getResult().toString());
		} else {
			responseVO.setIdResult(-1);
		}

		responseVO.setResultDescr(serviceResponseVO.getMensaje());

		return responseVO;

	}
	
	public ResponseVO agregarHorasTrabajadas(HorasTrabajadasVO horasTrabajadasVO) {
		logger.info("***Agregar Horas Trabajadas***" + horasTrabajadasVO.toString());

		MonitoreoDAO horas = new MonitoreoDAO();
		ServiceResponseVO serviceResponseVO = horas.agregarHorasTrabajadas(horasTrabajadasVO);
		ResponseVO responseVO = new ResponseVO();

		if (serviceResponseVO.isSuccess()) {
			responseVO.setIdResult(0);
			responseVO.setId(serviceResponseVO.getResult().toString());
		} else {
			responseVO.setIdResult(-1);
		}

		responseVO.setResultDescr(serviceResponseVO.getMensaje());

		return responseVO;

	}
	
	public ResponseVO consultaHorasTrabajadas(ConsultarHorasVO consultarHorasVO) {
		logger.info("***Consulta Horas Trabajadas***" + consultarHorasVO.toString());

		MonitoreoDAO consulta_horas = new MonitoreoDAO();
		ServiceResponseVO serviceResponseVO = consulta_horas.consultaHorasTrabajadas(consultarHorasVO);
		ResponseVO responseVO = new ResponseVO();

		if (serviceResponseVO.isSuccess()) {
			responseVO.setIdResult(0);
			responseVO.setId(serviceResponseVO.getResult().toString());
		} else {
			responseVO.setIdResult(-1);
		}

		responseVO.setResultDescr(serviceResponseVO.getMensaje());

		return responseVO;

	}
	
	public ResponseVO consultaSalarioEmpleado(ConsultaSalarioVO consultaSalarioVO) {
		logger.info("***Consulta Salario Empleado ***" + consultaSalarioVO.toString());

		MonitoreoDAO consulta_salario = new MonitoreoDAO();
		ServiceResponseVO serviceResponseVO = consulta_salario.consultaSalarioEmpleado(consultaSalarioVO);
		ResponseVO responseVO = new ResponseVO();

		if (serviceResponseVO.isSuccess()) {
			responseVO.setIdResult(0);
			responseVO.setId(serviceResponseVO.getResult().toString());
		} else {
			responseVO.setIdResult(-1);
		}

		responseVO.setResultDescr(serviceResponseVO.getMensaje());

		return responseVO;

	}
	
	

}
