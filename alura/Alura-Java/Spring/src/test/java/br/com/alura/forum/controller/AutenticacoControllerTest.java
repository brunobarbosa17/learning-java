//package br.com.alura.forum.controller;
//
//
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.net.URI;
//import java.net.URISyntaxException;
//
//@RunWith(SpringRunner.class)
//@ActiveProfiles("test")
//@AutoConfigureMockMvc
//@SpringBootTest
//public class AutenticacoControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void responseStatus400WithIncorrectData() throws Exception {
//        URI uri = new URI("/auth");
//        String json = "{\"email\":\"invalido@email.com\", \"senha\":\"123456}\"";
//        //JSONObject json = new JSONObject();
//        //json.put("email", "invalido@email.com");
//
//        mockMvc
//                .perform(MockMvcRequestBuilders
//                        .post(uri)
//                        .content(json)
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(MockMvcResultMatchers
//                        .status()
//                        .is(400));
//    }
//}
