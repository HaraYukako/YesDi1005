package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

////SpringBoot機能を使用してJunitテストを行いますという意味
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class WebTestForGroup {

	//Webサーバーを起動しなくてもあたかも同じようにふるまってくれるクラス
	private MockMvc mockMvc;

	//対象となるクラスの定義（テストしたい）
	@Autowired
	GroupController target;

	//毎処理ごとに必要な前処理を実行する
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(target).build();
	}

	//テストする
	@Test
	public void isStatusTest() throws Exception {
		// /inputでアクセスして、statusがOKになるかのテスト
		mockMvc.perform(get("/group_input")).andExpect(status().isOk());
	}

}
