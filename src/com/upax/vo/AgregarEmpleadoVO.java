package com.upax.vo;

public class AgregarEmpleadoVO {

	private int GENDER_ID;
	private int JOB_ID;
	private String NAME;
	private String LAST_NAME;
	private String BIRTHDATE;
	private Integer P_RESULT;
	private String P_RESULT_DESC;

	public AgregarEmpleadoVO(int gENDER_ID, int jOB_ID, String nAME, String lAST_NAME, String bIRTHDATE,
			Integer p_RESULT, String p_RESULT_DESC) {
		super();
		GENDER_ID = gENDER_ID;
		JOB_ID = jOB_ID;
		NAME = nAME;
		LAST_NAME = lAST_NAME;
		BIRTHDATE = bIRTHDATE;
		P_RESULT = p_RESULT;
		P_RESULT_DESC = p_RESULT_DESC;
	}

	public int getGENDER_ID() {
		return GENDER_ID;
	}

	public void setGENDER_ID(int gENDER_ID) {
		GENDER_ID = gENDER_ID;
	}

	public int getJOB_ID() {
		return JOB_ID;
	}

	public void setJOB_ID(int jOB_ID) {
		JOB_ID = jOB_ID;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getLAST_NAME() {
		return LAST_NAME;
	}

	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}

	public String getBIRTHDATE() {
		return BIRTHDATE;
	}

	public void setBIRTHDATE(String bIRTHDATE) {
		BIRTHDATE = bIRTHDATE;
	}

	public Integer getP_RESULT() {
		return P_RESULT;
	}

	public void setP_RESULT(Integer p_RESULT) {
		P_RESULT = p_RESULT;
	}

	public String getP_RESULT_DESC() {
		return P_RESULT_DESC;
	}

	public void setP_RESULT_DESC(String p_RESULT_DESC) {
		P_RESULT_DESC = p_RESULT_DESC;
	}

	@Override
	public String toString() {
		return "AgregarEmpleadoVO [GENDER_ID=" + GENDER_ID + ", JOB_ID=" + JOB_ID + ", NAME=" + NAME + ", LAST_NAME="
				+ LAST_NAME + ", BIRTHDATE=" + BIRTHDATE + ", P_RESULT=" + P_RESULT + ", P_RESULT_DESC=" + P_RESULT_DESC
				+ "]";
	}

}
