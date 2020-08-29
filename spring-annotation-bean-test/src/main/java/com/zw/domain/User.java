package com.zw.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;

    public void init(){
        System.out.println(this.id+this.name+"初始化");
    }
    public void destory(){
        System.out.println(this.id+this.name+"销毁");
    }
}
