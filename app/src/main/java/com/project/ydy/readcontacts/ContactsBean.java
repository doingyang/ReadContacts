package com.project.ydy.readcontacts;

/**
 * **************************************************
 * 文件名称 : ContactsBean
 * 作    者 : Created by ydy
 * 创建时间 : 2018/6/19 15:06
 * 文件描述 :
 * 注意事项 :
 * 修改历史 : 2018/6/19 1.00 初始版本
 * **************************************************
 */
public class ContactsBean {

    private String contactId;
    private String displayName;
    private String phoneNumber;

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
