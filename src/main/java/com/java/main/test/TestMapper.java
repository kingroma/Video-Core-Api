package com.java.main.test;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
	public String selectNow();
}
