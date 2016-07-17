package com.awinson.test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.net.SocketException;
import java.util.List;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Store;

import org.apache.commons.net.pop3.POP3Client;
import org.apache.commons.net.pop3.POP3MessageInfo;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.junit.Test;

import com.awinson.common.dto.MailDto;
import com.awinson.common.util.Pop3Utils;

public class CommonTest {
	private static Logger logger = Logger.getLogger(CommonTest.class);



	@Test
	public void test2() {
		List<MailDto> list = Pop3Utils.connect("pop.163.com", "110", "15625812012@163.com", "w612869");
		for (MailDto mailDto : list) {
			logger.info(mailDto);
		}
	}
		
}
