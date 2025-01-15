package com.dreamteam.mannhibooking.projections;

import java.math.BigDecimal;

public interface DetailRoom {
	String getName();
	Integer getTotalPeople();
	Integer getTotalBed();
	BigDecimal getPrice();
}
