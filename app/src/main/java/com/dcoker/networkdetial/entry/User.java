package com.dcoker.networkdetial.entry;

import java.io.Serializable;

/**
 * Created by Mr.Zhang on 2017/6/27.
 */

public class User implements Serializable {

    private int uid;

    private int puid;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", puid=" + puid +
                ", cid_fk=" + cid_fk +
                ", nick='" + nick + '\'' +
                ", sex=" + sex +
                ", age='" + age + '\'' +
                ", birthday='" + birthday + '\'' +
                ", profession='" + profession + '\'' +
                ", mail='" + mail + '\'' +
                ", icon='" + icon + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", invitecode='" + invitecode + '\'' +
                ", child=" + child +
                ", grandson=" + grandson +
                ", gid_fk=" + gid_fk +
                ", coin=" + coin +
                ", paycoin='" + paycoin + '\'' +
                ", mastercoin=" + mastercoin +
                ", firstcoop=" + firstcoop +
                ", currentcoop=" + currentcoop +
                ", firstcountry=" + firstcountry +
                ", currentcountry=" + currentcountry +
                ", firstversion='" + firstversion + '\'' +
                ", currentversion='" + currentversion + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", status=" + status +
                ", pop=" + pop +
                ", langs='" + langs + '\'' +
                ", State='" + State + '\'' +
                ", initcoin=" + initcoin +
                ", initcoininvite=" + initcoininvite +
                ", cash_user_signin='" + cash_user_signin + '\'' +
                ", cash_user_total_sign='" + cash_user_total_sign + '\'' +
                '}';
    }

    private int cid_fk;

    private String nick;

    private int sex;

    private String age;

    private String birthday;

    private String profession;

    private String mail;

    private String icon;

    private String phone;

    private String password;

    private String invitecode;

    private int child;

    private int grandson;

    private int gid_fk;

    private int coin;

    private String paycoin;

    private int mastercoin;

    private int firstcoop;

    private int currentcoop;

    private int firstcountry;

    private int currentcountry;

    private String firstversion;

    private String currentversion;

    private int createtime;

    private int updatetime;

    private int status;

    private int pop;

    private String langs;

    private String State;

    private int initcoin;

    private int initcoininvite;

    private String cash_user_signin;

    private String cash_user_total_sign;

    public void setUid(int uid){
        this.uid = uid;
    }
    public int getUid(){
        return this.uid;
    }
    public void setPuid(int puid){
        this.puid = puid;
    }
    public int getPuid(){
        return this.puid;
    }
    public void setCid_fk(int cid_fk){
        this.cid_fk = cid_fk;
    }
    public int getCid_fk(){
        return this.cid_fk;
    }
    public void setNick(String nick){
        this.nick = nick;
    }
    public String getNick(){
        return this.nick;
    }
    public void setSex(int sex){
        this.sex = sex;
    }
    public int getSex(){
        return this.sex;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAge(){
        return this.age;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public String getBirthday(){
        return this.birthday;
    }
    public void setProfession(String profession){
        this.profession = profession;
    }
    public String getProfession(){
        return this.profession;
    }
    public void setMail(String mail){
        this.mail = mail;
    }
    public String getMail(){
        return this.mail;
    }
    public void setIcon(String icon){
        this.icon = icon;
    }
    public String getIcon(){
        return this.icon;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setInvitecode(String invitecode){
        this.invitecode = invitecode;
    }
    public String getInvitecode(){
        return this.invitecode;
    }
    public void setChild(int child){
        this.child = child;
    }
    public int getChild(){
        return this.child;
    }
    public void setGrandson(int grandson){
        this.grandson = grandson;
    }
    public int getGrandson(){
        return this.grandson;
    }
    public void setGid_fk(int gid_fk){
        this.gid_fk = gid_fk;
    }
    public int getGid_fk(){
        return this.gid_fk;
    }
    public void setCoin(int coin){
        this.coin = coin;
    }
    public int getCoin(){
        return this.coin;
    }
    public void setPaycoin(String paycoin){
        this.paycoin = paycoin;
    }
    public String getPaycoin(){
        return this.paycoin;
    }
    public void setMastercoin(int mastercoin){
        this.mastercoin = mastercoin;
    }
    public int getMastercoin(){
        return this.mastercoin;
    }
    public void setFirstcoop(int firstcoop){
        this.firstcoop = firstcoop;
    }
    public int getFirstcoop(){
        return this.firstcoop;
    }
    public void setCurrentcoop(int currentcoop){
        this.currentcoop = currentcoop;
    }
    public int getCurrentcoop(){
        return this.currentcoop;
    }
    public void setFirstcountry(int firstcountry){
        this.firstcountry = firstcountry;
    }
    public int getFirstcountry(){
        return this.firstcountry;
    }
    public void setCurrentcountry(int currentcountry){
        this.currentcountry = currentcountry;
    }
    public int getCurrentcountry(){
        return this.currentcountry;
    }
    public void setFirstversion(String firstversion){
        this.firstversion = firstversion;
    }
    public String getFirstversion(){
        return this.firstversion;
    }
    public void setCurrentversion(String currentversion){
        this.currentversion = currentversion;
    }
    public String getCurrentversion(){
        return this.currentversion;
    }
    public void setCreatetime(int createtime){
        this.createtime = createtime;
    }
    public int getCreatetime(){
        return this.createtime;
    }
    public void setUpdatetime(int updatetime){
        this.updatetime = updatetime;
    }
    public int getUpdatetime(){
        return this.updatetime;
    }
    public void setStatus(int status){
        this.status = status;
    }
    public int getStatus(){
        return this.status;
    }
    public void setPop(int pop){
        this.pop = pop;
    }
    public int getPop(){
        return this.pop;
    }
    public void setLangs(String langs){
        this.langs = langs;
    }
    public String getLangs(){
        return this.langs;
    }
    public void setState(String State){
        this.State = State;
    }
    public String getState(){
        return this.State;
    }
    public void setInitcoin(int initcoin){
        this.initcoin = initcoin;
    }
    public int getInitcoin(){
        return this.initcoin;
    }
    public void setInitcoininvite(int initcoininvite){
        this.initcoininvite = initcoininvite;
    }
    public int getInitcoininvite(){
        return this.initcoininvite;
    }
    public void setCash_user_signin(String cash_user_signin){
        this.cash_user_signin = cash_user_signin;
    }
    public String getCash_user_signin(){
        return this.cash_user_signin;
    }
    public void setCash_user_total_sign(String cash_user_total_sign){
        this.cash_user_total_sign = cash_user_total_sign;
    }
    public String getCash_user_total_sign(){
        return this.cash_user_total_sign;
    }

}
