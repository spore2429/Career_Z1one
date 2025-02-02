package boot.data.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.data.dto.User_BoardDto;
import boot.data.inter.CmBoardServiceInter;
import boot.data.mapper.CmBoardMapperInter;

@Service
public class CmBoardService implements CmBoardServiceInter {

	@Autowired
	CmBoardMapperInter mapper;
	
	@Override
	public void insertCmBoard(User_BoardDto dto) {
		// TODO Auto-generated method stub

		mapper.insertCmBoard(dto);
	}

	@Override
	public List<User_BoardDto> getBoards(int start, int perpage) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map=new HashMap<>();
		map.put("start", start);
		map.put("perpage", perpage);
		
		return mapper.getBoards(map);
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return mapper.getTotalCount();
	}

	@Override
	public int getMaxNum() {
		// TODO Auto-generated method stub
		return mapper.getMaxNum();
	}

	@Override
	public User_BoardDto getData(String num) {
		// TODO Auto-generated method stub
		return mapper.getData(num);
	}

	@Override
	public void updateReadCount(String num) {
		// TODO Auto-generated method stub
		mapper.updateReadCount(num);
	}

	@Override
	public String getEmail(String num) {
		// TODO Auto-generated method stub
		return mapper.getEmail(num);
	}

}
