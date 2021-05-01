package com.upax.vo;

public class HorasTrabajadasVO {

	private int EMPLOYEE_ID;
	private int WORKED_HOURS;
	private String WORKED_DATE;
	private Integer P_RESULT;
	private String P_RESULT_DESC;

	public HorasTrabajadasVO(int eMPLOYEE_ID, int wORKED_HOURS, String wORKED_DATE, Integer p_RESULT,
			String p_RESULT_DESC) {
		super();
		EMPLOYEE_ID = eMPLOYEE_ID;
		WORKED_HOURS = wORKED_HOURS;
		WORKED_DATE = wORKED_DATE;
		P_RESULT = p_RESULT;
		P_RESULT_DESC = p_RESULT_DESC;
	}

	public int getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}

	public void setEMPLOYEE_ID(int eMPLOYEE_ID) {
		EMPLOYEE_ID = eMPLOYEE_ID;
	}

	public int getWORKED_HOURS() {
		return WORKED_HOURS;
	}

	public void setWORKED_HOURS(int wORKED_HOURS) {
		WORKED_HOURS = wORKED_HOURS;
	}

	public String getWORKED_DATE() {
		return WORKED_DATE;
	}

	public void setWORKED_DATE(String wORKED_DATE) {
		WORKED_DATE = wORKED_DATE;
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
		return "HorasTrabajadasVO [EMPLOYEE_ID=" + EMPLOYEE_ID + ", WORKED_HOURS=" + WORKED_HOURS + ", WORKED_DATE="
				+ WORKED_DATE + ", P_RESULT=" + P_RESULT + ", P_RESULT_DESC=" + P_RESULT_DESC + "]";
	}

}
