package com.xinxin.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        ITeacherDao iTeacherDao = new TeacherDaoProxy(new TeacherDao());
        iTeacherDao.teach();
    }
}
