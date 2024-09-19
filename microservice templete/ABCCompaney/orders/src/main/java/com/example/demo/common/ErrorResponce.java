package com.example.demo.common;
import com.example.demo.D.T.O.OrderDTO;

import lombok.Getter;

@Getter
public class ErrorResponce  implements OrderResponce {
    private final String errormessage;
    public ErrorResponce (String errormessage){
        this.errormessage=errormessage;

    }

}
