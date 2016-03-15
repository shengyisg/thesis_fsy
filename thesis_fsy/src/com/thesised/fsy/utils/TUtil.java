package com.thesised.fsy.utils;

import java.lang.reflect.ParameterizedType;

public class TUtil {
	
	/*T·ºÐÍ×ª»»*/
	public static Class getActualType(Class entity) {
		ParameterizedType parameterizedType= (ParameterizedType)entity.getGenericSuperclass();
		Class entityClass=(Class) parameterizedType.getActualTypeArguments()[0];
		return entityClass;
	}
	
}
