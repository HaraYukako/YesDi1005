package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {

	private final GroupRepository groupRepository;

	//ShainRepositoryのDI
	public GroupServiceImpl(GroupRepository groupRepository) {
		this.groupRepository = groupRepository;
	}

	@Override
	public String findByNo(String number) {
		//リポジトリから社員を選択
		String name = groupRepository.selectByNo(number);
		return name;
	}

}