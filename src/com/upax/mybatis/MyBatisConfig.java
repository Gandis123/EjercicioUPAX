package com.upax.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyBatisConfig {
	 private static final Logger logger = LogManager.getLogger();
	public SqlSessionFactory getConexionMybatis(){
		String resource = "mybatis.config.xml";
		InputStream inputStream=null;
		SqlSessionFactory sqlSessionFactory =null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			 if(inputStream!=null)
					inputStream.close();
		} catch (IOException e) {
			logger.error("Hubo un error a leer el archivo de configuracion de Mybatis",e);
		}finally {
			try {
			 if(inputStream!=null)
				inputStream.close();
			} catch (IOException e) {
				logger.error("Error al cerar el archivo de mybatis",e);
				
			}
		}
		
		return sqlSessionFactory;
	}
}
