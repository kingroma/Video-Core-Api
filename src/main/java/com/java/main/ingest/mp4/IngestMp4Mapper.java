package com.java.main.ingest.mp4;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IngestMp4Mapper {
	
	public List<IngestMp4VO> list();
}
