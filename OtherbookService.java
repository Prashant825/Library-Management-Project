package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.OtherbookBean;
import com.example.demo.Model.Otherbook;
import com.example.demo.Repository.OtherbookRepository;

@Service
public class OtherbookService {
	
	@Autowired
	private OtherbookRepository otherbookRepo;

	public List<OtherbookBean> findAllByOthersidAndOthersem(String othersid, String othersem) {
		List<OtherbookBean> list = new ArrayList<OtherbookBean>();
		for(Otherbook otherbook : otherbookRepo.findAllByOthersidAndOthersem(othersid,othersem)) {
			list.add(new OtherbookBean (otherbook));
		}
		return list;
	}
	
	

}
