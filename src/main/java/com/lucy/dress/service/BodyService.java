package com.lucy.dress.service;

import com.lucy.dress.service.bean.BodyBean;

public interface BodyService {

    void BuildBody(int height, int weight); // 补充肩宽，腰围，臀围

    BodyBean getBody(int bodyId);
}
