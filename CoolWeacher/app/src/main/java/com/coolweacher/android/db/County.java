package com.coolweacher.android.db;
import org.litepal.crud.*;

// 县
public class County extends DataSupport
{
	//县城 id,名字,天气代码,所属城市
	private int id;
	private String countyName;
	private String weatherId;
	private int cityId;

	//获取
	public int getId(){
		return id;
	}

	public String countyName(){
		return countyName;
	}

	public String weatherId(){
		return weatherId;
	}

	public int getCityId(){
		return cityId;
	}

	//设置
	public void setId(int id){
		this.id = id;
	}

	public void setCountyName(String countyName){
		this.countyName = countyName;
	}

	public void setWeatherId(String weatherId){
		this.weatherId = weatherId;
	}

	public void setCityId(int cityId){
		this.cityId = cityId;
	}
}
