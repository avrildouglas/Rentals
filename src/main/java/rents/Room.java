package rents;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long modRoomId;
	private String modRmNum;
	private String modAddress;
	private String modCity;
	private String modState;
	private String modZipCode;
	private String modPrice;
	private String modDescript;
	private String modRules;
	private String modWifi;
	private String modCable;
	private String modPBath;
	
	
	public long getModRoomId() {
		return modRoomId;
	}
	
	public String getModRmNum() {
		return modRmNum;
	}

	public void setModRmNum(String modRmNum) {
		this.modRmNum = modRmNum;
	}

	
	public void setModRoomId(long modRoomId) {
		this.modRoomId = modRoomId;
	}
	
	public String getModAddress() {
		return modAddress;
	}
	
	public void setModAddress(String modAddress) {
		this.modAddress = modAddress;
	}
	
	public String getModCity() {
		return modCity;
	}
	
	public void setModCity(String modCity) {
		this.modCity = modCity;
	}
	
	public String getModState() {
		return modState;
	}
	
	public void setModState(String modState) {
		this.modState = modState;
	}
	
	public String getModZipCode() {
		return modZipCode;
	}

	public void setModZipCode(String modZipCode) {
		this.modZipCode = modZipCode;
	}

	public String getModPrice() {
		return modPrice;
	}
	
	public void setModPrice(String modPrice) {
		this.modPrice = modPrice;
	}
	
	public String getModDescript() {
		return modDescript;
	}

	public void setModDescript(String modDescript) {
		this.modDescript = modDescript;
	}

	public String getModRules() {
		return modRules;
	}

	public void setModRules(String modRules) {
		this.modRules = modRules;
	}

	public String getModWifi() {
		return modWifi;
	}

	public void setModWifi(String modWifi) {
		this.modWifi = modWifi;
	}

	public String getModCable() {
		return modCable;
	}

	public void setModCable(String modCable) {
		this.modCable = modCable;
	}

	public String getModPBath() {
		return modPBath;
	}

	public void setModPBath(String modPBath) {
		this.modPBath = modPBath;
	}

}
