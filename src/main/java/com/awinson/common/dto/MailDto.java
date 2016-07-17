package com.awinson.common.dto;

import java.util.Date;

public class MailDto {
	Integer messageNumber;
	String subject;
	String from;
	String receiveAddress;
	String sentDate;
	boolean seen;
	String priority;
	boolean replySign;
	Integer size;
	boolean containAttachment;
	String content;
	String digest;

	public Integer getMessageNumber() {
		return messageNumber;
	}

	public void setMessageNumber(Integer messageNumber) {
		this.messageNumber = messageNumber;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getReceiveAddress() {
		return receiveAddress;
	}

	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}

	public String getSentDate() {
		return sentDate;
	}

	public void setSentDate(String sentDate) {
		this.sentDate = sentDate;
	}

	public boolean isSeen() {
		return seen;
	}

	public void setSeen(boolean seen) {
		this.seen = seen;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public boolean isReplySign() {
		return replySign;
	}

	public void setReplySign(boolean replySign) {
		this.replySign = replySign;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public boolean isContainAttachment() {
		return containAttachment;
	}

	public void setContainAttachment(boolean containAttachment) {
		this.containAttachment = containAttachment;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	@Override
	public String toString() {
		return "MailDto [messageNumber=" + messageNumber + ", subject=" + subject + ", from=" + from
				+ ", receiveAddress=" + receiveAddress + ", sentDate=" + sentDate + ", seen=" + seen + ", priority="
				+ priority + ", replySign=" + replySign + ", size=" + size + ", containAttachment=" + containAttachment
				+ ", digest=" + digest + "]";
	}

}
