package com.seiken_soft.lesson03.entity;

public class MEmploee {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_emploee.EMPLOYEE_ID
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    private String employeeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_emploee.EMPLOYEE_NAME
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    private String employeeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_emploee.E_MAILADDRESS
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    private String eMailaddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_emploee.EMPLOYEE_ID
     *
     * @return the value of m_emploee.EMPLOYEE_ID
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_emploee.EMPLOYEE_ID
     *
     * @param employeeId the value for m_emploee.EMPLOYEE_ID
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_emploee.EMPLOYEE_NAME
     *
     * @return the value of m_emploee.EMPLOYEE_NAME
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_emploee.EMPLOYEE_NAME
     *
     * @param employeeName the value for m_emploee.EMPLOYEE_NAME
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_emploee.E_MAILADDRESS
     *
     * @return the value of m_emploee.E_MAILADDRESS
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    public String geteMailaddress() {
        return eMailaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_emploee.E_MAILADDRESS
     *
     * @param eMailaddress the value for m_emploee.E_MAILADDRESS
     *
     * @mbg.generated Wed Feb 16 11:39:43 JST 2022
     */
    public void seteMailaddress(String eMailaddress) {
        this.eMailaddress = eMailaddress;
    }
}