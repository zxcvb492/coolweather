package com.coolweacher.android.db;
import org.litepal.crud.*;

// 省
public class Province extends DataSupport
{
	// 省的 id,,名字,代码
	private int id;
	private String provinceName;
	private int provinceCode;
	
	//获取
	public int getId(){
		return id;
	}
	
	public String getProvinceName(){
		return provinceName;
	}
	
	public int getProvinceCode(){
		return provinceCode;
	}
	
	//设置
	public void setId(int id){
		this.id = id;
	}
	
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}
	
	public void setProvinceCode(int provinceCode){
		this.provinceCode = provinceCode;
	}
}
