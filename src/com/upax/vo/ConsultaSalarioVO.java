package com.upax.vo;

public class ConsultaSalarioVO {

	private int EMPLOYEE_ID;
	private String START_DATE;
	private String END_DATE;
	private Integer P_RESULT;
	private String P_RESULT_DESC;

	public ConsultaSalarioVO(int eMPLOYEE_ID, String sTART_DATE, String eND_DATE, Integer p_RESULT,
			String p_RESULT_DESC) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		START_DATE = sTART_DATE;
		END_DATE = eND_DATE;
		P_RESULT = p_RESULT;
		P_RESULT_DESC = p_RESULT_DESC;
	}

	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}

	public String getSTART_DATE() {
		return START_DATE;
	}

	public void setSTART_DATE(String sTART_DATE) {
		START_DATE = sTART_DATE;
	}

	public String getEND_DATE() {
		return END_DATE;
	}

	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
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
		return "ConsultaSalarioVO [EMPLOYEE_ID=" + EMPLOYEE_ID + ", START_DATE=" + START_DATE + ", END_DATE=" + END_DATE
				+ ", P_RESULT=" + P_RESULT + ", P_RESULT_DESC=" + P_RESULT_DESC + "]";
	}

}
