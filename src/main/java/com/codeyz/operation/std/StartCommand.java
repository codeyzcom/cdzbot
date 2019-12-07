package com.codeyz.operation.std;

import com.codeyz.kernel.database.model.User;
import com.codeyz.kernel.database.repository.UserRepository;
import com.codeyz.kernel.net.RequestObject;
import com.codeyz.middleware.types.Update;
import com.codeyz.operation.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(value = 1)
public class StartCommand implements Action {

    public static final String ACT_NAME = "/start";

    @Autowired
    private UserRepository userRepository;

    Boolean usePrivileges = true;

    private RequestObject ro;
    private Long chatId;
    private String text;
    Update update;

    public String getKey() {
        return ACT_NAME;
    }


    @Override
    public void setData(Update update) {
        this.update = update;
        chatId = update.getMessage().getChat().getId();
    }

    @Override
    public void perform() {



        User user = new User();
        if(!userRepository.existsUserBytIdAndFirstName(2, "Test")) {
            System.out.println("User doesn't exist! Will be create!");
            user.settId(2);
            user.setFirstName("Test");
            userRepository.save(user);
        } else {
            System.out.println("User Exist!");
        }

    }

    @Override
    public RequestObject getResult() {
        return null;
    }
}
