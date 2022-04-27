package com.zjh.Register;

public class WebRegister {
    private String phoneNumber;
    public String email;
    public String id;

    public WebRegister(String phoneNumber, String email, String id) {
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.id = id;
    }

    public WebRegister() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //注册方法
    public void register(WebRegister webRegister){
        boolean flag = true;
        if(!testPhoneNumber(webRegister.phoneNumber)){
            System.out.println("手机号格式有误");
            flag = false;
        }
        if(!testEmail(webRegister.email)){
            System.out.println("邮件地址格式有误");
            flag = false;
        }
        if(!testId(webRegister.id)){
            System.out.println("身份证有误");
            flag = false;
        }
        if(flag == true){
            System.out.println("注册成功！");
        }
    }
    //测试手机号码
    public boolean testPhoneNumber(String phone){
        return phone.matches("^(13[0-9]|14[5|7]|15[0|1|2|3|4|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$");
    }
    //测试邮件地址
    public boolean testEmail(String email){
        return email.matches("^\\w+@\\w+(\\.\\w+)+$");
    }
    //测试身份证号码
    public boolean testId(String id){
        return id.matches("(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)");
    }
}
