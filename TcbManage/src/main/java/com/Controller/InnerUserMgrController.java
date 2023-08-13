package com.Controller;

import com.service.UserMgrServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 内部用户管理
 */
@Controller
@RequestMapping("/inner")
public class InnerUserMgrController {

    @Autowired
    private UserMgrServices userMgrServices;

    @RequestMapping(value = "/getUsers", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String getInnerUserList (@RequestParam String innerUserId) {
        return "{return success!}";
//        return userMgrServices.getInnerUsers(innerUserId);
    }

}
