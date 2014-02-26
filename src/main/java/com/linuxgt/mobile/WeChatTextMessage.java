package com.linuxgt.mobile;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: LIUTENG
 * Date: 13-5-3
 * Time: 下午1:13
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement(name = "xml")
public class WeChatTextMessage {
    private String xml;
    private String toUserName;
    private String fromUserName;

    @Override
    public String toString() {
        return "WeChatTextMessage{" +
                "xml='" + xml + '\'' +
                ", toUserName='" + toUserName + '\'' +
                ", fromUserName='" + fromUserName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", msgType='" + msgType + '\'' +
                ", content='" + content + '\'' +
                ", msgId='" + msgId + '\'' +
                '}';
    }

    private String createTime;
    private String msgType;

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getToUserName() {
        return toUserName;
    }

    public void setToUserName(String toUserName) {
        this.toUserName = toUserName;
    }

    public String getFromUserName() {
        return fromUserName;
    }

    public void setFromUserName(String fromUserName) {
        this.fromUserName = fromUserName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    private String content;
    private String msgId;
}
