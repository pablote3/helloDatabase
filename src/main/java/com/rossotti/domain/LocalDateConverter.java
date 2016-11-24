package com.rossotti.domain;

import java.time.LocalDate;
import java.sql.Date;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate date) {
		return Date.valueOf(date);
	}

	@Override
	public LocalDate convertToEntityAttribute(Date value) {
		return value.toLocalDate();
	}
}
