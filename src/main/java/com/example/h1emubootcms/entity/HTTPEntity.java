package com.example.h1emubootcms.entity;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

@Data
public  class HTTPEntity {
   private int code;
   private String message;
   private String data;

   public  static int success(){
      return  200;
   }

   public static   int error(){
      return  500;
   }

   public  static int notfound(){
      return 404;
   }


}
