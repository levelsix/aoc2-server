package com.lvl6.aoc2.services.equipment;

import org.springframework.beans.factory.annotation.Autowired;

import com.lvl6.aoc2.entitymanager.staticdata.EquipmentRetrieveUtils;

public class EquipmentServiceImpl implements EquipmentService {
	
	@Autowired
	protected EquipmentRetrieveUtils equipmentRetrieveUtils;

	
	
	@Override
	public EquipmentRetrieveUtils getEquipmentRetrieveUtils() {
		return equipmentRetrieveUtils;
	}

	@Override
	public void setEquipmentRetrieveUtils(
			EquipmentRetrieveUtils equipmentRetrieveUtils) {
		this.equipmentRetrieveUtils = equipmentRetrieveUtils;
	}
	
}