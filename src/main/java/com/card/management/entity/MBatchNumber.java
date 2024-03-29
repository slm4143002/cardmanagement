package com.card.management.entity;

import java.util.Date;

public class MBatchNumber {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column m_batch_number.id
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column m_batch_number.batch_number
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	private String batchNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column m_batch_number.machine_category_name
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	private String machineCategoryName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column m_batch_number.machine_count
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	private Byte machineCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column m_batch_number.car_count
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	private Byte carCount;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column m_batch_number.write_date
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	private Date writeDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column m_batch_number.delete_flg
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	private String deleteFlg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column m_batch_number.create_date
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	private Date createDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column m_batch_number.id
	 * @return  the value of m_batch_number.id
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column m_batch_number.id
	 * @param id  the value for m_batch_number.id
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column m_batch_number.batch_number
	 * @return  the value of m_batch_number.batch_number
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public String getBatchNumber() {
		return batchNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column m_batch_number.batch_number
	 * @param batchNumber  the value for m_batch_number.batch_number
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber == null ? null : batchNumber.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column m_batch_number.machine_category_name
	 * @return  the value of m_batch_number.machine_category_name
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public String getMachineCategoryName() {
		return machineCategoryName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column m_batch_number.machine_category_name
	 * @param machineCategoryName  the value for m_batch_number.machine_category_name
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public void setMachineCategoryName(String machineCategoryName) {
		this.machineCategoryName = machineCategoryName == null ? null : machineCategoryName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column m_batch_number.machine_count
	 * @return  the value of m_batch_number.machine_count
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public Byte getMachineCount() {
		return machineCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column m_batch_number.machine_count
	 * @param machineCount  the value for m_batch_number.machine_count
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public void setMachineCount(Byte machineCount) {
		this.machineCount = machineCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column m_batch_number.car_count
	 * @return  the value of m_batch_number.car_count
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public Byte getCarCount() {
		return carCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column m_batch_number.car_count
	 * @param carCount  the value for m_batch_number.car_count
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public void setCarCount(Byte carCount) {
		this.carCount = carCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column m_batch_number.write_date
	 * @return  the value of m_batch_number.write_date
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public Date getWriteDate() {
		return writeDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column m_batch_number.write_date
	 * @param writeDate  the value for m_batch_number.write_date
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column m_batch_number.delete_flg
	 * @return  the value of m_batch_number.delete_flg
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public String getDeleteFlg() {
		return deleteFlg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column m_batch_number.delete_flg
	 * @param deleteFlg  the value for m_batch_number.delete_flg
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg == null ? null : deleteFlg.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column m_batch_number.create_date
	 * @return  the value of m_batch_number.create_date
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column m_batch_number.create_date
	 * @param createDate  the value for m_batch_number.create_date
	 * @mbg.generated  Thu Feb 29 20:48:52 CST 2024
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}