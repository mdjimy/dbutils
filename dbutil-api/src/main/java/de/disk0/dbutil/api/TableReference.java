package de.disk0.dbutil.api;

import de.disk0.dbutil.api.entities.BaseEntity;

public interface TableReference extends SqlFragment {
	
	String getAlias();

	String getName();

	JoinTable leftJoin(String table);
	JoinTable leftJoin(Class<? extends BaseEntity<?>> table);
	
	JoinTable join(String table);
	JoinTable join(Class<? extends BaseEntity<?>> table);

	Field field(String fieldname);
	Field value(Object value);
	Field field(Aggregate a, Field... fr);
	Field field(Aggregate a, String fieldName);
	
}
