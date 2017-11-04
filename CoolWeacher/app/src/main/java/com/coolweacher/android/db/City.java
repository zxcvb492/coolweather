package com.coolweacher.android.db;
import org.litepal.crud.*;

// 市
public class City extends DataSupport
{
	// 市的 id,名字,代码,所属省份id
	private int id;
	private String cityName;
	private int cityCode;
	private int provinceId;

	//获取
	public int getId(){
		return id;
	}

	public String cityName(){
		return cityName;
	}

	public int getCityCode(){
		return cityCode;
	}
	
	public int getProvinceId(){
		return provinceId;
	}

	//设置
	public void setId(int id){
		this.id = id;
	}

	public void setCityName(String cityName){
		this.cityName = cityName;
	}

	public void setCityCode(int cityCode){
		this.cityCode = cityCode;
	}
	
	public void setProvinceId(int provinceId){
		this.provinceId = provinceId;
	}
}
