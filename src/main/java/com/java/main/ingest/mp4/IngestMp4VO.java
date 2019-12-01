package com.java.main.ingest.mp4;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import mp4.metadata.Mp4MetaModel;

/**
 * create table TB_INGEST_MP4 (
	INGEST_ID NVARCHAR(30) PRIMARY KEY ,
    PATH NVARCHAR(1000) 
);
*/
public class IngestMp4VO extends Mp4MetaModel{
	
	@Autowired
	public ObjectMapper objectMapper;
	
	private String ingestId = null ;
	
	private String path = null ;

	public String getIngestId() {
		return ingestId;
	}

	public void setIngestId(String ingestId) {
		this.ingestId = ingestId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	@Override
	public String toString() {
		String ret = null ; 
		try {
			// objectMapper.writeValueAsString(this);
			ret += ingestId ; 
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ret ; 
	}
	
}
