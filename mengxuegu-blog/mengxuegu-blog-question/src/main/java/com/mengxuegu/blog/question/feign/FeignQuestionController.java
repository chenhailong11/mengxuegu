//package com.mengxuegu.blog.question.feign;
//
//import com.mengxuegu.blog.feign.IFeignQuestionController;
//import com.mengxuegu.blog.feign.req.UserInfoREQ;
//import com.mengxuegu.blog.question.service.IQuestionService;
//import org.springframework.beans.factory.annotation.Autowired;
//
///**
// * @author: KING
// * @description:
// * @Date:Created in 2020-10-31 12:25
// */
//public class FeignQuestionController implements IFeignQuestionController {
//    @Autowired
//    private IQuestionService questionService;
//    @Override
//    public boolean updateUserInfo(UserInfoREQ req) {
//        return questionService.updateUserInfo(req);
//    }
//}
