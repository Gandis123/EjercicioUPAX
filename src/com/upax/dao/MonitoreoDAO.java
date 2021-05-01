package com.upax.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.upax.mybatis.MyBatisConfig;
import com.upax.vo.AgregarEmpleadoVO;
import com.upax.vo.ConsultaSalarioVO;
import com.upax.vo.ConsultarHorasVO;
import com.upax.vo.HorasTrabajadasVO;
import com.upax.vo.ServiceResponseVO;

public class MonitoreoDAO {

	private static final Logger logger = LogManager.getLogger();
	private MyBatisConfig conexion = new MyBatisConfig();
	
	public ServiceResponseVO agregarEmpleado(AgregarEmpleadoVO agregarEmpleadoVO) {
		logger.info("Agregar Empleado");
		ServiceResponseVO serviceResponseVO = new ServiceResponseVO();

		SqlSession session = null;
		try {
			SqlSessionFactory sqlSessionFactory = conexion.getConexionMybatis();
			session = sqlSessionFactory.openSession();

			int result;
			String resultDescription;
			
			result = session.insert("com.upax.mapper.SDMapper_StoreP.add_empleado", agregarEmpleadoVO);
			result = agregarEmpleadoVO.getP_RESULT();
			resultDescription = agregarEmpleadoVO.getP_RESULT_DESC();
			serviceResponseVO.setMensaje(resultDescription);

			if (result == 0) {
				serviceResponseVO.setSuccess(true);

			} else {
				serviceResponseVO.setSuccess(false);
			}

			logger.info("Resultado=" + result + "\n" + "Descripción=" + resultDescription + "\n");

		} catch (Exception e) {

			logger.error(" Error: Agregar Empleado ()", e);
			serviceResponseVO.setSuccess(false);
			serviceResponseVO.setMensaje(e.getMessage());

		} finally {
			if (session != null)
				session.close();
		}
		return serviceResponseVO;
	}
	
	public ServiceResponseVO agregarHorasTrabajadas(HorasTrabajadasVO horasTrabajadasVO) {
		logger.info("Horas Trabajadas");
		ServiceResponseVO serviceResponseVO = new ServiceResponseVO();

		SqlSession session = null;
		try {
			SqlSessionFactory sqlSessionFactory = conexion.getConexionMybatis();
			session = sqlSessionFactory.openSession();

			int result;
			String resultDescription;
			
			result = session.insert("com.upax.mapper.SDMapper_StoreP.add_horas", horasTrabajadasVO);
			result = horasTrabajadasVO.getP_RESULT();
			resultDescription = horasTrabajadasVO.getP_RESULT_DESC();
			serviceResponseVO.setMensaje(resultDescription);

			if (result == 0) {
				serviceResponseVO.setSuccess(true);

			} else {
				serviceResponseVO.setSuccess(false);
			}

			logger.info("Resultado=" + result + "\n" + "Descripción=" + resultDescription + "\n");

		} catch (Exception e) {

			logger.error(" Error: Agregar Horas trabajadas ()", e);
			serviceResponseVO.setSuccess(false);
			serviceResponseVO.setMensaje(e.getMessage());

		} finally {
			if (session != null)
				session.close();
		}
		return serviceResponseVO;
	}

	public ServiceResponseVO consultaHorasTrabajadas(ConsultarHorasVO consultarHorasVO) {
		logger.info("Consulta Horas Trabajadas");
		ServiceResponseVO serviceResponseVO = new ServiceResponseVO();

		SqlSession session = null;
		try {
			SqlSessionFactory sqlSessionFactory = conexion.getConexionMybatis();
			session = sqlSessionFactory.openSession();

			int result;
			String resultDescription;
			
			result = session.selectOne("com.upax.mapper.SDMapper_StoreP.select_horas", consultarHorasVO);
			result = consultarHorasVO.getP_RESULT();
			resultDescription = consultarHorasVO.getP_RESULT_DESC();
			serviceResponseVO.setMensaje(resultDescription);

			if (result == 0) {
				serviceResponseVO.setSuccess(true);

			} else {
				serviceResponseVO.setSuccess(false);
			}

			logger.info("Resultado=" + result + "\n" + "Descripción=" + resultDescription + "\n");

		} catch (Exception e) {

			logger.error(" Error: Consultar las Horas trabajadas ()", e);
			serviceResponseVO.setSuccess(false);
			serviceResponseVO.setMensaje(e.getMessage());

		} finally {
			if (session != null)
				session.close();
		}
		return serviceResponseVO;
	}
	
	public ServiceResponseVO consultaSalarioEmpleado(ConsultaSalarioVO consultaSalarioVO) {
		logger.info("Consulta Salario Empleado");
		ServiceResponseVO serviceResponseVO = new ServiceResponseVO();

		SqlSession session = null;
		try {
			SqlSessionFactory sqlSessionFactory = conexion.getConexionMybatis();
			session = sqlSessionFactory.openSession();

			int result;
			String resultDescription;
			
			result = session.selectOne("com.upax.mapper.SDMapper_StoreP.select_salario", consultaSalarioVO);
			result = consultaSalarioVO.getP_RESULT();
			resultDescription = consultaSalarioVO.getP_RESULT_DESC();
			serviceResponseVO.setMensaje(resultDescription);

			if (result == 0) {
				serviceResponseVO.setSuccess(true);

			} else {
				serviceResponseVO.setSuccess(false);
			}

			logger.info("Resultado=" + result + "\n" + "Descripción=" + resultDescription + "\n");

		} catch (Exception e) {

			logger.error(" Error: Consultar el salario del Empleado ()", e);
			serviceResponseVO.setSuccess(false);
			serviceResponseVO.setMensaje(e.getMessage());

		} finally {
			if (session != null)
				session.close();
		}
		return serviceResponseVO;
	}

}
