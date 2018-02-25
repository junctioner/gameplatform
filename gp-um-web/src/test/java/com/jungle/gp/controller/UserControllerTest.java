package com.jungle.gp.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.hamcrest.Matchers.equalTo;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.jungle.gp.BaseMvcTest;

public class UserControllerTest extends BaseMvcTest {

    @Test
    public void testWelcome() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/user/find")
                .param("id", "1")
                .accept(MediaType.APPLICATION_JSON)
        )
        //响应状态比较
        .andExpect(status().isOk())
        .andDo(print())
        //json格式结果取指定属性值作比较
        .andExpect(MockMvcResultMatchers.jsonPath("$.status").value(true))
        //.andExpect(content().string(equalTo("hello world!")))
        ;
    }
}
