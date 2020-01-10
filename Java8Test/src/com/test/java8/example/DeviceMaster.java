package com.test.java8.example;

import java.util.Arrays;
import java.util.List;

public class DeviceMaster {
	String reasonCode;
	String deviceType;
	String reasonDesc;
	List<String> limitingComponent;	
	public DeviceMaster(String reasonCode, String deviceType, String reasonDesc, List<String> limitingComponent) {
		super();
		this.reasonCode = reasonCode;
		this.deviceType = deviceType;
		this.reasonDesc = reasonDesc;
		this.limitingComponent = limitingComponent;
	}
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getReasonDesc() {
		return reasonDesc;
	}
	public void setReasonDesc(String reasonDesc) {
		this.reasonDesc = reasonDesc;
	}
	public List<String> getLimitingComponent() {
		return limitingComponent;
	}
	public void setLimitingComponent(List<String> limitingComponent) {
		this.limitingComponent = limitingComponent;
	}
	@Override
	public String toString() {
		return "DeviceMaster [reasonCode=" + reasonCode + ", deviceType=" + deviceType + ", reasonDesc=" + reasonDesc
				+ ", limitingComponent=" + limitingComponent + "]";
	}
	
}
