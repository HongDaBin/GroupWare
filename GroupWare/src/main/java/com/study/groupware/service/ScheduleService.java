package com.study.groupware.service;

import java.util.List;
import java.util.Map;

import com.study.groupware.vo.ScheduleVO;

public interface ScheduleService {

	public List<ScheduleVO> selectSchedule(Map params) throws Exception;
	public int insertSchedule(ScheduleVO vo) throws Exception;
	
	public ScheduleVO readSchedule(Map params) throws Exception;
	public int updateSchedule(Map params) throws Exception;
	public int deleteSchedule(Map params) throws Exception;
}
