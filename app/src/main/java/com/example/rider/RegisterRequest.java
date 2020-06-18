package com.example.rider;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {  //회원가입 시켜라 요청하는 클래스

    final static private String URL ="http://192.168.0.2/UserRegister.php"; //웹서버 주소 쓰면 된다
    private Map<String, String> parameters;

    public RegisterRequest(String userID, String userPassword, String userGender, String userEmail, String userAddress, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
        parameters.put("userGender", userGender);
        parameters.put("userEmail", userEmail);
        parameters.put("userAddress", userAddress);

    }

    @Override
    public Map<String, String> getParams() {
        return parameters;
    }
}
