package com.java.main.ingest.mp4;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ingestMp4Service")
public class IngestMp4ServiceImpl implements IngestMp4Service{

	@Autowired
	public IngestMp4Mapper ingestMp4Mapper;
	
	@Override
	public List<IngestMp4VO> list(){
		return ingestMp4Mapper.list();
	}
}
